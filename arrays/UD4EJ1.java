
import java.util.Scanner;

public class UD4EJ1
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escriba un texto ");  
        String texto = lector.nextLine();
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
    }
}
