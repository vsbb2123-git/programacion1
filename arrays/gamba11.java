
import java.util.Scanner;

public class gamba11
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escriba un número ");  

        int filas=1, cont=1, num = lector.nextInt();
        while (filas<=num)
        {
            if(filas==1||filas ==num)
            {
                while(cont<=num)
                {
                    System.out.print("* ");
                    cont++;
                }
            }
            else if (filas<num)
            {
                System.out.print("* ");
                while(cont<num-1)
                {
                    System.out.print("  ");
                    cont++;
                }
                System.out.print("* ");
            }
           
            cont=1;
            filas++;
            System.out.println("");

        }
    }
}
