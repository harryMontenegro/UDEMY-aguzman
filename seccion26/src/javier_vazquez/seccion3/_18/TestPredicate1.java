package javier_vazquez.seccion3._18;

import java.util.function.Predicate;

public class TestPredicate1 {
    public static void main(String[] args) {

        Predicate<Integer> predicate = valor -> valor > 0;

        System.out.println(predicate.test(123));
    }
}
