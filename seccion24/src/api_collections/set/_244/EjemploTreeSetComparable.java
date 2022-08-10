package api_collections.set._244;

import api_collections.set._244.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        Set<Alumno> sa = new TreeSet<>((a,b)-> b.getNota().compareTo(a.getNota()));// Si la clase alumno tiene la implementación Comparable, y se pasa una implementación al vuelo, esta sobreescribe la implementada en la clase
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));

        //El objeto genérico (TreeSet<objGenérico>) debe cumplir la regla de ser comparable para que pueda ordenarse de forma natural y para que pueda agregarse al TreeSet<>
        System.out.println(sa);
    }
}
