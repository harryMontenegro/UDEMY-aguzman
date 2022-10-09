package poo.interfaces._213.imprenta;

import poo.interfaces._213.imprenta.modelo.*;

import static poo.interfaces._213.imprenta.modelo.Genero.*;
import static poo.interfaces._213.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(new Persona("Jhon", "Doe"), "Ingeniero en sistemas", "Resumen laboral...");
        cv.addExperiecia("Java")
                .addExperiecia("Otracle DBA")
                .addExperiecia("Spring Framework")
                .addExperiecia("Desarrollador fullstack")
                .addExperiecia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseño: Elem. Reusables POO", PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Composite"))
                .addPagina(new Pagina("Patron Facade"));


        Informe informe = new Informe(new Persona("Martin", "Fowler"), new Persona("James", "Gosling"), "Estudio de microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);


        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima";
            }
        });

        System.out.println(TEXTO_DEFECTO);
    }
}
