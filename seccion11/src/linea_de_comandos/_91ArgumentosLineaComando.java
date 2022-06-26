package linea_de_comandos;

public class _91ArgumentosLineaComando {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++){
            System.out.println("Argumentos nª " + i + ": " + args[i]);
        }

    }
}

//1.- Para compilar se utiliza el comando javac + nombreDeLaClase.java
//El archivo nombreDeLaClase.class que se genera es el bytecode
//2.- Para ejecutar se utiliza el comando java + nombreDeLaClase
//3.- Al pasar argumentos el main los recibe y los ejecuta java _90ArgumentoLineaComando Andres Pepe
//4.- Al pasar argumentos el main los recibe y los ejecuta, si se desea pasar nombre y apellido se debe pasar
// entre comillas java _90ArgumentoLineaComando Andres Pepe "Juan Francisco"
//Cuando ocurre un cambio se debe volver a compilar javac + nombreDeLaClase.java

//5.- si se desea arreglar el tema de acentos en la terminal se ejecuta el comando javac + nombreDeLaClase.java -encoding utf8










