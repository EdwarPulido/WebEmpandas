<%-- 
    Document   : Principal
    Created on : 14/09/2021, 12:07:51 AM
    Author     : Edwar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>

    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-warning">
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a style="margin-left: 10px; border: none"  class="btn btn-outline-ligth" href="Controlador?accion=Principal" target="myFrame">KsabeMejor</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none"  class="btn btn-outline-ligth" href="Controlador?accion=Producto" target="myFrame">PRODUCTO</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-ligth" href="Controlador?accion=Empleado" target="myFrame">EMPLEADO</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-ligth" href="Controlador?accion=Clientes" target="myFrame">CLIENTES</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-ligth" href="Controlador?accion=VentasNuevas" target="myFrame">NUEVA VENTA</a>
                    </li>
                </ul>
            </div>

            <div class="dropdown">
                <button style="border: none" class="btn btn-outline-ligth dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                    ${usuario.getNom()}<%--imprimir usuario que logeo--%>
                </button>
                <div class="dropdown-menu text-center">
                    <a class="dropdown-item" href="#">
                        <img src="Imagenes/48f997ae7a801924cde1d5d849291c8e.png" alt="40" width="40"/>
                    </a>
                    <a class="dropdown-item" href="#"> ${usuario.getUser()}</a>
                    <a class="dropdown-item" href="#">Usuario@gmail.com</a>
                    <div class="dropdown-divider"></div>
                    
                    <form action="Validar" method="POST">
                        <button name="accion" value="Salir" class="dropdown-item" href="#"/>Salir</button><!-- ACCION SALIR -->
                    </form>
                </div>
            </div>
        </nav>
        <div class="mt-4" style="height: 400px;">
            <iframe name="myFrame" width="100%" height="215%" style="border:1px solid black;">

            </iframe>

        </div> 

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
    </body>
</html>