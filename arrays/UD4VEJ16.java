import java.util.Scanner;
import java.util.Arrays;
public class UD4VEJ16 
{
    public static void main (String[] args)
    {
        int[] vector = new int[55 ];
        int primero=0;
        int segundo=1;
        int cambiador=0;
        int numero=1;
        while(numero<=10)
        {     
            Arrays.fill(vector,primero,segundo,numero);
            numero++;
            cambiador=segundo;
            primero=cambiador;
            segundo=segundo+numero;
        }

        int contador=0;
        while(contador<vector.length)
        {
            System.out.print(vector[contador]+" ");
            contador++;
        }
    }    
}
