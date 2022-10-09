package la_clase_math;

public class _88EjemploCalseMathRandom {
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

    }
}
