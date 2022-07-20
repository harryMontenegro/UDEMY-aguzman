package poo.herencia._186.ejemplo;

import poo.herencia._186.Alumno;
import poo.herencia._186.AlumnoInternacional;
import poo.herencia._186.Persona;
import poo.herencia._186.Profesor;

public class _186EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("======= creando la instancia de la clase Alumno ===============");
        Alumno alumno = new Alumno("Andrés", "Guzman", 13, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("andre@correo.com");

        System.out.println("======= creando la instancia de la clase AlumnoInternacional ===============");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@correo.com");


        System.out.println("======= creando la instancia de la clase Profesor ===============");
        Profesor profesor = new Profesor("Luci", "Perez", "Matemática");
        profesor.setEdad(37);
        profesor.setEmail("profesor.luci@correo.com");

        System.out.println("======= --- =========");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {
        System.out.println("=================================");
        System.out.println(persona);
    }
}




