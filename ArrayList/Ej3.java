package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej3 {
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        ArrayList<Double> precios=new ArrayList <Double>();
        System.out.println("Introduzca los precios de los artículos");
        double comprobar=lector.nextDouble();
        while(comprobar>0)
        {
            precios.add(comprobar);
            
            System.out.print("introduzca el siguiente precio ");
            comprobar=lector.nextDouble();
        }
        System.out.println("precio negativo detectado");
        
        for(int i=0;i<precios.size();i++) 
        {      
            System.out.println("Nº del producto: "+i+" Precio: "+precios.get(i));
        }
        ArrayList<Double> precioscaros=new ArrayList <Double>();
        ArrayList<Double> preciosbaratos=new ArrayList <Double>();

        for(int i=0-precios.size();i<precios.size();i++) 
        {      
            if (precios.get(0)<100)
            {
                preciosbaratos.add(precios.get(0));
                precios.remove(0);
            }

            else
            {
                precioscaros.add(precios.get(0));
                precios.remove(0);
            }
        }

        System.out.println("LOS PRECIOS BARATOS");
        for(int i=0;i<preciosbaratos.size();i++) 
        {      
            System.out.println("Nº del producto: "+i+" Precio: "+preciosbaratos.get(i));
        }

        System.out.println("LOS PRECIOS CAROS");
        for(int i=0;i<precioscaros.size();i++) 
        {      
            System.out.println("Nº del producto: "+i+" Precio: "+precioscaros.get(i));
        }
    }
}
