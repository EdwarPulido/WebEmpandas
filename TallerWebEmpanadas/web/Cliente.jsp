<%-- 
    Document   : Clientes
    Created on : 15/09/2021, 07:45:46 PM
    Author     : Edwar
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-5">
                <div class="card-body">
                    <form action="Controlador?menu=Cliente" method="POST">
                        <div class="form-group">
                            <label>Cedula</label>
                            <input type="text" value="${cliente.getCedula()}" name="txtcc" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Nombre</label>
                            <input type="text" value="${cliente.getNom()}" name="txtnom" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Direccion</label>
                            <input type="text" value="${cliente.getDirec()}" name="txtdirec" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Estado</label>
                            <input type="text" value="${cliente.getEstado()}" name="txtest" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>User</label>
                            <input type="text" value="${cliente.getUser()}"name="txtuser" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-primary">
                    </form>
                </div>
            </div>
            <div class="col-sm-7">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>CEDULA</th>
                            <th>NOMBRE</th>
                            <th>DIRECCION</th>
                            <th>ESTADO</th>
                            <th>USER</th>
                            <th>ACCION</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="cli" items="${Cliente}">
                            <tr>
                                <td>${em.getId()}</td>
                                <td>${em.getCedula()}</td>
                                <td>${em.getNom()}</td>
                                <td>${em.getDirec()}</td>
                                <td>${em.getEstado()}</td>
                                <td>${em.getUser()}</td>
                                <td>
                                    <a class="btn btn-primary" href="Controlador?menu=Cliente&accion=Editar&id=${cli.getId()}">EDITAR </a>
                                    <a class="btn btn-warning" href="Controlador?menu=Cliente&accion=Eliminar&id=${cli.getId()}">ELIMINAR</a>
                                </td>
                            </tr>
                        </c:forEach >  

                    </tbody>
                </table>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
    </body>
    
</html>