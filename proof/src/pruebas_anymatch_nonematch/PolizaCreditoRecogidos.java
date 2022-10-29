package pruebas_anymatch_nonematch;

public class PolizaCreditoRecogidos {

    private String numeroCredito;
    private boolean indicadorHabilitado;

    public PolizaCreditoRecogidos(String numeroCredito, boolean indicadorHabilitado) {
        this.numeroCredito = numeroCredito;
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public String getNumeroCredito() {
        return numeroCredito;
    }

    public void setNumeroCredito(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public boolean isIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Override
    public String toString() {
        return "numeroCredito='" + numeroCredito + ", indicadorHabilitado=" + indicadorHabilitado;
    }
}
