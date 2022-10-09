package javier_vazquez.seccion3._15;

public class Comensal {
    private String nombre;
    private double monto_pedido;
    private int mesa;

    public Comensal(String nombre, double monto_pedido, int mesa) {
        this.nombre = nombre;
        this.monto_pedido = monto_pedido;
        this.mesa = mesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto_pedido() {
        return monto_pedido;
    }

    public void setMonto_pedido(double monto_pedido) {
        this.monto_pedido = monto_pedido;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
}
