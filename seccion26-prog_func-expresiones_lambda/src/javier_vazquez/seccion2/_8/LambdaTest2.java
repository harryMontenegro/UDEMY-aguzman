package javier_vazquez.seccion2._8;

public class LambdaTest2 {
    public static void main(String[] args) {

        Operaciones op = (num1, num2) -> System.out.println(num1 + num2);

        op.imprimeOperacion(15, 30);

        miMetodo(op, 25, 30);

        //Invocación de un metodo que recibe un argumento de tipo de interfaz funcional
        miMetodo((num1, num2) -> System.out.println("parametro1: " + num1 + " parametro2: " + num2),
                25,
                30);
    }

    public static void miMetodo(Operaciones op, int num1, int num2) {
        op.imprimeOperacion(num1, num2);
    }
}
