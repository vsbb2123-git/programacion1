import java.util.Scanner;
public class ej11
{
    public static void tabla(int a)
    {
        int cont=1;
        while(cont<=10)
        {
            System.out.println(a*cont);
            cont++;
        }

        
    }
    public static void main(String args[])
    {
        System.out.println("escribe un numero");
        Scanner lector = new Scanner(System.in);
        int num1=lector.nextInt();

        tabla(num1);

       
    }    
}
