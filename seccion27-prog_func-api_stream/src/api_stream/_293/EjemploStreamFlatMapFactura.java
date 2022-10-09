package api_stream._293;

import api_stream._293.models.Factura;
import api_stream._293.models.Usuarios;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuarios u1 = new Usuarios("Jhon","Doe");
        Usuarios u2 = new Usuarios("Pepe","Perez");

        u1.addFacturas(new Factura("Compras Tecnologias"));
        u1.addFacturas(new Factura("Compras Muebles"));

        u2.addFacturas(new Factura("Bicicleta"));
        u2.addFacturas(new Factura("NoteBook Gamer"));

        List<Usuarios> usuarios = Arrays.asList(u1, u2);

        /*for (Usuarios u : usuarios) {
            for (Factura f: u.getFacturas()) {
                System.out.println(f.getDescripcion());
            }
        }*/

        usuarios.stream()
                .flatMap(u -> u.getFactura().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente: ").concat(f.getUsuarios().toString())));

        usuarios.stream()
                .map(Usuarios::getFactura)
                .flatMap(Collection::stream)
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente: ").concat(f.getUsuarios().toString())));


    }
}
