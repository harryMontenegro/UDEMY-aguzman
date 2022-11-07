package patrones_disenios._324.decorador;

import patrones_disenios._324.Configurable;

public class ConCremaDecorador extends CafeDecorador{

    public ConCremaDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 2.5F;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", " + "Crema";
    }
}
