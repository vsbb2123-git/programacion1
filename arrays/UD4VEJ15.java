import java.util.Scanner;
import java.util.Arrays;
public class UD4VEJ15 
{
    public static void main (String[] args)
    {
        System.out.println("escribe dos valores");
        Scanner lector = new Scanner(System.in);
        int v1= lector.nextInt();
        int v2= lector.nextInt();

        int[] vector = new int[v1];
        Arrays.fill(vector, v2);
        
        int contador=0;
        while(contador<vector.length)
        {
            System.out.print(vector[contador]+" ");
            contador++;
        }

    }    
}
