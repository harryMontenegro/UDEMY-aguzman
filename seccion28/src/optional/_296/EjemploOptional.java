package optional._296;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {

        String nombre = "Andrés";

        //Optional.of() no admite nulos, es decir el argumento pasado no debe ser null
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        }
        //opt.isEmpty es lo contrario a isPresent
        //System.out.println(opt.isEmpty);

        opt.ifPresent(valor -> System.out.println("Hola " + valor));

        nombre = null;

        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());

        opt.ifPresent(valor -> System.out.println("Hola " + valor));
        //opt.ifPresentOrElse desde java 9,
        //opt.ifPresentOrElse(valor -> System.out.println("Hola " + valor), () -> {System.out.println("No esta presente")});

        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());
    }
}
