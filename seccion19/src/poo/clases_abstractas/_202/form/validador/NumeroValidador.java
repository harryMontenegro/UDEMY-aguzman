package poo.clases_abstractas._202.form.validador;

public class NumeroValidador extends Validador {

    protected String mensaje = "El campo debe ser número";

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
        try {
            Integer.parseInt(valor);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
