<%-- 
    Document   : RegistrarVenta
    Created on : 15/09/2021, 07:45:33 PM
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
                <div class="card-body ">
                    <form action="Controlador?menu=Producto" method="POST">
                        <div class="col-sm-7">
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>NOMBRE</th>
                                        <th>PRECIO</th>
                                        <th>CANTIDAD</th>
                                        <th>ACCION</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="pro" items="${productos}">
                                        <tr>
                                            <td>${pro.getId()}</td>
                                            <td>${pro.getNom()}</td>
                                            <td>${pro.getPrecio()}</td>
                                            <td>${pro.getStock()}</td>
                                            <td>
                                                <a class="btn btn-primary" href="Controlador?menu=Producto&accion=Editar&id=${pro.getId()}">AGREGAR </a>
                                                <a class="btn btn-warning" href="Controlador?menu=Producto&accion=Eliminar&id=${pro.getId()}">QUITAR</a>
                                            </td>
                                        </tr>
                                    </c:forEach >
                                </tbody>
                            </table>
                        </div>
                    </form>
                </div>
            </div>

        </div>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
    </body>
</html>