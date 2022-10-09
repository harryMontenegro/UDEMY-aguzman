package poo.clases_y_objetos._149;

//Enum es una colección de valores constantes o atributos constantes
public enum Color {
    ROJO("Rojo"),//Al implementar un constructor en un Emun sus atributos se convierten en un constructor también al que se le debe pasar el argumento ROJO(argumento) para
    //hacerlo más personalizable
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris Oscuro"),
    NARANJO("Naranja");

    //Atributo de tipo final sin ser estático (static) para pasar el argumento en el constructor, propio de la referencia del Enum
    private final String color;

    Color(String color) {
        this.color = color;
    }

    //Metodo getter
    public String getColor() {
        return color;
    }

    // Si se implementa toString() se devolverá lo que guarde el atributo final y no el Enum y por ende mostrara el valor del argumento ejemplo: AMARILLO = "Amarillo"
    @Override
    public String toString() {
        return this.color;
    }
}
