package javier_vazquez.seccion7._41;

import java.util.List;
import java.util.function.Predicate;

public class OperacionesFilter {
    public static void main(String[] args) {

        List<Empleado> empleados = Empleado.empleados();

        System.out.println("Empleados hombres: ");
        empleados.stream()
                .filter(new Predicate<Empleado>() {
                    @Override
                    public boolean test(Empleado empleado) {
                        return empleado.esHombre();
                    }
                }).forEach(emp -> System.out.println(emp.getNombre()));
    }
}





















