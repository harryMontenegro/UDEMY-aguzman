package uso_anotaciones._313.models;

import uso_anotaciones._313.JsonAtributo;

import java.time.LocalDate;

public class Productos {
    @JsonAtributo(capitalizar = true)
    private String nombre;
    @JsonAtributo(nombre = "costo")
    private Long precio;
    private LocalDate fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
