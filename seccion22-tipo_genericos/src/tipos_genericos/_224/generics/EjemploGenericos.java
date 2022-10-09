package tipos_genericos._224.generics;

import tipos_genericos._224.poointerfaces.modelo.Cliente;
import tipos_genericos._224.poointerfaces.modelo.ClientePremiun;

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

        List<ClientePremiun> clientesPremiunList = fromArrayToList(
                new ClientePremiun[]{new ClientePremiun("Paco", "Fernandez")});

        imprimirClientes(cliente);
        imprimirClientes(clientesLista);
        imprimirClientes(clientesPremiunList);
    }

    //También se puede aplicar sobrecarga, de cierto modo al limitar el genérico influye en la firma del método
    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    //Cuando especificamos extend limitamos el genérico que sea clase hija de ese tipo (<T extends Number>)
    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    //Con el operador & en genéricos se puede limitar más los genéricos
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G elemento : x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    //El comodin ? (? extends Cliente)  permite especificar que pueden pasar obj de tipo super clase y sus hijos
    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }


}




















