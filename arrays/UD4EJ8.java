package programación;
import java.util.Scanner;

public class UD4EJ8
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.println ("Escriba una frase y despues una palabra");  
        String f = lector.nextLine();
        String p = lector.nextLine();
        int cont=0, cont2=0, comprobador=-1;

        while (f.indexOf(p,cont)!=-1)
        {
            if(f.indexOf(p,cont)!=comprobador)
            {
                comprobador=(f.indexOf(p, cont));
                cont2++;
            }
            cont++;
        }
        System.out.println("la palabra ha salido " + cont2+ "veces");
    }
}
