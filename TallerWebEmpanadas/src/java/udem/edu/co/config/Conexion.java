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
 * @author Edwar
 */
public class Conexion {
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
