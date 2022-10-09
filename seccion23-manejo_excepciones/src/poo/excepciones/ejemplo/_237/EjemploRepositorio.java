package poo.excepciones.ejemplo._237;


import poo.excepciones.ejemplo._237.modelo.Cliente;
import poo.excepciones.ejemplo._237.repositorio.Direccion;
import poo.excepciones.ejemplo._237.repositorio.OrdenablePaginableCrudRepositorio;
import poo.excepciones.ejemplo._237.repositorio.excepciones.AccesoDatoException;
import poo.excepciones.ejemplo._237.repositorio.excepciones.EscrituraAccesoDatoException;
import poo.excepciones.ejemplo._237.repositorio.excepciones.LecturaAccesoDatoException;
import poo.excepciones.ejemplo._237.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Jano", "Perez"));
            repo.crear(new Cliente("Bea", "Gonzalez"));
            repo.crear(new Cliente("Luci", "Martinez"));
            repo.crear(new Cliente("Andrés", "Guzman"));

            repo.crear(null);
            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);
            System.out.println("===== paginable =====");
            List<Cliente> paginable = repo.listar(1, 4);
            paginable.forEach(System.out::println);

            System.out.println("===== ordenar =====");
            List<Cliente> clientesOrdenAsc = repo.listar("apellido", Direccion.ASC);

            for (Cliente c : clientesOrdenAsc) {
                System.out.println(c);
            }

            System.out.println("===== editar =====");
            Cliente beaActualizar = new Cliente("Bea", "Mena");
            beaActualizar.setId(2);
            repo.editar(beaActualizar);
            Cliente bea = repo.porId(10);
            System.out.println(bea);
            System.out.println("=========");
            repo.listar("nombre", Direccion.ASC).forEach(System.out::println);
            System.out.println("===== eliminar =====");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);
            System.out.println("===== total =====");
            System.out.println("Total de registros: " + repo.total());

            //Siempre se debe ir primero los catch de las clases hijas y luego los padres
        } catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e) {
            System.out.println("Escritura: " + e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e) {
            System.out.println("Genérica: " + e.getMessage());
            e.printStackTrace();
        }
    }
}