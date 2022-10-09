package api_stream._293.models;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {
    private Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoId;

    private List<Factura> factura;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++ultimoId;
        this.factura = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }

    public List<Factura> getFactura() {
        return factura;
    }

    public void addFacturas(Factura facturas) {
        this.factura.add(facturas);
        facturas.setUsuarios(this);
    }
}
