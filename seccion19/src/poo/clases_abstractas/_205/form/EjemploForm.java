package poo.clases_abstractas._205.form;


import poo.clases_abstractas._205.form.elementos.*;
import poo.clases_abstractas._205.form.elementos.select.Opcion;
import poo.clases_abstractas._205.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidor());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidor())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidor())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        lenguaje.addOpcion(new Opcion("1", "Java").setSelected())
        .addOpcion(new Opcion("2", "Python"))
        .addOpcion(new Opcion("3", "JavaScripts"))
        .addOpcion(new Opcion("4", "TypeScripts"))
        .addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name = '" + this.nombre + "' value = \"" + this.valor + " \">";
            }
        };

        saludar.setValor("Hola que tal, este campo esta deshabilitado!");
        username.setValor("jhon.doe");
        password.setValor("a1b2c3");
        email.setValor("jhon.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor("... más de 10 años de experiencia...");


        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(e -> {
            if(!e.esValido()){
                e.getErrores().forEach(System.out::println);
            }
        });
    }
}