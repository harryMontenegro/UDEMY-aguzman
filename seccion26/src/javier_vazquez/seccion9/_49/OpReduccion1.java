package javier_vazquez.seccion9._49;

import java.util.*;
import java.util.stream.Collectors;

public class OpReduccion1 {
    public static void main(String[] args) {

        List<String> nombres = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println(nombres);

        List<String> nombres2 = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toList());

        System.out.println(nombres2);

        Set<String> nombres3 = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toSet());

        SortedSet<String> nombres4 = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(nombres4);


    }
}
