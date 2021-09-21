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
 * @author Edwar
 */
public class ProductoDAO {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int respuesta;
    
   
//OPERACIONES CRUD METODOS PARA LISTAR-AGREGAR-ACTUALIZAR-ELIMINAR-EDITAR 
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "select * from Producto";

        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Producto pro = new Producto();

                pro.setId(rs.getInt(1));
                pro.setNom(rs.getString(2));
                pro.setPrecio(rs.getInt(3));
                pro.setStock(rs.getInt(4));
              
                lista.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
  
    
    public int agregar(Producto pro) {//Agregar en la base de datos 
        String sql = "insert into producto (Nombre,Precio,Stock) VALUES(?, ?, ?) ";//consulta SQL para insertar
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNom());
            ps.setInt(2, pro.getPrecio());
            ps.setInt(3, pro.getStock());
            
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
        return respuesta;
    }
    
    public Producto listarId(int id) {
        Producto prod = new Producto();
        String sql = "SELECT * FROM producto WHERE IdProducto=" + id; //consultada sql con idproducto
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                prod.setNom(rs.getString(2));
                prod.setPrecio(rs.getInt(3));
                prod.setStock(rs.getInt(4));
               
            }
        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
        return prod;
    }
    
    public int Actualizar(Producto pro) {//metodo para actualizar mediante la consulta sql
        String sql = " UPDATE producto  SET Nombre=?,Precio=?, Stock=? WHERE IdProducto=? ";//consulta SQL para insertar
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNom());
            ps.setInt(2, pro.getPrecio());
            ps.setInt(3, pro.getStock());
            ps.setInt(4, pro.getId());
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
        return respuesta;
    }
    
    public void eliminar(int id) {
        String sql = "DELETE FROM producto WHERE IdProducto=" + id;//consulta sql para buscar idproducto y delete
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("El error es de tipo " + e);
        }
    }
    
    
}
