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
 *  @Document   : Clientes
 *  @Created on : 15/09/2021, 07:45:46 PM
 *  @Author     : Edwar
 * 
 */

//DAO esta relacionado directamente con la base de datos
public class EmpleadoDAO {
//CONEXION A LA BASE DE DATOS
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int respuesta;
//METODO PARA VALIDAR EL INGRESO DE LOS DATOS PARA LOGIN
    public Empleado validar(String user, String cedula) {
        Empleado em = new Empleado();
        String sql = "select * from empleado where User= ? and Cedula= ?";//consulta de campos puntuales sql

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, cedula);
            rs = ps.executeQuery();
            while (rs.next()) {
                em.setId(rs.getInt("IdEmpleado"));
                em.setCedula(rs.getString("Cedula"));
                em.setTel(rs.getString("Telefono"));
                em.setEstado(rs.getString("Estado"));
                em.setNom(rs.getString("Nombre"));
                em.setUser(rs.getString("User"));
            }

        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
        return em;
    }

    //OPERACIONES CRUD METODOS PARA LISTAR-AGREGAR-ACTUALIZAR-ELIMINAR-EDITAR 
    public List listar() {
        List<Empleado> lista = new ArrayList<>();
        String sql = "select * from Empleado";

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Empleado em = new Empleado();
                em.setId(rs.getInt(1));
                em.setCedula(rs.getString(2));
                em.setNom(rs.getString(3));
                em.setTel(rs.getString(4));
                em.setEstado(rs.getString(5));
                em.setUser(rs.getString(6));
                lista.add(em);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public int agregar(Empleado em) {//Agregar en la base de datos 
        String sql = "insert into empleado (Cedula,Nombre,Telefono,Estado,User) VALUES(?, ?, ?, ?, ?) ";//consulta SQL para insertar
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, em.getCedula());
            ps.setString(2, em.getNom());
            ps.setString(3, em.getTel());
            ps.setString(4, em.getEstado());
            ps.setString(5, em.getUser());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
        return respuesta;
    }

    public Empleado listarId(int id) {
        Empleado emp = new Empleado();
        String sql = "SELECT * FROM empleado WHERE IdEmpleado=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                emp.setCedula(rs.getString(2));
                emp.setNom(rs.getString(3));
                emp.setTel(rs.getString(4));
                emp.setEstado(rs.getString(5));
                emp.setUser(rs.getString(6));
            }
        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
        return emp;
    }

    public int Actualizar(Empleado em) {//metodo para actualizar mediante la consulta sql
        String sql = "UPDATE empleado  SET Cedula=?,Nombre=?, Telefono=?, Estado=?, User=? WHERE IdEmpleado=? ";//consulta SQL para insertar
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, em.getCedula());
            ps.setString(2, em.getNom());
            ps.setString(3, em.getTel());
            ps.setString(4, em.getEstado());
            ps.setString(5, em.getUser());
            ps.setInt(6, em.getId());
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
        return respuesta;
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM empleado WHERE IdEmpleado=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
    }

}
