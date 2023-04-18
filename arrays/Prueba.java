package programación.ejercicios;

import java.util.Scanner;
public class Prueba 
{
    public static void main(String args[])
    {
        System.out.println("Buenos días");  

        Scanner lector = new Scanner(System.in);
    
        double numero = lector.nextDouble();

        System.out.println ("Acabas de escribir " + numero);
    }
}
