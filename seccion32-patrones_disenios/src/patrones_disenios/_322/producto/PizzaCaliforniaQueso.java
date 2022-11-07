package patrones_disenios._322.producto;

import patrones_disenios._322.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza california Queso";
        masa = "Masa a la piedra delgada";
        salsa = "Salsa tomate con rucula";
        ingredientes.add("Extra Queso Mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35min a 100ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triangulos");
    }
}
