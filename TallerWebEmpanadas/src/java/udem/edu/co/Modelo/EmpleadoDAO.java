/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.Modelo;

import com.mysql.cj.Query;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import udem.edu.co.config.Conexion;

/**
 *
 * @author Edwar
 */
//DAO esta relacionado directamente con la base de datos
public class EmpleadoDAO {
    
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Empleado validar(String user , String cedula){
        Empleado em = new Empleado();
        String sql= "select * from empleado where User= ? and Cedula= ?";//consulta de campos puntuales sql
        
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1,user);
            ps.setString(2,cedula);
            rs=ps.executeQuery();
            while(rs.next()){
                em.setId(rs.getInt("IdEmpleado"));
                em.setCedula(rs.getString("Cedula"));
                em.setTel(rs.getString("Telefono"));
                em.setEstado(rs.getString("Estado"));
                em.setNom(rs.getString("Nombre"));
                em.setUser(rs.getString("User"));
            }
        
        }
        catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
        return em;
    }
    
}