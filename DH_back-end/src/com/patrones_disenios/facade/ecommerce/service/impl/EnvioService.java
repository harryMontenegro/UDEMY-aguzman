package com.patrones_disenios.facade.ecommerce.service.impl;

import com.patrones_disenios.facade.ecommerce.model.Direccion;
import com.patrones_disenios.facade.ecommerce.model.Producto;

import java.util.List;

public class EnvioService {

    public void procesarEnvio(List<Producto> productos, Direccion direccion){
        System.out.println("Enviando productos a " + direccion.getCalle() +" "+ direccion.getNro() +","+ direccion.getBarrio());
    }
}
