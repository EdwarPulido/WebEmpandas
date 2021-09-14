<%-- 
    Document   : index
    Created on : 14/09/2021, 12:07:40 AM
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
        <div class="container mt-4 col-lg-4"> 
            <div class="card-body col-sm-10">
                <div class="card-body"><!-- GRUPO 1 LOGO-WELCOME -->
                    <form class="form-sing" action="Validar" method="POST">
                        <div class="form-group text-center ">
                            <h3>LOGIN</h3>
                            <img src="Imagenes/NUEVO_LOGO_KASABE.png" alt="100" width="400" /><!-- imagenen logo -->
                            <label>
                                <h1> Bienvenidos KsabeMejor </h1>
                            </label>
                        </div>
                        <div class="form-group"> 
                            <label>Usuario:</label><!-- Usuario nombre -->
                            <input type="text" name="txtuser" class="from-control">
                        </div>
                        <div class="form-group"><!-- Usuario contraseña -->
                            <label>Contraseña:</label>
                            <input type="password" name="txtpass" class="from-control">
                        </div>
                        <input type="submit" name="accion" value="Ingresar" class="btn btn-primary btn-block">
                    </form>
                </div>
            </div>
        </div>        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>

    </body>
</html>