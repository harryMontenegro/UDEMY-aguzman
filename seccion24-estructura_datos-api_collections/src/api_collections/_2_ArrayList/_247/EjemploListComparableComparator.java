package api_collections._2_ArrayList._247;

import api_collections._2_ArrayList._247.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        //List<Alumno> sa = new ArrayList<>();
        List<Alumno> sa = new LinkedList<>();//Son ordenados y mantienen el orden de agregado
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus2", 2));
        //El método de comparación para determinar un repetido (Regla Unicidad) es la implementación del método equals() y hashCode() en la clase.
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Lucas", 2));
        sa.add(new Alumno("Lucas", 3));
        //Collections.sort(sa);// Con Collections.sort(sa) se aplica el ordenamiento por el método compareTo() sobreescrito en la clase Alumno
        //Collections.sort(sa, (a,b)-> b.getNota().compareTo(a.getNota()));//Con Collections.sort(sa, (a,b)-> a.getNota().compareTo(b.getNota())) pasándole la implementación al vuelo de la interfaz Comparator, En el TreeSet<>() se pasa por constructor a diferencia de los List<>
        //sa.sort((a, b) -> a.getNota().compareTo(b.getNota()));
        //sa.sort(Comparator.comparing((Alumno a ) -> a.getNota()).reversed());//Pasando una expresión lambda de la interfaz Comparator.comparing(Functions), el método reversed() cambia el orden a DESC
        sa.sort(Comparator.comparing(Alumno::getNota));//Pasando una expresión lambda de la interfaz Comparator.comparing(Functions), el método reversed() cambia el orden a DESC
        System.out.println(sa);


        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);

    }
}
