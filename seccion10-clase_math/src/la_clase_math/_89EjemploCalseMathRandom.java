package la_clase_math;

import java.util.Random;

public class _89EjemploCalseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde" ,"blanco", "negro"};

        //Método para generar un número aleatorio decimal entre 0 y 1, pero el 1 no es inclusive, es decir nunca va a llegar al 1
        // Si se va multiplicando por múltiplos de 10, es decir, x10, x100 etc va generando números más enteros
        double random = Math.random();
        System.out.println("random = " + random);

        //Número aleatorio entre 0 y 7, pero el 7 no se incluye
        //Min 4:01//random *= 7;
        System.out.println("random = " + random);

        //Min 4:01//random = Math.floor(random);
        //Min 4:01//System.out.println("random = " + random);

        //Min 4:01
        random *= colores.length;
        random = Math.floor(random);
        System.out.println("random = " + random);
        System.out.println("colores = " + colores[(int) random]);


        //Clase Random de java util (es más versátil y es más flexible que el de la clase Math)
        Random randomObj = new Random();
        //Clase Random de java util tiene los métodos next() para generar random de acuerdo a los tipos de datos que se requiera
        int randomInt = randomObj.nextInt();//retorna rangos grandes incluyendo negativos
        System.out.println("randomInt = " + randomInt);

        long randomLong = randomObj.nextLong();//retorna rangos grandes incluyendo negativos
        System.out.println("randomLong = " + randomLong);

        randomInt = randomObj.nextInt(25);//retorna rangos grandes incluyendo negativos y recibe un límite
        System.out.println("randomInt = " + randomInt);

        // Si se requiere generar rangos entre 2 números se debe sumar y restar el mínimo. Ejemplo un aleatorio entre 15 y 25 el 25 se excluye
        randomInt = 15 + randomObj.nextInt(25 - 15);//retorna rangos grandes incluyendo negativos y recibe un límite
        System.out.println("randomInt = " + randomInt);

        // Si se requiere generar rangos entre 2 números se debe sumar y restar el mínimo. Ejemplo un aleatorio entre 15 y 25 y el 25 se incluye
        randomInt = 15 + randomObj.nextInt(25 - 15 + 1);//retorna rangos grandes incluyendo negativos y recibe un límite
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
    }
}

















