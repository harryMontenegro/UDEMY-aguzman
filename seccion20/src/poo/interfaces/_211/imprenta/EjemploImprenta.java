package poo.interfaces._211.imprenta;

import poo.interfaces._211.imprenta.modelo.*;
import static poo.interfaces._211.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Jhon Doe", "Ingeniero en sistemas", "Resumen laboral...");
        cv.addExperiecia("Java");
        cv.addExperiecia("Otracle DBA");
        cv.addExperiecia("Spring Framework");
        cv.addExperiecia("Desarrollador fullstack");
        cv.addExperiecia("Angular");

        Libro libro = new Libro("Erich Gamma", "Patrones de diseño: Elem. Reusables POO", PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Composite"))
                .addPagina(new Pagina("Patron Facade"));


        Informe informe = new Informe("Martin Fowler","James", "Estudio de microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
