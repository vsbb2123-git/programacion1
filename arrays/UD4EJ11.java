package programación;
import java.util.Scanner;

public class UD4EJ11
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriba una frase ");  
        String texto = lector.nextLine();
        int cont=0;
        int cont2=texto.length()-1;
        int comprobador=0;
        texto=texto.replace(" ","");
        while (cont<=texto.length()-1)
        {
            if(texto.charAt(cont)!=texto.charAt(cont2))
            {
                comprobador=1;
            }
            cont++;
            cont2--;
        }
        if(comprobador==1)
        {
            System.out.println("no");
        }
        else
        {
            System.out.println("si");
        }
    }
}
