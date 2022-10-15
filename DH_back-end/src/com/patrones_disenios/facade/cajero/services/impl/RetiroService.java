package com.patrones_disenios.facade.cajero.services.impl;

import com.patrones_disenios.facade.cajero.services.IRetiroService;

public class RetiroService implements IRetiroService {

    private AutenticacionService autenticacionService;
    private CajaService cajaService;
    private CuentaService cuentaService;

    public RetiroService(AutenticacionService autenticacionService, CajaService cajaService, CuentaService cuentaService) {
        this.autenticacionService = autenticacionService;
        this.cajaService = cajaService;
        this.cuentaService = cuentaService;
    }

    @Override
    public void procesarRetiro() {
        AutenticacionService autenticacionService;

    }
}
