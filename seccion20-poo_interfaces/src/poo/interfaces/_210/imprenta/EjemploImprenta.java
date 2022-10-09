package poo.interfaces._210.imprenta;

import poo.interfaces._210.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Jhon Doe", "Ingeniero en sistemas", "Resumen laboral...");
        cv.addExperiecia("Java");
        cv.addExperiecia("Otracle DBA");
        cv.addExperiecia("Spring Framework");
        cv.addExperiecia("Desarrollador fullstack");
        cv.addExperiecia("Angular");


        Informe informe = new Informe("Martin Fowler","James", "Estudio de microservicios");

        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
