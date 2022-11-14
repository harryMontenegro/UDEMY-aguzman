package org.aguzman._353;


import org.aguzman._353.modelo.Producto;
import org.aguzman._353.repositorio.ProductoRepositorioImpl;
import org.aguzman._353.repositorio.Repositorio;

import java.sql.SQLException;

public class EjemploJdbcDelete {
    public static void main(String[] args) throws SQLException {
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

















