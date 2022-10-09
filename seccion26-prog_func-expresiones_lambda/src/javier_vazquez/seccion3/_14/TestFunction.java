package javier_vazquez.seccion3._14;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {

        //Function anónima
        Function<Integer, String> convertidor2 = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return null;
            }
        };

        //Function Lambda
        Function<Integer, String> convertidor = x -> Integer.toString(x);
        System.out.println(convertidor.apply(3).length());
        System.out.println(convertidor.apply(30).length());
    }
}
























