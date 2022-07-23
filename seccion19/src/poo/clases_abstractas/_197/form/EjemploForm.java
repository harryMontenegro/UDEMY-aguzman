package poo.clases_abstractas._197.form;


import poo.clases_abstractas._197.form.elementos.ElementoForm;
import poo.clases_abstractas._197.form.elementos.SelectForm;
import poo.clases_abstractas._197.form.elementos.TextareaForm;
import poo.clases_abstractas._197.form.elementos.select.Opcion;
import poo.clases_abstractas._197.form.elementos.InputForm;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2", "Python"))
        .addOpcion(new Opcion("3", "JavaScripts"))
        .addOpcion(new Opcion("4", "TypeScripts"))
        .addOpcion(new Opcion("5", "PHP"));

        username.setValor("jhon.doe");
        password.setValor("a1b2c3");
        email.setValor("jhon.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor("... más de 10 años de experiencia...");
        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje);


        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });
    }
}




























