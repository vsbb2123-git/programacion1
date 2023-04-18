package programación;
import java.util.Scanner;

public class beta6
      
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce un numero y su exponente");
        int numero1 = lector.nextInt();
        int numero2 = lector.nextInt();
        int cont=1, res=1;
        while (cont<=numero2)
        {
            res=res*numero1;
            cont++;
        }
        System.out.println("el resultado es "+res);
    }
}
