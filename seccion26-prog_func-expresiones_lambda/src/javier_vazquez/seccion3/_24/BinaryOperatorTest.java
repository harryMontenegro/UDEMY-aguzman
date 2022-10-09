package javier_vazquez.seccion3._24;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {

        //La interfaz BinaryOperator<?> extiende de BiFunction y esta recibe un tipo genérico por lo cual recibirá dos argumentos y retornará del mismo tipo genérico.
        BinaryOperator<Integer> bOperator = (num1, num2) -> num1 * num2;

        // Aplicando el método apply()
        int resultado = bOperator.apply(10, 20);
        System.out.println("El resultado es: " + resultado);

        //Uso de método estático minBy(Comparator)
        BinaryOperator<Integer> bOperatorMin = BinaryOperator.minBy((Integer t1, Integer t2) -> t1.compareTo(t2));
        resultado = bOperatorMin.apply(10, 20);
        System.out.println("El numero menor de 10 y 20 es: " + resultado);


        //Uso de método estático maxBy(Comparator)
        BinaryOperator<Integer> bOperatorMax = BinaryOperator.maxBy((Integer t1, Integer t2) -> t1.compareTo(t2));
        resultado = bOperatorMax.apply(10, 20);
        System.out.println("El numero mayor de 10 y 20 es: " + resultado);
    }
}












