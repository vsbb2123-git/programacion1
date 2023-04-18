package programación;
import java.util.Scanner;

public class UD4EJ3
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escriba dos textos ");  
        String texto1 = lector.nextLine();
        String texto2 = lector.nextLine();
        
       if(texto1.compareTo(texto2)<=0)
        {
            System.out.println(texto1);
            System.out.println(texto2);
        }else
        {
            System.out.println(texto2);
            System.out.println(texto1);
        }
    }
}
