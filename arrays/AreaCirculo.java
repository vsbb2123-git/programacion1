package programación.ejercicios;
import java.io.Closeable;
import java.util.Scanner;

public class AreaCirculo
{
    public static void main(String args[])
    {
        System.out.println("Escriba el radio del círculo");  

        Scanner lector = new Scanner(System.in);
    
        double radio = lector.nextDouble();

        double area = 3.1415*radio*radio;

        System.out.println ("el área del círculo es " + area);
    }

}
