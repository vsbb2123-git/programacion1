
import java.util.Scanner;

public class Iff
{
    public static void main(String args[])
    {
        System.out.println("escribe un numero del 0 al 999");
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        int primeracifra, segundacifra, terceracifra;
        if(numero<10)
        {
            System.out.println(numero);
        }
        else if(numero<100)
        {
            segundacifra = numero%10;
            primeracifra = numero/10;
            System.out.println(segundacifra+""+primeracifra);
        }
        else
        {
            terceracifra = numero%10;
            primeracifra = numero/100;
            segundacifra = (numero/10)-(primeracifra*10);
            System.out.println(terceracifra+""+segundacifra+""+primeracifra);
        }
    }
}