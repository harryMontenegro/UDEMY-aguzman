package arreglos;

import java.util.Scanner;

public class _113EjemploArreglosEliminarElemento {
    public static void main(String[] args) {

        int[] a = new int[10];


        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese una posición a eliminar entre 0 - 9: ");
        int posicion = s.nextInt();


        for (int i = posicion; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }


        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]);
        }

        int[] b = new int[a.length - 1];
        //Método arraycopy() de la clase System permite hacer copia de un arreglo
        System.arraycopy(a, 0, b, 0, b.length);
        a = b;// El arreglo b queda como un arreglo temporal
        System.out.println("Nuevo arreglo");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]);
        }
    }
}











