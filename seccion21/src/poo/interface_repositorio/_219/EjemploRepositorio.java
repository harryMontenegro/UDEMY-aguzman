package poo.interface_repositorio._219;

import poo.interface_repositorio._219.modelo.Cliente;
import poo.interface_repositorio._219.repositorio.*;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Bea", "Gonzalez"));
        repo.crear(new Cliente("Luci", "Martinez"));
        repo.crear(new Cliente("Andrés", "Guzman"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("===== paginable =====");
        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar =====");
        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio)repo).listar("apellido", Direccion.ASC);

        for(Cliente c : clientesOrdenAsc){
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);
        System.out.println("=========");
        ((OrdenableRepositorio)repo).listar("nombre", Direccion.ASC).forEach(System.out::println);
        System.out.println("===== eliminar =====");
        //repo.eliminar(2);
        repo.listar().forEach(System.out::println);
    }
}












