
import java.util.Scanner;

public class Ifd
{
    public static void main(String args[])
    {
        System.out.println("escribe dos numeros");
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();
        int numero2 = lector.nextInt();
        if(numero%numero2==0)
        {
            System.out.println("el primer numero es multiplo del segundo");
        }

        else if(numero2%numero==0)
        {
            System.out.println("el segundo numero es multiplo del primero");
        }
        else 
        {
            System.out.println("los dos numeros no son multiplos");
        }
    }
}
