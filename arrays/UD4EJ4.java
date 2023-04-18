package programación;
import java.util.Scanner;

public class UD4EJ4
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escriba su nombre y sus dos apellidos ");  
        String texto1 = lector.nextLine();
        String texto2 = lector.nextLine();
        String texto3 = lector.nextLine();
        String codigo = texto1.substring(0,3);
        codigo=codigo.concat(texto2.substring (0,3));
        codigo=codigo.concat(texto3.substring (0,3));
        System.out.println (codigo);
    }
}
