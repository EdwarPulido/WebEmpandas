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
import udem.edu.co.Modelo.Empleado;
import udem.edu.co.Modelo.EmpleadoDAO;

/**
 *
 * @author Edwar
 */
public class Controlador extends HttpServlet {

    Empleado em = new Empleado();
    EmpleadoDAO edao = new EmpleadoDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");

        if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }
        if (menu.equals("Empleado")){
            switch (accion) {
                
                case "Listar":
                    List lista = edao.listar();
                    request.setAttribute("empleados",lista);
                    break;
                    
                case "Agregar":
                    String Cedula=request.getParameter("txtcc");
                    String Nombre=request.getParameter("txtnom");
                    String Telefono=request.getParameter("txttel");
                    String Estado=request.getParameter("txtest");
                    String User=request.getParameter("txtuser");
                    em.setCedula(Cedula);
                    em.setNom(Nombre);
                    em.setTel(Telefono);
                    em.setEstado(Estado);
                    em.setUser(User);
                    edao.agregar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);                    
                    break;
                    
                case "Editar":
                    break;
                case "Eliminar":
                    break;

                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Empleado.jsp").forward(request, response);

        }

        if (menu.equals("Clientes")) {
            request.getRequestDispatcher("Clientes.jsp").forward(request, response);
        }

        if (menu.equals("Producto")) {
            request.getRequestDispatcher("Producto.jsp").forward(request, response);

        }
        if (menu.equals("VentasNuevas")) {

            request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
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
