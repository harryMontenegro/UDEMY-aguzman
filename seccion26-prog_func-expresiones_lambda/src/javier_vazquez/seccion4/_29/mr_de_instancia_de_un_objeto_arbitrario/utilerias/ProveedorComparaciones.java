package javier_vazquez.seccion4._29.mr_de_instancia_de_un_objeto_arbitrario.utilerias;

import javier_vazquez.seccion4._29.mr_de_instancia_de_un_objeto_arbitrario.modelos.Persona;

public class ProveedorComparaciones {

    public int comprarPorNombre(Persona per1, Persona per2){
        return per1.getNombre().compareTo(per2.getNombre());
    }

    public int compararPorEdad(Persona per1, Persona per2){
        return per1.getEdad().compareTo(per2.getEdad());
    }
}
