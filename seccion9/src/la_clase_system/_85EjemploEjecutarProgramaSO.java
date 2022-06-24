package la_clase_system;

import java.io.IOException;

public class _85EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        //Runtime nos permite ejecutar aplicaciones con el método exec()
        Runtime rt = Runtime.getRuntime();

        //Al ejecutar algún programa lo que retorna es un objeto de tipo Process
        Process proceso;

        try {
            //Primero se valida el SO en el que estemos
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("notepad");
            } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = rt.exec("Calculadora");
            } else if (System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("gedit");
            } else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        } catch (Exception e) {
            System.err.println("El comando es desconocido " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}


















