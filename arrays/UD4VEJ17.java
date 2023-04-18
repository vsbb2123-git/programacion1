import java.util.Scanner;
import java.util.Arrays;
public class UD4VEJ17 
{
    public static void main (String[] args)
    {
        System.out.println("escribe veinte valores");
        Scanner lector = new Scanner(System.in);


        int[] vector1 = new int[10];
        int[] vector2 = new int[10];
        int contador=0;
        while(contador<vector1.length)
        { 
            vector1[contador]= lector.nextInt();
            contador++;
        }
        contador=0;
        while(contador<vector2.length)
        { 
            vector2[contador]= lector.nextInt();
            contador++;
        }
        if (Arrays.equals(vector1,vector2)==true)
        {
            System.out.println("son iguales");
        }
        else
        {
            System.out.println("no son iguales");
        }

    }    
}
