package la_clase_math;

public class _87EjemploClaseMath {
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

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        //Math.pow(10, 3) funcion para calcular potencia 10 elevado a la 3
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        //Math.sqrt(5) funcion para calcular raíz cuadrada
        double raiz = Math.sqrt(5);
        System.out.println("raíz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir de radianes a grados = " + grados);


        double radianes = Math.toRadians(90.00);
        System.out.println("convertir de grados a radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0): " + Math.cos(radianes));
    }
}
















