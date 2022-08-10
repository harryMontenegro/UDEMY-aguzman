package api_collections.set._241;

import java.util.*;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        //Los HashSet<> no son ordenados, no mantienen orden de registro ni orden natural
        Set<String> hs = new HashSet<>();
        System.out.println(hs.add("uno"));
        System.out.println(hs.add("dos"));
        System.out.println(hs.add("tres"));
        System.out.println(hs.add("cuatro"));
        System.out.println(hs.add("cinco"));
        System.out.println(hs);

        //Los HashSet<> no se pueden ordenar, para ordenar un set primero se debe convertir a un tipo List<>
        //Collections.sort(hs);
        List<String> lista = new ArrayList<>(hs);
        Collections.sort(lista);

        //No permite elementos duplicados
        boolean b = hs.add("tres");
        System.out.println("Permite elementos duplicados  = " + b);
        System.out.println(hs);
    }
}
