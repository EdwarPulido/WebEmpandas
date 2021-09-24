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
<%-- body con estilo url  --%>    
    <body  style="
           height: 885px;
           background-image:url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTU9wEHcMh99scRf56N5Ru8cKBR06R9vQSyOJ9IWBMQbAauGEL8Ffq4vqPvFdyK5u89Qt0&usqp=CAU);
           background-size: cover;
           background-repeat:no-repeat;
           background-position: center center;">

        <nav class="navbar navbar-expand-lg navbar-light bg-warning">
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a style="margin-left: 10px; border: none"  class="btn btn-outline-ligth" >KsabeMejor</a>
                    </li>
                    <%-- GRUPO LLAMADO MYFRAME PARA LOS ITEMS NAV dirijidos a controlador con la accion listar todo directo base de datos mediante sus metodos DAO--%>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none"  class="btn btn-outline-ligth" href="Controlador?menu=Producto&accion=Listar" target="myFrame">PRODUCTO</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-ligth" href="Controlador?menu=Empleado&accion=Listar" target="myFrame">EMPLEADO</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-ligth" href="Controlador?menu=Cliente&accion=Listar"" target="myFrame">CLIENTES</a>
                    </li>
                    <li class="nav-item">
                        <a style="margin-left: 10px; border: none" class="btn btn-outline-ligth" href="Carrito.jsp" target="myFrame">CARRITO</a>
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
                    <div class="dropdown-divider"></div>
                        <%-- form para el boton de salir --%>    
                    <form action="Validar" method="POST">
                        <button name="accion" value="Salir" class="dropdown-item" href="#"/>Salir</button><!-- ACCION SALIR -->
                    </form>
                </div>
            </div>
        </nav>
                    
        <div class="mt-5" style="height: 600px;">
            <iframe  name="myFrame" width="100%" height="115%" style="border:none" ></iframe>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
    </body>
</html>