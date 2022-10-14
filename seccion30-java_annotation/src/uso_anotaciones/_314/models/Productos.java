package uso_anotaciones._314.models;

import uso_anotaciones._314.Init;
import uso_anotaciones._314.JsonAtributo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Productos {
    @JsonAtributo
    private String nombre;
    @JsonAtributo(nombre = "costo")
    private Long precio;
    private LocalDate fecha;

    @Init
    private void init(){
        this.nombre = Arrays.stream(this.nombre.split(" "))
                .map(palabra -> palabra.substring(0, 1).toUpperCase() + palabra.substring(1).toLowerCase())
                //Collectors.joining(" ") junta todos los elementos en uno solo separados por el caracter pasado por argumento
                .collect(Collectors.joining(" "));
    }

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
