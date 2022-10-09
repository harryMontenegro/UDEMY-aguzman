package poo.clases_abstractas._196.form;


import poo.clases_abstractas._196.form.elementos.InputForm;
import poo.clases_abstractas._196.form.elementos.SelectForm;
import poo.clases_abstractas._196.form.elementos.TextareaForm;
import poo.clases_abstractas._196.form.elementos.select.Opcion;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2", "Python"));
        lenguaje.addOpcion(new Opcion("3", "JavaScripts"));
        lenguaje.addOpcion(new Opcion("4", "TypeScripts"));
        lenguaje.addOpcion(new Opcion("5", "PHP"));

        username.setValor("jhon.doe");
        password.setValor("a1b2c3");
        email.setValor("jhon.doe@correo.com");
        edad.setValor("28");
        java.setSelected(true);
    }
}




























