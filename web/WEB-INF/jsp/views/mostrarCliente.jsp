<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="cabecera.jsp" %>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.23/js/dataTables.bootstrap.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
<link href="https://cdn.datatables.net/1.10.23/css/dataTables.bootstrap.min.css"/>


<script >$(document).ready( function () {
    $('#tabla').DataTable({
        "info":true,
        "pagin":true,
        "buttons":true,
        "lenghMenu":[5,10,25,50,"All"],
        "language":{"url": "https://cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json"},
        //--"buttons": ['copy'],[ 'excel'],[ 'pdf'],---//
        "paginate":true,
    });
});
</script>
            <h1>Conexión a Bases de Datos MYSql</h1>
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a href="agregarCliente.htm" class="btn btn-primary">Agregar Cliente</a>
                </div>
                <div class="card-body ">
                    <table id="tabla" class="table table-bordered table-striped table-hover">
                        <thead>
                            <th>id</th>
                            <th>nombre</th>
                            <th>direccion</th>
                            <th>correo</th>
                            <th>telefono</th>
                            <th>Acciones</th>
                        </thead>
                        <tbody>
                            <c:forEach items="${cliente}" var="dato">
                            <tr>
                                <td><c:out value="${dato.id_cli}"></c:out></td>
                                <td><c:out value="${dato.nom_cli}"></c:out></td>
                                <td><c:out value="${dato.dir_cli}"></c:out></td>
                                <td><c:out value="${dato.corr_cli}"></c:out></td>
                                <td><c:out value="${dato.tel_cli}"></c:out></td>
                                <td>
                                    <a href="actCliente.htm?id=${dato.id_cli}" class="btn btn-warning"><span class="glyphicon glyphicon-pencil"></span></a>
<!--                                    <a href="actCliente.htm?id=${dato.id_cli}" class="btn btn-warning">Editar</a> 
-->                                    <a href="borrarCliente.htm?id=${dato.id_cli}" class="btn btn-danger">Delete</a>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
     </body>
</html>
