package programación;
import java.util.Scanner;

public class UD4EJ2
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escriba dos textos ");  
        String texto1 = lector.nextLine();
        String texto2 = lector.nextLine();
        
        if(texto1.equalsIgnoreCase(texto2))
        {
            System.out.println("son iguales");
        }
        else
        {
            System.out.println("no son iguales");
        }
    }
}
