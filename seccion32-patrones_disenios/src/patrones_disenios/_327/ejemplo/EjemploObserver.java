package patrones_disenios._327.ejemplo;

import patrones_disenios._327.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {

        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver((observable, obj) -> {
            System.out.println("Jhon " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Andres " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Maria " + observable);
        });

        google.modificaPrecio(2000);
    }
}
