
import java.lang.reflect.MalformedParametersException;
import java.util.Scanner;

public class Entregable1
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriba la nota de la primera evaluación");  
        int nota1 = lector.nextInt();
        System.out.println("Escriba la nota de la segunda evaluación"); 
        int nota2 = lector.nextInt();
        System.out.println("Escriba la nota de la tercera evaluación"); 
        int nota3 = lector.nextInt();

        double media= (nota1 + nota2 + nota3)/3.0;

        System.out.println ("la media entre las tres evaluaciones es de "+ media + " puntos");
    }
}