package optional._298;

import optional._298.models.Computador;
import optional._298.repositorio.ComputadorRepositorio;
import optional._298.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //El metodo orElse() este presente o no el objeto, llama al metodo valorDefecto() consumiendo recursos y dejando el objeto en memoria
        Computador pc = repositorio.filtrar("rog").orElse(valorDefecto());
        System.out.println(pc);

        //El metodo orElseGet() este presente o no el objeto, no llama al metodo valorDefecto() por lo que es mas optimizado orElse()
        pc = repositorio.filtrar("macbook pro").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);
        System.out.println(pc);
    }

    public static Computador valorDefecto(){
        System.out.println("Opteniendo valor por defecto");
        return new Computador("Hp Omen", "LA0001");
    }
}
