<%-- 
    Document   : index
    Created on : 14/09/2021, 12:07:40 AM
    Author     : Edwar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%-- INDEX DE LOGIN --%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <%-- BODY CON ESTILO BACKGROUND IMAGEN URL--%>
    <body style="
          height: 885px;
          background-image:url(https://u7.uidownload.com/vector/567/944/vector-orange-and-yellow-polygon-background-design-ai-eps.jpg);
          background-size: cover;
          background-repeat:no-repeat;
          background-position: center center;">
        <div class="container col-lg-6 text-center col-sm-9">
            <form class="form-sing" action="Validar" method="POST">
                <div class="card-body ">
                    <img src="Imagenes/NUEVO_LOGO_KASABE.png" alt="100" width="500" /><!-- imagenen logo -->
                    <label>
                        <h1>Bienvenidos KsabeMejor</h1>
                    </label>
                </div>
                <%--FROM GROUP Y CONTROL  PARA USUARIO Y CONTRASEÑA  --%>
                <div class="form-group  col-form-label">
                    <label >USER</label><!-- Usuario nombre -->
                    <input type="text" name="txtuser" class="from-control" required="">
                </div>
                <div class="form-group col-form-label " ><!-- Usuario contraseña -->
                    <label>PASS</label>
                    <input type="password" name="txtpass" class="from-control" required="" >
                </div>
                <%-- ACCION CON VALOR DE INGRESAR--%>
                <input type="submit" required="required" name="accion" value="Ingresar" class="btn btn-primary"> 
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js" integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/" crossorigin="anonymous"></script>
    </body>
</html>
