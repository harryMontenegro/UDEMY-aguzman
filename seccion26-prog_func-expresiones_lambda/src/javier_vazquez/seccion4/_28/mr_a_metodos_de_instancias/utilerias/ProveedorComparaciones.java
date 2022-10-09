package javier_vazquez.seccion4._28.mr_a_metodos_de_instancias.utilerias;

import javier_vazquez.seccion4._28.mr_a_metodos_de_instancias.modelos.Persona;

public class ProveedorComparaciones {

    public int comprarPorNombre(Persona per1, Persona per2){
        return per1.getNombre().compareTo(per2.getNombre());
    }

    public int compararPorEdad(Persona per1, Persona per2){
        return per1.getEdad().compareTo(per2.getEdad());
    }
}
