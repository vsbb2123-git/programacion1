
import java.util.Scanner;

public class beta7
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("escriba un numero");
        int numero = lector.nextInt();
        int res=1, cont=1;
        while (cont<=numero)
        {
            res=res*cont;
            cont++;
        }
        System.out.println("el resultado es "+res);

    }
}
