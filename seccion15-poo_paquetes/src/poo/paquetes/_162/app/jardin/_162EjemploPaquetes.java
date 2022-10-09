package poo.paquetes._162.app.jardin;

import poo.paquetes._162.app.hogar.*;
import static poo.paquetes._162.app.hogar.ColorPelo.*;
import static poo.paquetes._162.app.hogar.Persona.*;

public class _162EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Andrés");
        p.setApellido("Guzmán");
        p.setColorPelo(CAFE);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
    }
}
