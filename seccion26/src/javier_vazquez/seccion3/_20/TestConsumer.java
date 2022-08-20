package javier_vazquez.seccion3._20;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {

        Consumer<String> cons = x -> System.out.println(x.toUpperCase());
        cons.accept("Javier");
    }
}
