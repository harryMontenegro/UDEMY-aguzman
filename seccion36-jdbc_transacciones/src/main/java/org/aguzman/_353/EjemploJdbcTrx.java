package org.aguzman._353;


import org.aguzman._353.modelo.Categoria;
import org.aguzman._353.modelo.Producto;
import org.aguzman._353.repositorio.ProductoRepositorioImpl;
import org.aguzman._353.repositorio.Repositorio;
import org.aguzman._353.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcTrx {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = ConexionBaseDatos.getInstance()) {
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }
            try {
                Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
                System.out.println("=================== listar ===================");
                repositorio.listar().forEach(System.out::println);

                System.out.println("=================== obtener por id ===================");
                System.out.println(repositorio.porId(1L));

                System.out.println("=================== insertar nuevo producto ===================");
                Producto producto = new Producto();
                producto.setNombre("teclado IBM mecánico");
                producto.setPrecio(1550);
                producto.setFechaRegistro(new Date());
                Categoria categoria = new Categoria();
                categoria.setId(3L);
                producto.setCategoria(categoria);
                producto.setSku("abcde12345");
                repositorio.guardar(producto);
                System.out.println("Producto guardado con éxito");

                System.out.println("=================== editar producto ===================");
                producto = new Producto();
                producto.setId(5L);
                producto.setNombre("Teclado Corsair k95 mecánico");
                producto.setPrecio(1000);
                producto.setSku("abcdef1234");
                categoria = new Categoria();
                categoria.setId(2L);
                producto.setCategoria(categoria);
                repositorio.guardar(producto);
                System.out.println("Producto actualizado con éxito");

                repositorio.listar().forEach(System.out::println);
                conn.commit();
            } catch (SQLException e){
                e.printStackTrace();
                conn.rollback();
            }
        }
    }
}

















