package claseswrapper;

public class _70WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        // Son iguales porque a num2 se le pasa la referencia de num1, al comprarlos con ==,  num1 como num2 apuntan a la misma referencia
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //NOTA: cuando se compara primitivos con el == lo hace por el valor
        //pero cuando se compara de referencia u objetos lo hace por la instancia
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        // Al setear un valor, se crea un objeto nuevo, por hendé lo hace diferente a num1 cuando se compara con ==
        num2 = 128;

        //Nota2 curiosa: Si se le asigna a una variable el valor de 127,
        // java compara por valor con el operador ==, si es más de 127 lo comprara por referencia.
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));

        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));

        System.out.println("Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

        num2 = 500;
        //Cuando se usa el >, >=, <, <=, al igual que una operación aritmética y relacional excepto el == de
        // forma automática se puede trabajar con tipos de referencias, por debajo se hace un auto-unboxing
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);

    }
}
