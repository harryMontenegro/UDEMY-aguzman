package com.patrones_disenios.template_methods.C2S.service;

public abstract class Menu {
    protected Double precioBase;

    public Menu(Double precioBase) {
        this.precioBase = precioBase;
    }

    public void calcularPrecio(int numeroJuguetes, int numeroEspecias, int numerosSalsas){

    }

    protected abstract void armarMenu();

}
