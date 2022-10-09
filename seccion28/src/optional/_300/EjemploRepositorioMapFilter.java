package optional._300;

import optional._300.models.Computador;
import optional._300.models.Fabricante;
import optional._300.models.Procesador;
import optional._300.repositorio.ComputadorRepositorio;
import optional._300.repositorio.Repositorio;

import java.util.NoSuchElementException;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        /*
         String f = repositorio.filtrar("rog")
                 .map(Computador::getProcesador)
                 .map(Procesador::getFabricante)
                 .map(Fabricante::getNombre)
                 .orElseThrow(NoSuchElementException::new);

        String f2 = repositorio.filtrar("macbook")
                .map(Computador::getProcesador)
                .map(Procesador::getFabricante)
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        String f3 = repositorio.filtrar("rog")
                .map(Computador::getProcesador)
                .map(Procesador::getFabricante)
                .filter(fab -> "amd".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");*/


        //NOTA: flatMap() en Optional es parecido al flatMap() de Stream, con la diferencia de que Optional.flatMap() retorna un Optional que se aplana en el flujo de Optional (otra corriente Optional),
        //mientras que en Stream.flatMap() aplana el flujo de Stream (otra corriente Stream).
        String f4 = repositorio.filtrar("mackboo")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "amd".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        /*System.out.println(f);
        System.out.println(f2);
        System.out.println(f3);*/
        System.out.println(f4);

    }
}
