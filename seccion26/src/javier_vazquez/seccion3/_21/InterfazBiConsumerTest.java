package javier_vazquez.seccion3._21;

import java.util.function.BiConsumer;

public class InterfazBiConsumerTest {
    public static void main(String[] args) {

        BiConsumer<Double, Double> biConsumer = (num1, num2) -> {
            double mul = num1 * num2;
            System.out.println("La multiplicación es: " + mul);
        };

        biConsumer.accept(15.2, 52.25);
    }
}
