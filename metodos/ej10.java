import java.util.Scanner;
public class ej10
{
    public static boolean correcta(int a, int b, int c)
    {
        int cont=0;
        if(a<=30 && a>0)
        {
            cont++;
        }
        if(b<=12 && b>0)
        {
            cont++;
        }
        if(c<=9999 && c>0)
        {
            cont++;
        }
        if(cont==3)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String args[])
    {
        System.out.println("escribe una fecha en formato dd mm aaaa");
        Scanner lector = new Scanner(System.in);
        int num1=lector.nextInt();
        int num2=lector.nextInt();
        int num3=lector.nextInt();
        boolean resultado = correcta(num1, num2, num3);

        if(resultado==true)
        {
            System.out.println("fecha correcta");
        }
        else 
        {
            System.out.println("fecha incorrecta");
        }
    }    
}
