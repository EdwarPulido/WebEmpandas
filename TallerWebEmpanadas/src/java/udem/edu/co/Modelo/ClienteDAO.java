/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import udem.edu.co.config.Conexion;

/**
 *
 * @Document : Clientes
 * @Created on : 15/09/2021, 07:45:46 PM
 * @Author : Edwar
 *
 */
public class ClienteDAO {

    //CONEXION A LA BASE DE DATOS
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int respuesta;

    //METODO PARA VALIDAR EL INGRESO DE LOS DATOS PARA LOGIN
    public Cliente validar(String user, String cedula) {
        Cliente cli = new Cliente();
        String sql = "select * from cliente where User= ? and Cedula= ?";//consulta de campos puntuales sql
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, cedula);
            rs = ps.executeQuery();

            while (rs.next()) {
                cli.setId(rs.getInt("IdCliente"));
                cli.setCedula(rs.getString("Cedula"));
                cli.setNom(rs.getString("Nombre"));
                cli.setDirec(rs.getString("Direccion"));
                cli.setEstado(rs.getString("Estado"));
                cli.setUser(rs.getString("User"));
            }

        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
        return cli;
    }

    //OPERACIONES CRUD METODOS PARA LISTAR-AGREGAR-ACTUALIZAR-ELIMINAR-EDITAR 
    public List listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from Cliente";

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();

                cli.setId(rs.getInt(1));
                cli.setCedula(rs.getString(2));
                cli.setNom(rs.getString(3));
                cli.setDirec(rs.getString(4));
                cli.setEstado(rs.getString(5));
                cli.setUser(rs.getString(6));

                lista.add(cli);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public int agregar(Cliente cli) {//Agregar en la base de datos 
        String sql = "insert into cliente (Cedula,Nombre,Direccion,Estado,User) VALUES(?, ?, ?, ?, ?) ";//consulta SQL para insertar
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getCedula());
            ps.setString(2, cli.getNom());
            ps.setString(3, cli.getDirec());
            ps.setString(4, cli.getEstado());
            ps.setString(5, cli.getUser());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
        return respuesta;
    }

    public Cliente listarId(int id) {
        Cliente clien = new Cliente();
        String sql = "SELECT * FROM cliente WHERE IdCliente=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                clien.setCedula(rs.getString(2));
                clien.setNom(rs.getString(3));
                clien.setDirec(rs.getString(4));
                clien.setEstado(rs.getString(5));
                clien.setUser(rs.getString(6));
            }
        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
        return clien;
    }

    public int Actualizar(Cliente cli) {//metodo para actualizar mediante la consulta sql
        String sql = "UPDATE cliente  SET Cedula=?,Nombre=?, Direccion=?, Estado=?, User=? WHERE IdCliente=? ";//consulta SQL para insertar
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getCedula());
            ps.setString(2, cli.getNom());
            ps.setString(3, cli.getDirec());
            ps.setString(4, cli.getEstado());
            ps.setString(5, cli.getUser());
            ps.setInt(6, cli.getId());
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
        return respuesta;
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM cliente WHERE IdCliente=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
    }

}
