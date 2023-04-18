package programación;
import java.util.Scanner;

public class UD4EJ7
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.println ("Escriba una frase, una cadena de texto de la frase y otra cadena de texto por la que sustituirla");  
        String f = lector.nextLine();
        String p1 = lector.nextLine();
        String p2 = lector.nextLine();
        System.out.println(f.replaceAll(p1,p2));
    }
}
