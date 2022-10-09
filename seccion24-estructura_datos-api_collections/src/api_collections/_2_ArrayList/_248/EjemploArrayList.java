package api_collections._2_ArrayList._248;

import api_collections._2_ArrayList._247.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("esta vacia = " + al.isEmpty());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(2, new Alumno("Jano", 7));
        al.set(3, new Alumno("Andres", 3));//Método set(índice, obj) se asigna el obj en la posición índice y modifica lo que esté en esa posición y lo retorna

        System.out.println(al + ", size = " + al.size());

        //al.remove(new Alumno("Jano", 7));// con remove(obj) elimina el elemento de acuerdo a al método equal(), y retorna boolean
        al.remove(2);// con remove(índice) elimina el elemento que esté en el índice pasado por argumento, y retorna boolean
        System.out.println(al + ", size = " + al.size());

        boolean b = al.contains(new Alumno("Cata", 6));// contains(obj) verifica si la lista contiene un elemento idéntico al argumento.
        System.out.println("La lista contiene a Jano = " + b);

        Object a[] = al.toArray();
        for(int i = 0; i < a.length; i++){
            System.out.println("Desde el arreglo = " + a[i]);
        }
    }
}













