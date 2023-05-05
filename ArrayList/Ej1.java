package ArrayList;

import java.util.ArrayList;

public class Ej1 {
    public static void main(String args[])
    {
        ArrayList<String> colores=new ArrayList <String>();
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Naranja");
        colores.add("Blanco");
        System.out.println();///se puede sacar por pantalla con un sout
        for(int i=0;i<colores.size();i++)
        {
            System.out.println("Pos: "+i+" Color: "+colores.get(i));
        }
    }
    
}