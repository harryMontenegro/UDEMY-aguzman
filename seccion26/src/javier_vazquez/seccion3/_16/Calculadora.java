package javier_vazquez.seccion3._16;

import java.util.function.BiFunction;

public class Calculadora {

    public String cal(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2){
        return bi.apply(i1, i2);
    }
}
