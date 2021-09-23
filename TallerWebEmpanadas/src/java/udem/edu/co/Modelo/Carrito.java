/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.Modelo;

/**
 *
 *  @Document   : Clientes
 *  @Created on : 15/09/2021, 07:45:46 PM
 *  @Author     : Edwar
 * 
 */
public class Carrito {
    
    int item;
    int idProducto;
    String nombre;
    String descipcion;
    double preciocompra;
    int cantidad;
    double subtotal;

    public Carrito() {
    }

    public Carrito(int item, int idProducto, String nombre, String descipcion, double preciocompra, int cantidad, double subtotal) {
        this.item = item;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.preciocompra = preciocompra;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
        

    
}
