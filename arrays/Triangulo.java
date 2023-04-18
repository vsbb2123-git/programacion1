package programación.ejercicios;
import java.util.Scanner;

public class Triangulo
{
    public static void main(String args[])
    {
        System.out.println("Escriba el lado del triangulo");  

        Scanner lector = new Scanner(System.in);
    
        double lado = lector.nextDouble();

        double perimetro = 3 * lado;
        double area = (Math.sqrt(3)/4) * (lado*lado);

        System.out.println ("el perímetro es "+ perimetro +" y el area "+ area);
    }
}