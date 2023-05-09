
import java.util.Scanner;

public class UD4EJ5
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escriba una frase ");  
        String texto = lector.nextLine();
        int cont=0, a=0, e=0, i=0, o=0, u=0;
        while(cont<=texto.length()-1)
        {
            if (texto.charAt(cont)=='a'||texto.charAt(cont)=='A')
            {
                a++;
            }
            if (texto.charAt(cont)=='e'||texto.charAt(cont)=='E')
            {
                e++;
            }
            if (texto.charAt(cont)=='i'||texto.charAt(cont)=='I')
            {
                i++;
            }
            if (texto.charAt(cont)=='o'||texto.charAt(cont)=='O')
            {
                o++;
            }
            if (texto.charAt(cont)=='u'||texto.charAt(cont)=='U')
            {
                u++;
            }

            cont++;
        }
        System.out.println(a);
        System.out.println(e);
        System.out.println(i);
        System.out.println(o);
        System.out.println(u);
    }
}
