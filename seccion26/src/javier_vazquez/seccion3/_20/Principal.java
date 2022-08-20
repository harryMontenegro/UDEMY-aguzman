package javier_vazquez.seccion3._20;

import java.util.List;
import java.util.function.Consumer;

public class Principal {
    public static void main(String[] args) {

        List<Estudiante> estudiantes = List.of(
                new Estudiante("Jhon", 6),
                new Estudiante("Mark", 5),
                new Estudiante("Felix",5),
                new Estudiante("Patrick", 6),
                new Estudiante("James", 3),
                new Estudiante("Peter", 10),
                new Estudiante("Mathew", 10),
                new Estudiante("Paul", 9),
                new Estudiante("James", 5),
                new Estudiante("Judas", 4),
                new Estudiante("Tomas", 8),
                new Estudiante("Felipe", 7),
                new Estudiante("Tom", 6),
                new Estudiante("Maria", 7),
                new Estudiante("Magdala", 7),
                new Estudiante("Amanda", 8),
                new Estudiante("Amada", 6),
                new Estudiante("Olivia", 9),
                new Estudiante("Cinthia", 9),
                new Estudiante("Felicias", 10),
                new Estudiante("Mancera", 5),
                new Estudiante("Arturo", 2),
                new Estudiante("Abdías", 10)
        );

        OperacionEstudiantes op = new OperacionEstudiantes();
        /*
        Consumer<Estudiante> cons1 = e -> System.out.println("Nombre: " + e.getNombre() + " Calificación: " + e.getCalificacion());
        System.out.println("Estudiantes sin calificación actualizada: ");
        op.aceptarTodos(estudiantes, cons1);

        System.out.println("\nEstudiantes con calificación actualizada: ");
        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion() * 1.15);
        op.aceptarTodos(estudiantes, cons2);
        op.aceptarTodos(estudiantes, cons1);*/

        Consumer<Estudiante> cons1 = e -> System.out.println("Nombre: " + e.getNombre() + " Calificación: " + e.getCalificacion());
        System.out.println("Estudiantes sin calificación actualizada: ");
        op.aceptarTodos(estudiantes, cons1);

        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion() * 1.15);
        Consumer<Estudiante> cons3 = cons2.andThen(cons1);

        System.out.println("\nEstudiantes con calificación actualizada: ");
        op.aceptarTodos(estudiantes, cons3);
    }
}










