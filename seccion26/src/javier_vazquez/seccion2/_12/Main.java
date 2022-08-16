package javier_vazquez.seccion2._12;

public class Main {
    public static void main(String[] args) {
        System.out.println(create().calculate(2, 2));
    }

    private static CalculadoraLong create(){
        long var = 20L;
        return (x, y) -> x / y + var;
    }
}
