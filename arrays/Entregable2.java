
import java.util.Scanner;

public class Entregable2
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Escribe un número ");  
        double num1 = lector.nextDouble();
        
        System.out.println("Escribe otro número"); 
        double num2 = lector.nextDouble();

        System.out.println ("el primer número redondeado es "+ Math.round(num1));
        System.out.println ("el segundo número redondeado es "+ Math.round(num2));
        
        System.out.println ("el número mas alto es "+ Math.max(num1, num2));
        System.out.println ("el número mas bajo es "+ Math.min(num1, num2));
        
        System.out.println ("un número aleatorio entre ambos números es "+ (int)(Math.random()*(Math.max(num1, num2)-Math.min(num1, num2)+1)+Math.min(num1, num2))); 
    }
}