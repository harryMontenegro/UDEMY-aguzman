package com.patrones_disenios.template_methods.C2S.service.impl;

import com.patrones_disenios.template_methods.C2S.service.Menu;

public class MenuVegetariano extends Menu {
    private int numeroEspecies;
    private int numeroSalsas;

    public MenuVegetariano(Double precioBase, int numeroEspecies, int numeroSalsas) {
        super(precioBase);
        this.numeroEspecies = numeroEspecies;
        this.numeroSalsas = numeroSalsas;
    }

    @Override
    protected void armarMenu() {

    }
}
