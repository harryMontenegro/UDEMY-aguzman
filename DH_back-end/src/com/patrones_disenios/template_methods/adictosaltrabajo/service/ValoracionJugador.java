package com.patrones_disenios.template_methods.adictosaltrabajo.service;

public enum ValoracionJugador {

    MALISIMO(-9999, 0), MALO(0, 10), NORMAL(10, 20), BUENO(20, 40), GALACTICO(
            40, 9999);

    private int valorMinimo;
    private int valorMaximo;

    private ValoracionJugador(int valorMinimo, int valorMaximo) {
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;
    }
}
