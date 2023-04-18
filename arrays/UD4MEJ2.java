import java.util.Scanner;
import java.util.Arrays;
public class UD4MEJ2 
{
    public static void main (String[] args)
    {
        int[][] vector = new int[10][10];
        int cont1 =0;
        int cont2 =0;
        int contador=1;
        while(cont1<vector.length)
        {     
            while(cont2<vector[cont1].length)
            {
                vector[cont1][cont2]=(cont1+1)*(cont2+1);
                cont2++;
            }
            cont2=0;
            cont1++;
        }

        cont1=0;
        cont2=0;
        while(cont1<vector.length)
        {     
            while(cont2<vector[cont1].length)
            {
                System.out.print(vector[cont1][cont2]+" ");
                cont2++;
            }
            System.out.println("");
            cont2=0;
            cont1++;
        }
    }    
}
