package com.patrones_disenios.template_methods.pizzeria.service.impl;


import com.patrones_disenios.template_methods.pizzeria.service.Cocinero;

public class CocineroNoVeggie extends Cocinero {
    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando queso y fetas de jamon,");
    }

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando los ingredientes");
    }
}
