package com.patrones_disenios.facade.cajero.models;

import java.util.Arrays;
import java.util.List;

public class Cliente {

    private Integer idCliente;
    private String dni;
    private String contrasena;

    public Cliente() {
    }

    public Cliente(Integer idCliente, String dni, String contrasena) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.contrasena = contrasena;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public static List<Cliente> fuenteDatos(){
        return Arrays.asList(
                new Cliente(1, "16828626", "1234"),
                new Cliente(2, "5284322", "12345"));
    }
}
