package javier_vazquez.seccion9._50;

import java.util.Map;
import java.util.stream.Collectors;

public class OpReduccion2 {
    public static void main(String[] args) {

        Map<Long, String> idNombreMapa = Empleado.empleados().stream()
                .collect(Collectors.toMap(Empleado::getId, Empleado::getNombre));

        System.out.println(idNombreMapa);
        System.out.println("\n");

        Map<Empleado.Genero, String> generoANombre =  Empleado.empleados().stream()
                .collect(Collectors.toMap(Empleado::getGenero, Empleado::getNombre, (nom1, nom2) -> String.join(", ", nom1, nom2)));

        System.out.println(generoANombre);
    }
}
