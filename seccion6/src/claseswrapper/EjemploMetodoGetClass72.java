package claseswrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass72 {
    public static void main(String[] args) {

        String texto = "Hola que tal!";

        Class srtClass = texto.getClass();

        System.out.println("srtClass.getName() = " + srtClass.getName());
        System.out.println("srtClass.getName() = " + srtClass.getSimpleName());
        System.out.println("srtClass.getName() = " + srtClass.getPackageName());
        System.out.println("srtClass.getName() = " + srtClass);

        for (Method metodo : srtClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }

        Integer numero = 34;
        Class intClass = numero.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + intClass);
        System.out.println("intClass = " + intClass.getName());
        System.out.println("intClass = " + intClass.getSimpleName());
        System.out.println("intClass = " + intClass.getPackage());
        System.out.println("intClass = " + intClass.getPackage().getName());
        System.out.println("intClass = " + intClass.getSuperclass());
        System.out.println("intClass = " + intClass.getSuperclass().getSuperclass());
        System.out.println("intClass = " + intClass.getSuperclass().getSuperclass());


        for (Method metodo : objClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }

    }
}
