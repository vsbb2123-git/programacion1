
import java.util.Scanner;

public class beta8
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("escribe un numero");
        int numero = lector.nextInt();
        int cont =1, res1=0, res2=1, cambiador;
        while (cont<=numero)
        {
            res1=res1+res2;
            cambiador=res1;
            res1=res2;
            res2=cambiador;
            cont++;
            System.out.println(res1);
        }
    }
}
