package api_collections.set._243;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        //Los TreeSet<> son Set que son ordenados de forma natural
        //Tienen un costo de rendimiento porque son ordenados en diferencia en los HashSet<>
        Set<String> ts = new TreeSet<>((a,b) -> b.compareTo(a));//El orden se puede cambiar bien sea de forma ASC o DESC pasando por argumento una implementación de la interfaz Comparator
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        //No permiten duplicados
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        //No mantiene el orden en como se registran si no, en el orden natural (alfabético, numérico, etc)
        // Ejem: ts = [cinco, cuatro, dos, tres, uno]
        //El objeto genérico (TreeSet<objGenérico>) debe cumplir la regla de ser comparable para que pueda ordenarse de forma natural y para que pueda agregarse al TreeSet<>
        System.out.println("ts = " + ts);

        //Otra forma de hacer Set<Integer> numeros = new TreeSet<>((a,b) -> b.compareTo(a)); es pasando Comparator.ReverseOrder()
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);

        System.out.println("numeros = " + numeros);

    }
}

















