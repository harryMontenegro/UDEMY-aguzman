package com.patrones_disenios.template_methods.C2S.service.impl;

import com.patrones_disenios.template_methods.C2S.service.Menu;

public class MenuInfantil extends Menu {
    private int numeroJuguetes;

    public MenuInfantil(Double precioBase, int numeroJuguetes) {
        super(precioBase);
        this.numeroJuguetes = numeroJuguetes;
    }

    @Override
    protected void armarMenu() {

    }
}
