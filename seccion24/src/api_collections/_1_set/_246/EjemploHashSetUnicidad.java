package api_collections._1_set._246;

import api_collections._1_set._246.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> sa = new HashSet<>();
        //List<Alumno> sa = new ArrayList<>();
        //List<Alumno> sa = new LinkedList<>();//Son ordenados y mantienen el orden de agregado
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
        System.out.println(sa);


        //Solo los List<> pueden emplear iteración con los for clásicos
        /*
        System.out.println("Iterando usando un for clasico");
        for(int i = 0; i < sa.size(); i++){
            //Los List<> tienen el método get(índice), los Set<> no lo tienen
            Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }*/

        System.out.println("Iterando usando forEach");
        for (Alumno a: sa) {
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando while e iterator");
        //Tódo Collection tiene el método iterator
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);

    }
}
