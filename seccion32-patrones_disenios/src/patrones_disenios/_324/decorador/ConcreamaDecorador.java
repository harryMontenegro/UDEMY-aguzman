package patrones_disenios._324.decorador;

import patrones_disenios._324.Configurable;

public class ConcreamaDecorador extends CafeDecorador{

    public ConcreamaDecorador(Configurable cafe) {
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
