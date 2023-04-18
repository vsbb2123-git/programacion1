import java.util.Scanner;
public class UD4VEJ14 
{
    public static void main (String[] args)
    {
        int[] vector = new int[55];
        int contador=0;
        int selector=1;
        int escritor=1;
        while(escritor<=10)
        {
            while(selector<=escritor)
            {
                vector[contador]=escritor;
                selector++;
                contador++;
            }
            selector=1;
            escritor++;
        }
        contador=0;
        while(contador<vector.length)
        {
            System.out.print(vector[contador]+" ");
            contador++;
        }

    }    
    
}
