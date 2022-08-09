package poo.excepciones.ejemplo._237;


import poo.excepciones.ejemplo._237.modelo.Producto;
import poo.excepciones.ejemplo._237.repositorio.Direccion;
import poo.excepciones.ejemplo._237.repositorio.OrdenablePaginableCrudRepositorio;
import poo.excepciones.ejemplo._237.repositorio.excepciones.AccesoDatoException;
import poo.excepciones.ejemplo._237.repositorio.excepciones.LecturaAccesoDatoException;
import poo.excepciones.ejemplo._237.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
            repo.crear(new Producto("Mesa", 50.52));
            repo.crear(new Producto("Silla", 18.));
            repo.crear(new Producto("Lampara", 15.5));
            repo.crear(new Producto("Notebook", 400.89));

            List<Producto> productos = repo.listar();
            productos.forEach(System.out::println);
            System.out.println("===== paginable =====");
            List<Producto> paginable = repo.listar(1, 4);
            paginable.forEach(System.out::println);

            System.out.println("===== ordenar =====");
            List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.ASC);

            for (Producto c : productosOrdenAsc) {
                System.out.println(c);
            }

            System.out.println("===== editar =====");
            Producto lamparaActualizar = new Producto("lampara", 23);
            lamparaActualizar.setId(3);
            repo.editar(lamparaActualizar);
            Producto lampara = repo.porId(2);
            System.out.println(lampara);
            System.out.println("=========");
            repo.listar("precio", Direccion.ASC).forEach(System.out::println);
            System.out.println("===== eliminar =====");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);
            System.out.println("===== total =====");
            System.out.println("Total de registros: " + repo.total());
        } catch (LecturaAccesoDatoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}