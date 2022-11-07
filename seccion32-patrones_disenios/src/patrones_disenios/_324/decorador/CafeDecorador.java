package patrones_disenios._324.decorador;

import patrones_disenios._324.Configurable;

abstract public class CafeDecorador implements Configurable {

    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }

}
