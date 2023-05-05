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
        
        System.out.println(colores);            ///se puede sacar por pantalla con un sout
        for(int i=0;i<colores.size();i++)       ///o con un for
        {
            System.out.println("Pos: "+i+" Color: "+colores.get(i));
        }
        
        colores.add("Negro");
        colores.add("Cyan");
        
        colores.add(1,"Amarillo");              ///add añade en una posicion
        colores.add(2,"Magenta");               ///set, por otra parte sustituye

        colores.remove (3);
        colores.remove (4);

        System.out.println(colores);
    }
}