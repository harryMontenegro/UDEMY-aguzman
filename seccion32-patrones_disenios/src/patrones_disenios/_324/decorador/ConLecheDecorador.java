package patrones_disenios._324.decorador;

import patrones_disenios._324.Configurable;

public class ConLecheDecorador extends CafeDecorador{

    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 3.7F;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", " + "Leche";
    }
}
