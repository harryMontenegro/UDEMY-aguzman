package patrones_disenios._322.ejemplo;


import patrones_disenios._322.PizzaProducto;
import patrones_disenios._322.PizzeriaCaliforniaFactory;
import patrones_disenios._322.PizzeriaNewYorkFactory;
import patrones_disenios._322.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Andres ordena una " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena la pizza " + pizza.getNombre());

        pizza = california.ordenarPizza("pepperoni");
        System.out.println("Jhon ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);
    }

}
