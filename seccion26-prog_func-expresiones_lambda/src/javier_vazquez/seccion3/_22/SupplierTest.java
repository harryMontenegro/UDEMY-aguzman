package javier_vazquez.seccion3._22;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> i = () -> "Javier";
        System.out.println("El valor obtenido es: " + i.get());
    }
}
