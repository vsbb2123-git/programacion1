import java.util.Scanner;
public class ej9
{
    public static int mayor(int a, int b)
    {
        if(a<b)
        {
            return b;
        }
        
        else
        {
            return a;
        }
        
    }
    public static void main(String args[])
    {
        System.out.println("escribe tres numeros");
        Scanner lector = new Scanner(System.in);
        int num1=lector.nextInt();
        int num2=lector.nextInt();
        int resultado = mayor(num1, num2);
        num1=lector.nextInt();
        resultado = mayor(num1, resultado);
        System.out.println(resultado);
    }    
}
