package javier_vazquez.seccion3._16;

public class EjercicioBiFunction2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        String resultado = calculadora.cal((x,y)-> ": " + (x * y), 60, 10);

        System.out.println("Resultado es: " + resultado);
    }

}
