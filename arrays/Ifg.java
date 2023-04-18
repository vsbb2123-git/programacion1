package programación.ejercicios;
import java.util.Scanner;

public class Ifg
{
    public static void main(String args[])
    {
        System.out.println("escribe un numero del 0 al 999");
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        int primeracifra, segundacifra, terceracifra;
        if(numero<10)
        {
            System.out.println("capicua");
        }
        else if(numero<100)
        {
            segundacifra = numero%10;
            primeracifra = numero/10;
            if(primeracifra==segundacifra)
            {
                System.out.println("capicua");
            }
            else
            {
                System.out.println("no capicua"); 
            }
        }
        else
        {
            segundacifra = numero%10;
            primeracifra = numero/100;

            if(primeracifra==segundacifra)
            {
                System.out.println("capicua");
            }
            else
            {
                System.out.println("no capicua"); 
            }        
        }
    }
}