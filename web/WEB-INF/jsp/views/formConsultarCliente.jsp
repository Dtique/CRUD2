<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="cabecera.jsp" %>
        <h1>Ejemplo de Uso de FORMS en JSTL y JSP</h1>
        <div class="content">
            <form:form cssClass="navbar-form " method="post" commandName="cliente">  
                <form:errors path="*" element="div" cssClass="alert alert-danger" />
                <div class="card border-info">
                    <div class="card card-header bg-info">
                        <label class="input-group-addon">Consulta de los usuarios</label>
                    </div>
                </div>
                <div class="input-group">
                <form:label path="nombre" cssClass="input-group-addon">Nombre Cliente: </form:label>
                <form:input path="nombre" cssClass="form-control"></form:input>            
                </div>
                <form:errors path="nombre" /><br>
                
                <form:button name="Enviar" class="btn btn-primary btn-lg">Enviar</form:button>
                <a class="btn btn-primary btn-lg" href="index.htm" role="button" >Regresar...</a>

             </form:form>
            </div>
    </body>
</html>
