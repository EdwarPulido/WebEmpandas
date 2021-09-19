/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import udem.edu.co.config.Conexion;

/**
 *
 * @author Edwar
 */
public class ClientesDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Clientes validar(String IdCliente, String cedula) {
        Clientes cli = new Clientes();
        String sql = "select * from Clientes where clientes= ? and Cedula= ?";//consulta de campos puntuales sql

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, IdCliente);
            ps.setString(2, cedula);
            rs = ps.executeQuery();
            while (rs.next()) {
                cli.setIdCliente(rs.getInt("IdCliente"));
                cli.setCedula(rs.getString("Cedula"));
                cli.setNom(rs.getString("Nombre"));
                cli.setDirec(rs.getString("Direccion"));
                cli.setEstado(rs.getString("Estado"));
            }

        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
        return cli;
    }
}
