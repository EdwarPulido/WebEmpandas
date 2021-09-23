/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 *  @Document   : Clientes
 *  @Created on : 15/09/2021, 07:45:46 PM
 *  @Author     : Edwar
 * 
 */


public class Conexion { //CONEXION DIRECTA A LA BASE DE DATOS POR PUERTO 3306 Y LA BASE DE DATOS tiendaudem_empanadas con usuario y contraseña de mysql
    Connection con ;
    String url ="jdbc:mysql://localhost:3306/tiendaudem_empanadas?useSSL=false"; //DIRECCION BASE DATOS
    String user ="root";
    String pass ="123456789";
    public Connection Conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con=DriverManager.getConnection(url,user,pass);
            
        } catch (Exception e) {
            System.out.println("El error es "+e);
        }
        return con;
    }
}
