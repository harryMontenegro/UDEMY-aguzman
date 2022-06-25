package la_clase_math;

public class _86EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        // Math.ceil(3.5) metodo usado para redondear hacia arriba al siguiente cifra
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        // Math.floor(3.5) metodo usado para redondear hacia abajo a la cifra anterior
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        //Redonde un double y retorna un long
        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);




    }
}
