package patrones_disenios._322;


import patrones_disenios._322.producto.PizzaCaliforniaPepperoni;
import patrones_disenios._322.producto.PizzaCaliforniaQueso;
import patrones_disenios._322.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{

    @Override
    protected PizzaProducto crearPizza(String tipo) {
        return switch (tipo){
            case "queso" -> new PizzaCaliforniaQueso();
            case "pepperoni" -> new PizzaCaliforniaPepperoni();
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            default -> null;
        };
    }
}
