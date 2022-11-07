package patrones_disenios._327.ejemplo;

import patrones_disenios._327.UsuarioRepositorio;

public class EjemploObserver2 {
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioRepositorio();
        repo.addObserver((observable, u) -> System.out.println("Enviando un  email al usuario " + u));
        repo.addObserver((observable, u) -> System.out.println("Enviando un  email al administrador"));
        repo.addObserver((observable, u) -> System.out.println("Enviando un  email al administrador"));
        repo.addObserver((observable, u) -> System.out.println("Guardado info del usuario " + u + " en el logs"));
        repo.crearUsuario("Andres");
    }
}
