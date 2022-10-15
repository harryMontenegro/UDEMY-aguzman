package com.patrones_disenios.facade.cajero.services.impl;

import com.patrones_disenios.facade.cajero.models.Cliente;


public class AutenticacionService {
    public Boolean validarUsuarioYContrasena(Cliente cliente){
        return Cliente.fuenteDatos().stream().anyMatch(c -> c.getDni().equals(cliente.getDni()) && c.getContrasena().equals(cliente.getContrasena()));
    }
}
