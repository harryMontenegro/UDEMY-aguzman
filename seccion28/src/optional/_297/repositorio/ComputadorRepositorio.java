package optional._297.repositorio;

import optional._297.models.Computador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador>{

    private List<Computador> datasource;

    public ComputadorRepositorio() {
        datasource = new ArrayList<>();
        datasource.add(new Computador("Asus ROG", "Strinx G512"));
        datasource.add(new Computador("Macbook Pro", "MVK2CI"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        /*for(Computador c: datasource){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }*/
        return datasource.stream()
                .filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();
    }
}
