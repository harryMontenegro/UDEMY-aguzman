package poo.herencia._180.ejemplo;

import poo.herencia._180.*;

public class _180EjemploHerencia {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Andrés");
        alumno.setApellido("Guzman");
        alumno.setInstitucion("Instituto Nacional");

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matemática");

        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion());

        System.out.println("Profesor " + profesor.getAsignatura()
                + ": " + profesor.getNombre()
                + " " + profesor.getApellido());
    }
}
