package programación;
import java.util.Scanner;

public class gamba10
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escriba un número ");  

        int filas=1, cont=1, num = lector.nextInt();
        while (filas<=num)
        {
            while(cont<=(num*2)-1)
            {
                if(cont<=num-filas)
                {
                    System.out.print(" ");
                }
                else if(cont>=num-filas && cont<num+filas)
                {
                    System.out.print("*");
                }
                cont++;
            }
            cont=1;
            filas++;
            System.out.println("");

        }
    }
}
