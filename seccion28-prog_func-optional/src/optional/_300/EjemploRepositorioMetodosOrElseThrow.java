package optional._300;

import optional._300.models.Computador;
import optional._300.repositorio.ComputadorRepositorio;
import optional._300.repositorio.Repositorio;

import java.util.NoSuchElementException;
import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //Metodo orElseThrow() recibe un Supplier<T> que representara una Exceptions, bien sea propia o existente en el lenguaje Java
        //Computador pc = repositorio.filtrar("rogss").orElseThrow(()-> new IllegalStateException("No se encontro el obj"));
        Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);

        String archivo = "documento.pdf";

        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow(NoSuchElementException::new);

        System.out.println(extension);
    }
}
