package recursividad._317;

import recursividad._317.models.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {

        Componente pc = new Componente("Gabinete PC ATX");
        Componente poder = new Componente("Fuente Poder 700W");
        Componente placaMadre = new Componente("MainBoard ASUS sockets AMD");
        Componente cpu = new Componente("Cpu AND Ryzen 5 2800");
        Componente ventilador = new Componente("Ventilador CPU");
        Componente disipador = new Componente("Disipador");
        Componente tv = new Componente("Nvidia RTX 3080 8GM");
        Componente gpu = new Componente("Nvidia GPU RTX");
        Componente gpuRam = new Componente("4GB Ram");
        Componente gpuRam2 = new Componente("4GB Ram");
        Componente gpuVentiladores = new Componente("Ventiladores");
        Componente ram = new Componente("Memoria Ram 32GB");
        Componente ssd = new Componente("Disco SSD 2TB");

        cpu.adComponente(ventilador)
                .adComponente(disipador);

        tv.adComponente(gpu)
                .adComponente(gpuRam)
                .adComponente(gpuRam2)
                .adComponente(gpuVentiladores);

        placaMadre.adComponente(cpu)
                .adComponente(tv)
                .adComponente(ram)
                .adComponente(ssd);

        pc.adComponente(poder)
                .adComponente(placaMadre)
                .adComponente(new Componente("Teclado"))
                .adComponente(new Componente("Mouse"));

        metodoRecursivojava8(pc, 0).forEach(c -> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));

    }

    public static Stream<Componente> metodoRecursivojava8(Componente c, int nivel){
        c.setNivel(nivel);
        return Stream.concat(Stream.of(c),
                c.getHijos().stream().flatMap(hijo -> metodoRecursivojava8(hijo, nivel + 1)));
    }

    public static void metodoRecursivo(Componente c, int nivel){
        System.out.println("\t".repeat(nivel) + c.getNombre());
        if(c.tieneHijos()){
            for (Componente hijo : c.getHijos()) {
                metodoRecursivo(hijo, nivel + 1);
            }
        }
    }
}
