package javier_vazquez.seccion3._20;

import java.util.List;
import java.util.function.Consumer;

public class OperacionEstudiantes {

    public void aceptarTodos(List<Estudiante> estudiantes, Consumer<Estudiante> cons) {
        for (Estudiante estudiante : estudiantes) {
            cons.accept(estudiante);
        }
    }
}
