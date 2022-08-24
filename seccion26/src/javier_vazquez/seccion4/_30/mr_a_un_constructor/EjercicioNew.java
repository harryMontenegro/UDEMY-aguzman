package javier_vazquez.seccion4._30.mr_a_un_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EjercicioNew {
    public static void main(String[] args) {

        List<String> numerosEnString = List.of("10","10","15","15","25","30","40","6","30");

        getResults(numerosEnString, Integer::new).forEach(EjercicioNew::multiplicarPor10);
    }

    public static List<Integer> getResults(List<String> datos, Function<String, Integer> fung){
        List<Integer> resultados = new ArrayList<>();
        datos.forEach(strNum -> resultados.add(fung.apply(strNum)));
        return resultados;
    }

    public static void multiplicarPor10(int numero){
        System.out.println("El nuevo valor del dato " + numero + " es: " + numero * 10);
    }
}









