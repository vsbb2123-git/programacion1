package programación;
import java.util.Scanner;



public class gamba5
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escriba un número ");  

        int res=0, cont=1, cont2=1, num = lector.nextInt();
        while (cont2<=num)
        {
           System.out.println("Tabla del "+cont2+":");
           while (cont<=10)
           {
                System.out.println(cont2+" x "+cont+" = "+(cont*cont2));
                res=res+(cont*cont2);
                cont ++;
           }
           System.out.println("la suma de todas las multiplicaciones de la tabla de multiplicar del "+cont2+" es: "+res);
           System.out.println("");
           cont2++;
           cont=1;
           res=0;
        }
    }
}
