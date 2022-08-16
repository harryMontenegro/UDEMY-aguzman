package javier_vazquez.seccion2._9;

public class LambdaTest3 {
    public static void main(String[] args) {

        engine((x, y) -> x + y);
        engine((x, y) -> x / y);
        engine((x, y) -> x * y);
        engine((x, y) -> x % y);

    }

    public static void engine(Calculadora cal){
        int x = 2 , y = 4;
        int resultado = cal.calcular(x, y);
        System.out.println(resultado);
    }
}
