package poo.ejemplo_facturas._169.main;

import poo.ejemplo_facturas._169.modelo.*;

import java.util.Scanner;

public class _169EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Andrés");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;

        System.out.println();

        for(int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto nª " + producto.getCodigo() + ": ");
            //nombre = s.next();// next() solo permite ingresar un string sin espacio, es decir no se puede ingresar 2 palabras separadas con espacio
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);
    }
}

























