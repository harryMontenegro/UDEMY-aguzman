package poo.paquetes._160.app;

import poo.paquetes._160.app.hogar.*;

public class _160EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.nombre = "Andrés";
        System.out.println(p.nombre);

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";
    }
}
