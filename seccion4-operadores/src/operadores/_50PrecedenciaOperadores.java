package operadores;

public class _50PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3D;
        System.out.println("promedio = " + promedio);

        // En el caso de que se encuentre una division y multiplicación va a calcular de acuerdo el orden de izquierda a derecha (k / 3D * 10;)
        promedio = (i + j + k) / 3D * 10;
        System.out.println("promedio = " + promedio);

        //Primero aplica el pre incremento de i (15) luego el post decremento de j (8) luego divide k (20) entre 3,
        // el resultado de la division la multiplica por 10 luego suma 15 + 8 + el resultado de la division y multiplicación
        promedio = --i + j++ + k / 3D * 10;
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
