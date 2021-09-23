/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import udem.edu.co.Modelo.Cliente;
import udem.edu.co.Modelo.ClienteDAO;
import udem.edu.co.Modelo.Empleado;
import udem.edu.co.Modelo.EmpleadoDAO;
import udem.edu.co.Modelo.Producto;
import udem.edu.co.Modelo.ProductoDAO;

/**
 *
 *  @Document   : Clientes
 *  @Created on : 15/09/2021, 07:45:46 PM
 *  @Author     : Edwar
 * 
 */
public class Controlador extends HttpServlet {

    
    Empleado em = new Empleado();
    EmpleadoDAO edao = new EmpleadoDAO();
    Cliente cli = new Cliente();
    ClienteDAO cdao = new ClienteDAO();
    Producto pro = new Producto();
    ProductoDAO pdao = new ProductoDAO();
    
    int idemple;
    int idclien;
    int idprod;
    
    //CON EL CONTROLADOR procesar las peticiones  del menu y dependiendo el caso con puro txt

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        //******************************PRINCIPAL**********************************
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response); //actualizar tiempo real
        }
        //******************************EMPLEADO**********************************
        if (menu.equals("Empleado")) {
            switch (accion) {
                case "Listar":
                    List lista = edao.listar();
                    request.setAttribute("empleados", lista);
                    break;
                case "Agregar":
                    String Cedula = request.getParameter("txtcc");
                    String Nombre = request.getParameter("txtnom");
                    String Telefono = request.getParameter("txttel");
                    String Estado = request.getParameter("txtest");
                    String User = request.getParameter("txtuser");
                    em.setCedula(Cedula);
                    em.setNom(Nombre);
                    em.setTel(Telefono);
                    em.setEstado(Estado);
                    em.setUser(User);
                    edao.agregar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);//ACTUALIZAR LISTA EN TIEMPO REAL
                    break;
                case "Editar":
                    idemple = Integer.parseInt(request.getParameter("id"));
                    Empleado emp = edao.listarId(idemple);
                    request.setAttribute("empleado", emp);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String Cedu = request.getParameter("txtcc");
                    String Nomb = request.getParameter("txtnom");
                    String Tele = request.getParameter("txttel");
                    String Esta = request.getParameter("txtest");
                    String Usu = request.getParameter("txtuser");
                    em.setCedula(Cedu);
                    em.setNom(Nomb);
                    em.setTel(Tele);
                    em.setEstado(Esta);
                    em.setUser(Usu);

                    em.setId(idemple);

                    edao.Actualizar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;

                case "Eliminar":
                    idemple = Integer.parseInt(request.getParameter("id"));
                    edao.eliminar(idemple);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;

                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Empleado.jsp").forward(request, response);
        }

        //******************************CLIENTE**********************************
        if (menu.equals("Cliente")) {
            switch (accion) {
                case "Listar":
                    List lista = cdao.listar();
                    request.setAttribute("clientes", lista);
                    break;

                case "Agregar":
                    String Cedula = request.getParameter("txtcc");
                    String Nombre = request.getParameter("txtnom");
                    String Direccion = request.getParameter("txtdirec");
                    String Estado = request.getParameter("txtest");
                    String User = request.getParameter("txtuser");
                    cli.setCedula(Cedula);
                    cli.setNom(Nombre);
                    cli.setDirec(Direccion);
                    cli.setEstado(Estado);
                    cli.setUser(User);
                    cdao.agregar(cli);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;

                case "Editar":
                    idclien = Integer.parseInt(request.getParameter("id"));
                    Cliente clien = cdao.listarId(idclien);
                    request.setAttribute("cliente", clien);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;

                case "Actualizar":
                    String Cedu = request.getParameter("txtcc");
                    String Nomb = request.getParameter("txtnom");
                    String Direc = request.getParameter("txtdirec");
                    String Esta = request.getParameter("txtest");
                    String Usu = request.getParameter("txtuser");
                    cli.setCedula(Cedu);
                    cli.setNom(Nomb);
                    cli.setDirec(Direc);
                    cli.setEstado(Esta);
                    cli.setUser(Usu);
                    cli.setId(idclien);
                    cdao.Actualizar(cli);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;

                case "Eliminar":
                    idemple = Integer.parseInt(request.getParameter("id"));
                    cdao.eliminar(idclien);
                    request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Cliente.jsp").forward(request, response);
        }

        //******************************PRODUCTO**********************************
        if (menu.equals("Producto")) {
            switch (accion) {
                case "Listar":
                    List lista = pdao.listar();
                    request.setAttribute("productos", lista);
                    break;
                case "Agregar":
                    String Nombre = request.getParameter("txtnom");
                    int Precio = Integer.parseInt(request.getParameter("txtprecio"));
                    int Stock = Integer.parseInt(request.getParameter("txtstock"));
                    pro.setNom(Nombre);
                    pro.setPrecio(Precio);
                    pro.setStock(Stock);
                    pdao.agregar(pro);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;

                case "Editar":
                    idprod = Integer.parseInt(request.getParameter("id"));
                    Producto prod = pdao.listarId(idprod);
                    request.setAttribute("producto", prod);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;

                case "Actualizar":
                    String Nomb = request.getParameter("txtnom");
                    int Prec = Integer.parseInt(request.getParameter("txtprecio"));
                    int Stoc = Integer.parseInt(request.getParameter("txtstock"));
                    pro.setNom(Nomb);
                    pro.setPrecio(Prec);
                    pro.setStock(Stoc);
                    pro.setId(idprod);
                    pdao.Actualizar(pro);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;

                case "Eliminar":
                    idprod = Integer.parseInt(request.getParameter("id"));
                    pdao.eliminar(idprod);
                    request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Producto.jsp").forward(request, response);
        }

        if (menu.equals("Carrito")) {
            request.getRequestDispatcher("Carrito.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
