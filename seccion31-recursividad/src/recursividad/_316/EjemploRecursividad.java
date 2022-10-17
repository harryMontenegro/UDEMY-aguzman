package recursividad._316;

import recursividad._316.models.Componente;

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


    }
}
