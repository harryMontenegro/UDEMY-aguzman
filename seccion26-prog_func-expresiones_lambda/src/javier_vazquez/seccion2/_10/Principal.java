package javier_vazquez.seccion2._10;

public class Principal {
    public static void main(String[] args) {

        //Asignación a una referencia del tipo de la interfaz funcional
        CalculadoraInt calInt = (x , y) -> x + y;
        CalculadoraLong calLong = (x , y) -> x + y;

        engine(calInt);
        engine(calLong);

        //Como casting en una invocación
        engine((CalculadoraLong)(x , y) -> x + y);
    }

    public static void engine(CalculadoraInt cal){

    }

    public static void engine(CalculadoraLong cal){

    }
}
