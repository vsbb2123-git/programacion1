package programación;
import java.util.Scanner;

public class UD4EJ10
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriba una frase ");  
        String texto = lector.nextLine();
        int cont=0;
        while (cont<=texto.length()-1)
        {
            if (texto.charAt(cont)==' ')
            {
                System.out.println("");
            }
            else
            {
                System.out.print(texto.charAt(cont));
            }
            cont++;
        }
        
    }
}
