package poo.interfaces._212.imprenta;

import poo.interfaces._212.imprenta.modelo.*;
import static poo.interfaces._212.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(new Persona("Jhon",  "Doe"), "Ingeniero en sistemas", "Resumen laboral...");
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
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
