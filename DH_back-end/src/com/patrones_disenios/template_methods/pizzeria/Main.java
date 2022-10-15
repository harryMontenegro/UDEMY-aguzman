package com.patrones_disenios.template_methods.pizzeria;

import com.patrones_disenios.template_methods.pizzeria.service.Cocinero;
import com.patrones_disenios.template_methods.pizzeria.service.impl.CocineroNoVeggie;
import com.patrones_disenios.template_methods.pizzeria.service.impl.CocineroVeggie;

public class Main {

    public static void main(String[] args) {
        Cocinero cocineroVeggie = new CocineroVeggie();
        Cocinero cocineroNoVeggie = new CocineroNoVeggie();

        cocineroVeggie.hacerPizza();
        cocineroNoVeggie.hacerPizza();
    }
}
