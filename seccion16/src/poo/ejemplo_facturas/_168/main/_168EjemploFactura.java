package poo.ejemplo_facturas._168.main;

import poo.ejemplo_facturas._168.modelo.*;

import java.util.Scanner;

public class _168EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Andrés");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for(int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto nª " + producto.getCodigo() + ": ");
            //nombre = s.next();// next() solo permite ingresar un string sin espacio, es decir no se puede ingresar 2 palabras separadas con espacio
            nombre = s.nextLine();
            producto.setNombre(nombre);

            System.out.print("ingrese el precio: ");
            precio = s.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = s.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura.generarDetalle());
    }
}

























