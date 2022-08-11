package api_collections._2_ArrayList._249;

import api_collections._2_ArrayList._249.modelo.Alumno;

import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("esta vacia = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 5));//Método propìo de LinkedList<>, si se declara tipo de variable List<> no se puede implementar estos métodos
        enlazada.addLast(new Alumno("Atenea", 6));//Método propìo de LinkedList<>, si se declara tipo de variable List<> no se puede implementar estos métodos
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Primero: " + enlazada.getFirst());
        System.out.println("Ultimo: " + enlazada.getLast());
        System.out.println("Indice 2: " + enlazada.get(2));

        //Métodos peek() son equivalentes a los métodos getFirst() y getLast() y no lanzan excepción, retorna null si el elemento no existe.
        System.out.println("Primero: " + enlazada.peekFirst());//Recibe, pero no elimina el elemento de la lista.
        System.out.println("Ultimo: " + enlazada.peekLast());//Recibe, pero no elimina el elemento de la lista.

        //Métodos remove...() remueve el elemento y lo retorna y lanza excepciones;
        Alumno zeus = enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + ", size = " + enlazada.size());

        //Métodos poll...() remueve el elemento y lo retorna y no lanza excepciones;
        enlazada.poll(); // Siempre remueve y retorna el primer elemento y retorna null si no lo encuentra

        //Métodos pop...() remueve el elemento y lo retorna y lanza excepciones;
        enlazada.pop(); // Siempre remueve y retorna el primer elemento y no retorna null si no lo encuentra

        enlazada.remove(new Alumno("Jano", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        Alumno a = new Alumno("Lucas", 5);
        enlazada.addLast(a);

        //Método enlazada.indexOf(a) retorna el índice del elemento pasado por argumento
        System.out.println("Índice de lucas = " + enlazada.indexOf(a));

        //remueve por el índice
        enlazada.remove(2);
        System.out.println(enlazada + ", size = " + enlazada.size());

        //Mètodo set()
        enlazada.set(3, new Alumno("Lalo", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

    }
}













