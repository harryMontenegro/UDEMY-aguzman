package variables;

public class ReglasParaDefinirVariables10 {
    public static void main(String[] args) {

        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);

        boolean valor = true;
        int numero2 = 5;

        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 11;
        }
        System.out.println("numero2 = " + numero2);

        //El tipo de datos var permite asignar un valor de tipo flexible, donde influye el
        // valor para definir el tipo de variable
        var numero3 = "15";

        String nombre;

        nombre = "Andrés";

        if(numero > 10){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);

        int edadPersona = 5;

    }
}
