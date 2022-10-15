package com.patrones_disenios.facade.ecommerce.service.impl;


import com.patrones_disenios.facade.ecommerce.model.Tarjeta;

public class PagoService {


    public Boolean procesarPago(Tarjeta tarjeta, String montoACobrar) {
        Boolean pagoRealizado;
        if (tarjeta != null && tarjeta.getNumerosFrente() != null && tarjeta.getCodSeguridad() != null)
            System.out.println("Procesando el pago por " + montoACobrar);
        pagoRealizado = Boolean.TRUE;
        return pagoRealizado;
    }

}
