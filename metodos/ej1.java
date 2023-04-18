import java.util.Scanner;
public class ej1
{
    public static double multiplica(double a, double b)
    {
        return a*b;
    }
    public static void main(String args[])
    {
        System.out.println("escribe dos numeros");
        Scanner lector = new Scanner(System.in);
        double num1=lector.nextDouble();
        double num2=lector.nextDouble();
        double resultado = multiplica(num1, num2);
        System.out.println(resultado);
    }    
}
