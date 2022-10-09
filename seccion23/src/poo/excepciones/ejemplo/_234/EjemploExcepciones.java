package poo.excepciones.ejemplo._234;

import javax.swing.*;

// Excepciones unchecked: es cuando no nos obliga a manejar el error bien sea con un try catch o lanzandolo por algún metodo
public class EjemploExcepciones {
    public static void main(String[] args) {
        //Nota: a medida que el aplicativo recorra el flujo se deben ir capturando las excepciones en el mismo orden
        String valor = JOptionPane.showInputDialog("Ingrese un entero");
        int divisor;
        try {
            divisor = Integer.parseInt(valor);
            int division = 10 / divisor;
            System.out.println(division);
        } catch (NumberFormatException nfe) {
            System.out.println("Se detecto una excepción: por favor ingrese un valor numérico: " + nfe.getMessage());
            main(args);
        } catch (ArithmeticException ae) {
            System.out.println("Capturamos la excepción en tiempo de ejecución " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con o sin excepción!");
        }
        System.out.println("Continuamos con el fluo de nuestra aplicación");
    }
}
