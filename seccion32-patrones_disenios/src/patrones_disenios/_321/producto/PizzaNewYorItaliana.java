package patrones_disenios._321.producto;

import patrones_disenios._321.PizzaProducto;

public class PizzaNewYorItaliana extends PizzaProducto {

    public PizzaNewYorItaliana() {
        super();
        nombre = "Pizza italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiana con carne";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamon");
        ingredientes.add("Chiricillo");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30min a 120ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos grandes");
    }
}
