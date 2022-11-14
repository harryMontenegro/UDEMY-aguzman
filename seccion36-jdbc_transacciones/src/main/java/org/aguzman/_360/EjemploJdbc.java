package org.aguzman._360;


import org.aguzman._360.modelo.Categoria;
import org.aguzman._360.modelo.Producto;
import org.aguzman._360.repositorio.CategoriaRepositorioImpl;
import org.aguzman._360.repositorio.ProductoRepositorioImpl;
import org.aguzman._360.repositorio.Repositorio;
import org.aguzman._360.servicio.CatalogoServicio;
import org.aguzman._360.servicio.Servicio;
import org.aguzman._360.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) throws SQLException {
        Servicio servicio = new CatalogoServicio();
        System.out.println("=================== listar ===================");
        servicio.listar().forEach(System.out::println);

        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminacion");

        Producto producto = new Producto();
        producto.setNombre("Lampara Led Escritorio");
        producto.setPrecio(900);
        producto.setFechaRegistro(new Date());
        producto.setSku("abcdefgh12");
        servicio.guardarProductoConCategoria(producto, categoria);
        System.out.println("Producto guardado con éxito");
        servicio.listar();
    }
}


















