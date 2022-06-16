package tipostring.cadenas;

public class EjemploStringTestRendimientoConcat29 {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        long inicio = System.currentTimeMillis();

        //El StringBuilder es mutable
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 10000; i++){
            //c = c.concat(a).concat(b).concat("\n"); //500 => 2ms
            //Cuando se utiliza el signo + por debajo utiliza el StringBuilder, pero crea más instancias de tipo String por lo que lo hace menos eficiente.
            //c += a + b + "\n"; //500 => 105ms
            sb.append(a).append(b).append("\n"); //500 => 1ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
