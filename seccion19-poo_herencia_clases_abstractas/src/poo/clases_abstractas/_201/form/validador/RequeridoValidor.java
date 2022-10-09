package poo.clases_abstractas._201.form.validador;

public class RequeridoValidor extends Validador {

    protected String mensaje = "El campo es requerido";

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
        return (valor != null && valor.length() > 0);
    }
}
