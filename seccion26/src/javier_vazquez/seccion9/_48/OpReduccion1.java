package javier_vazquez.seccion9._48;

import java.util.ArrayList;
import java.util.List;

public class OpReduccion1 {
    public static void main(String[] args) {

        List<String> nombres = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        System.out.println(nombres);
    }
}
