package patrones_disenios._327;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends Observable{
    private List<String> repositorio = new ArrayList<>();

    public void crearUsuario(String usuario){
        repositorio.add(usuario);
        notifyObserver(usuario);
    }
}
