package optional._300.repositorio;

import optional._300.models.Computador;
import optional._300.models.Fabricante;
import optional._300.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {

    private List<Computador> datasource;

    public ComputadorRepositorio() {
        datasource = new ArrayList<>();
        Procesador proc = new Procesador("I9-9880H", new Fabricante("Intel"));
        Computador asus = new Computador("Asus ROG", "Strinx G512");
        asus.setProcesador(proc);
        datasource.add(asus);
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
