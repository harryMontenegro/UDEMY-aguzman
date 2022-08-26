package javier_vazquez.seccion6._38;

public class Estudiante {
    private String nombre;
    private String apellido;
    private double altura;
    private double promedio;

    public Estudiante(String nombre, String apellido, double altura, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.promedio = promedio;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
