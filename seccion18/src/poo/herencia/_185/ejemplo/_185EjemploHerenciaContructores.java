package poo.herencia._185.ejemplo;

import poo.herencia._185.Alumno;
import poo.herencia._185.AlumnoInternacional;
import poo.herencia._185.Persona;
import poo.herencia._185.Profesor;

public class _185EjemploHerenciaContructores {
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
        System.out.println("Imprimiendo datos en común del tipo Persona:");
        System.out.println("nombre: " + persona.getNombre()
                + ", apellido: " + persona.getApellido()
                + ", edad: " + persona.getEdad()
                + ", email: " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo datos del tipo Alumno:");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matemática: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo datos del tipo AlumnoInternacional:");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }

            System.out.println("===============Sobre escritura promedio ====================");
            System.out.println("Promedio: " + ((Alumno)persona).calcularPromedio());
            System.out.println("===========================================================");
        }

        if(persona instanceof Profesor){
            System.out.println("Imprimiendo datos del tipo Profesor:");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("===============Sobre escritura saludar ====================");
        System.out.println(persona.saludar());
        System.out.println("===========================================================");
    }
}

























