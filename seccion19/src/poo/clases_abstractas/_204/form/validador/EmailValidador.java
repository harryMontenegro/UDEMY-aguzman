package poo.clases_abstractas._204.form.validador;

public class EmailValidador extends Validador {

    protected String mensaje = "el campo %s tiene un formato de correo inválido";

    //caracter ^ en expresiones regulares indica que va a validar desde el comienzo del String
    //() indica que es un grupo
    //. indica cualquier caracter
    //+ cualquier caracter se puede repetir n cantidad de veces
    //$ indica que va a validar al final del String
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
