package com.patrones_disenios.facade.cajero.services.impl;

import com.patrones_disenios.facade.cajero.models.Cliente;
import com.patrones_disenios.facade.cajero.services.excepciones.ClienteNoExisteException;

import java.math.BigDecimal;

public class CuentaService {

    private Integer IdCliente;
    private BigDecimal saldoActual;

    public CuentaService() {
    }

    public CuentaService(Integer idCliente, BigDecimal saldoActual) {
        IdCliente = idCliente;
        this.saldoActual = saldoActual;
    }

    public Integer getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Integer idCliente) {
        IdCliente = idCliente;
    }

    public BigDecimal getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(BigDecimal saldoActual) {
        this.saldoActual = saldoActual;
    }

    public BigDecimal getCuenta(String dni){
        Cliente cliente = Cliente.fuenteDatos().stream().filter(c -> c.getDni().equals(dni)).findFirst().orElseThrow(() -> new ClienteNoExisteException("El cliente no existe"));
        if(cliente != null && cliente.getIdCliente().equals(this.IdCliente)){
            return this.saldoActual;
        }
        return BigDecimal.ZERO;
    }
}
