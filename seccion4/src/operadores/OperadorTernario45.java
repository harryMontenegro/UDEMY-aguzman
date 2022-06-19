package operadores;

import java.util.Scanner;

public class OperadorTernario45 {
    public static void main(String[] args) {

        // variable = condicion ? si es verdadero : si es falso;
        String variable = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 5.2;

        double matematicas = 0.;
        double ciencias = 0.;
        double historias = 0.;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematicas entre 2 y 7:");
        matematicas = scanner.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2 y 7:");
        ciencias = scanner.nextDouble();
        System.out.println("Ingrese la nota de historias entre 2 y 7:");
        historias = scanner.nextDouble();

        promedio = (matematicas + ciencias + historias) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

        //Equivalente
/*        if(promedio >= 5.49){
            estado =  "Aprobado";
        }else{
            estado = "Rechazado";
        }*/


    }
}
