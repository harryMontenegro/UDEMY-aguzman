package patrones_disenios._324;

import patrones_disenios._324.decorador.ConChocolateDecorador;
import patrones_disenios._324.decorador.ConLecheDecorador;
import patrones_disenios._324.decorador.ConCremaDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {

        Configurable cafe = new Cafe("Cafe mocha", 7);
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del cafe mocha es: " + conChoco.getPrecioBase());
        System.out.println("Los ingredientes: " + conChoco.getIngredientes());

        Configurable capuchino = new Cafe("Cafe capuchino", 4);
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del cafe capuchino es: " + conLeche.getPrecioBase());
        System.out.println("Los ingredientes: " + conLeche.getIngredientes());

        Configurable expreso = new Cafe("Cafe expreso", 3);
        System.out.println("El precio del cafe expreso es: " + expreso.getPrecioBase());
        System.out.println("Los ingredientes: " + expreso.getIngredientes());



    }
}
