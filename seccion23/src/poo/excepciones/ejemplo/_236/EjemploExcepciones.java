package poo.excepciones.ejemplo._236;

import javax.swing.*;

// Excepciones unchecked: es cuando no nbos obliga a manejar el error bien sea con un try catch o lanzandolo por algún metodo
public class EjemploExcepciones {
    public static void main(String[] args){
        //Nota: a medida que el aplicativo recorra el flujo se deben ir capturando las excepciones en el mismo orden
        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");

        try {
            double division2 = cal.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        }catch (FormatoNumeroException e ){
            System.out.println("Se detecto una excepción: ingrese un número válido: " + e.getMessage());
            e.printStackTrace(System.out);
        }catch (DivisionPorZeroException ae) {
            System.out.println("Capturamos la excepción en tiempo de ejecución " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con o sin excepción!");
        }
        System.out.println("Continuamos con el fluo de nuestra aplicación");
    }
}
