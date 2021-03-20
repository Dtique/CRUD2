<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="cabecera.jsp" %>
        <div class="content">
            <div class="card border-info">
                <div class="card header bg-info">
                    <h1>Modificar Clientes</h1>                    
                </div>
                <div class="carb body">
                    <form:form cssClass="navbar-form " method="post" commandName="cliente">
                        <form:errors path="*" element="div" cssClass="alert alert-danger" />
                        <div class="input-group">
                        <form:label path="nombre" cssClass="input-group-addon">Nombre Cliente: </form:label>
                        <form:input path="nombre" cssClass="form-control"></form:input>            
                        </div>
                        <form:errors path="nombre" /><br>
                         <div class="input-group" >
                        <form:label path="direccion" cssClass="input-group-addon">Dirección del Cliente: </form:label>
                        <form:input path="direccion" cssClass="form-control"></form:input>
                         </div>
                         <br>             
                         <div class="input-group" >
                        <form:label path="correo" cssClass="input-group-addon">Correo Cliente: </form:label>
                        <form:input path="correo" cssClass="form-control"></form:input>
                        </div>
                        <br>            
                        <div class="input-group" >
                        <form:label path="telefono" cssClass="input-group-addon">Teléfono Cliente: </form:label>
                        <form:input path="telefono" cssClass="form-control"></form:input>
                        </div><br>
                        <form:button value="Enviar-datos" class="btn btn-primary btn-md">
                            Enviar Datos
                        </form:button>
                        <input type="reset" value="Limpiar" class="btn btn-primary btn-md"/>
                        <a class="btn btn-primary btn-md" href="formCliente.htm" role="button" >Regresar</a>

                     </form:form>
<!--                    
                    <form action="" method="post">

                        <label  Class="input-group-addon">Digite el Nombre: </label>
                        <input type="text" name="nombre" Class="form-control"
                               value='<c:out value="${cli[0].nom_cli}"></c:out>' />
                        <label  Class="input-group-addon">Digite la Dirección: </label>
                        <input type="text" name="direccion" Class="form-control" 
                               value='<c:out value="${cli[0].dir_cli}"></c:out>' />
                        
                        <label name="correo" Class="input-group-addon">Digite el e-Mail: </label>
                        <input type="text" name="correo" Class="form-control"
                               value="<c:out value="${cli[0].corr_cli}"></c:out>" />
                        
                        <label name="telefono" Class="input-group-addon">Digite el Teléfono: </label>
                        <input type="text" name="telefono" Class="form-control"
                               value="<c:out value="${cli[0].tel_cli}"></c:out>" />
                        
                        
                        <input type="submit" name="btnEnviar" value="Actualizar_datos" class="btn btn-primary btn-md" />
                        <input type="reset" value="Limpiar..." class="btn btn-primary btn-md"/>
                        <a href="formCliente.htm" class="btn btn-primary btn-md">Regresar<a/>
                    </form>
-->                               
                </div>
            </div>
        </div>
    </body>
</html>
