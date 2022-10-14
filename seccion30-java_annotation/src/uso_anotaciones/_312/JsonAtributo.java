package uso_anotaciones._312;

import java.lang.annotation.*;

//Configuraciones de metadata
@Target(ElementType.FIELD)// al especificar ElementType.FIELD se indica que se debe aplicar sobre algun atributo de alguna clase (ver clase Productos)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JsonAtributo {
    //Los atributos de la anotación son representados en forma de métodos (nombre()) y pueden tener un valor por defecto (default "") en caso de que no se configure
    String nombre() default "";

}
