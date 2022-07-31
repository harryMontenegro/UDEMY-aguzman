package tipos_genericos._222.generics;

import tipos_genericos._222.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> cliente = new ArrayList<>();
        cliente.add(new Cliente("Andrés", "Guzman"));

        Cliente andres = cliente.iterator().next();

        Cliente[] clientesArreglos = {new Cliente("Luci", "Martínez"),
                new Cliente("Andrés", "Guzman")};
        Integer[] enterosArreglos = {1, 2, 3};
        List<Cliente> clientesLista = fromArrayToList(clientesArreglos);
        List<Integer> enterosLista = fromArrayToList(enterosArreglos);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andrés", "Pepe", "Luci", "Bea","Jhon"}, enterosArreglos);
        nombres.forEach(System.out::println);
    }

    //Con la especificidad <T> denotamos que el método va a ser genérico
    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G elemento : x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }
}




















