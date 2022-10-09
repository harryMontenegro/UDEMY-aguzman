package flujodecontrol;

public class _59SentenciaFor {
    public static void main(String[] args) {


        for (int i = 0; i <= 10 ; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 10; i >= 0; i--){
            System.out.println("i = " + i);
        }

        for(int i = 1, j = 10; i < j; i++, j--){
            System.out.println(i + " - " + j);
        }

        for (int i = 0; i <= 10 ; i++) {
            if((i % 2 == 0)){
                // continue: lo que hace es salirse de la iteración a la siguiente iteración sin salirse del ciclo for,
                // por lo tanto, no termina de ejecutar lo demás en esa iteración
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
