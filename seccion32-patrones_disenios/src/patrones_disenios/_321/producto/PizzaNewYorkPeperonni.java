package patrones_disenios._321.producto;

import patrones_disenios._321.PizzaProducto;

public class PizzaNewYorkPeperonni extends PizzaProducto {

    public PizzaNewYorkPeperonni() {
        super();
        nombre = "Pizza peperonni New York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra pepperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando 40 min a 90C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos");
    }
}
