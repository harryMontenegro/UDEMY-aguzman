package org.example._350;


import org.example._350.modelo.Producto;
import org.example._350.repositorio.ProductoRepositorioImpl;
import org.example._350.repositorio.Repositorio;

public class EjemploJdbcDelete {
    public static void main(String[] args) {
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();

            System.out.println("=================== listar ===================");
            repositorio.listar().forEach(System.out::println);

            System.out.println("=================== obtener por id ===================");
            System.out.println(repositorio.porId(1L));

            System.out.println("=================== eliminar producto ===================");
            repositorio.eliminar(3L);
            System.out.println("Producto eliminado con éxito");
            repositorio.listar().forEach(System.out::println);
    }
}

















