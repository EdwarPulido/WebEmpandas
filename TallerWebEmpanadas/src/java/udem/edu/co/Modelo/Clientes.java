/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.Modelo;

/**
 *
 * @author Edwar
 */
public class Clientes {

    int IdCliente;
    String cedula;
    String nom;
    String Direc;
    String estado;

    public Clientes() {

    }

    public Clientes(int IdCliente, String cedula, String nom, String Direc, String estado) {
        this.IdCliente = IdCliente;
        this.cedula = cedula;
        this.nom = nom;
        this.Direc = Direc;
        this.estado = estado;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDirec() {
        return Direc;
    }

    public void setDirec(String Direc) {
        this.Direc = Direc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
