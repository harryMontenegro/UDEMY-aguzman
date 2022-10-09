package optional._297;

import optional._297.models.Computador;
import optional._297.repositorio.ComputadorRepositorio;
import optional._297.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        /*
        Optional<Computador> pc = repositorio.filtrar("asus");

        if (pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontró");
        }*/

        //ifPresentOrElse Disponible desde java 9 o superior
        //repositorio.filtrar("asus rog").ifPresentOrElse(System.out::println, () -> System.out.println("no se encontró"));
    }
}
