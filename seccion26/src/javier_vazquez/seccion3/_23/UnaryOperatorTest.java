package javier_vazquez.seccion3._23;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
    public static void main(String[] args) {

        List<Integer> lista = List.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        //La interfaz UnaryOperator<?> extiende de Function y esta recibe un tipo genérico por lo cual recibirá un argumento y retornará del mismo tipo genérico.
        List<Integer> listaAct = operadorUnary((numero) -> numero *  numero, lista);
        listaAct.forEach(x -> System.out.println(x));

    }

    public static List<Integer> operadorUnary(UnaryOperator<Integer> unaryOpt, List<Integer> lista){

        List<Integer> listaActualizada = new ArrayList<>();
        lista.forEach(num -> listaActualizada.add(unaryOpt.apply(num)));
        return listaActualizada;

    }
}








