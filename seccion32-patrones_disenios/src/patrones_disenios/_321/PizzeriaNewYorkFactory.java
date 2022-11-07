package patrones_disenios._321;

import patrones_disenios._321.producto.PizzaNewYorItaliana;
import patrones_disenios._321.producto.PizzaNewYorkPeperonni;
import patrones_disenios._321.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPeperonni();
            case "italiana" -> new PizzaNewYorItaliana();
            default -> null;
        };
    }
}
