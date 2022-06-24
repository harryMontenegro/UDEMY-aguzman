package flujodecontrol;

public class _53SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 2.5F;

        if (promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio!");
        } else if (promedio >= 6.0) {
            System.out.println("Muy buen promedio!");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, necesitas un poco mas de esfuerzo!");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar un poco mas!");
        } else {
            System.out.println("Reprobado");
        }

        System.out.println("promedio = " + promedio);
    }
}
