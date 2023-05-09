
import java.util.Scanner;

public class beta5
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("escribe dos numeros");
        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();
        int sumapares=0, sumaimpares=0;
        while (numero1<=numero2)
        {
            numero1++;
            if((numero1%2)==0)
            {
                sumapares++;
            }
            else
            {
                sumaimpares++;
            }
        }
        System.out.println("los pares son "+sumapares+" y los impares son "+ sumaimpares);
    }
}
