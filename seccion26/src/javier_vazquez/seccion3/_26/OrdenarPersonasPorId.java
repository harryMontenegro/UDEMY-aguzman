package javier_vazquez.seccion3._26;

import java.util.Comparator;

public class OrdenarPersonasPorId implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getIdPersona() - o2.getIdPersona();
    }
}
