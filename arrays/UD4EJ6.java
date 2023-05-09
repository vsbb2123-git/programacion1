
import java.util.Scanner;

public class UD4EJ6
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escriba una frase y despues una palabra");  
        String f = lector.nextLine();
        String p = lector.nextLine();
        if(f.indexOf(p)>=0)
        {
            System.out.println("la palabra está en la frase");
        }
        else
        {
            System.out.println("la palabra no está en la frase");
        }

        if(f.endsWith(p))
        {
            System.out.println("la frase acaba en la palabra");
        }
        else
        {
            System.out.println("la frase no acaba en la palabra");
        }

        if(f.startsWith(p))
        {
            System.out.println("la frase empieza por la palabra");
        }
        else
        {
            System.out.println("la frase no empieza por la palabra");
        }
    }
}
