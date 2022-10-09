package api_collections._1_set._245;

import api_collections._1_set._245.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        Set<Alumno> sa = new TreeSet<>((a, b)-> b.getNota().compareTo(a.getNota()));// Si la clase alumno tiene la implementación Comparable, y se pasa una implementación de Comparator al vuelo, esta sobreescribe la implementada en la clase
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 8));
        //El método de comparación para determinar un repetido (Regla Unicidad)es la implementación del método CompareTo en la clase o en la implementación al vuelo de Comparator
        sa.add(new Alumno("Lucas", 8));

        //El objeto genérico (TreeSet<objGenérico>) debe cumplir la regla de ser comparable para que pueda ordenarse de forma natural y para que pueda agregarse al TreeSet<>
        System.out.println(sa);
    }
}
