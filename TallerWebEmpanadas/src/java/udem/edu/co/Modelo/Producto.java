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
public class Producto {
    //Definicion de atributos 
    int id;
    String nom;
    int precio;
    int stock;
  
//LLAMADO AL CONSTRUCTOR Y SUS METODOS GET AND SET
    public Producto() {
    }

    public Producto(int id, String nom, int precio, int stock) {
        this.id = id;
        this.nom = nom;
        this.precio = precio;
        this.stock = stock;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
