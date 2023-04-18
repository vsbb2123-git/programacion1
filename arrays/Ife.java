package programación.ejercicios;
import java.util.Scanner;

public class Ife
{
    public static void main(String args[])
    {
        System.out.println("escribe un numero del 0 al 999");
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
                
        if(numero<10)
        {
            System.out.println("el numero tiene una cifra");
        }
        else if(numero<100)
        {
            System.out.println("el numero tiene dos cifras");
        }
        else
        {
            System.out.println("el numero tiene tres cifras");
        }
    }
}
