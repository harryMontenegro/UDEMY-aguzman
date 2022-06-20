package flujodecontrol;

import javax.swing.*;

public class SentenciaForArreglo60 {
    public static void main(String[] args) {

        String[] nombres = {"Andres","Pepe","Maria","Paco","Lalo","Bea", "Pato", "Pepa"};

        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("pePa".toLowerCase())){
                continue;
            }
            System.out.println(i + " " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, Ejemplo \"Pepe\" o \"Maria\"");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, "Fue encontrado " + buscar);
        }else{
            JOptionPane.showMessageDialog(null, "No existe en el sistema " + buscar);
        }













    }
}
