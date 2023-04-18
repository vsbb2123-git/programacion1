import java.util.Scanner;
import java.util.Arrays;
public class UD4MEJ3 
{
    public static void main (String[] args)
    {
        Scanner lector = new Scanner(System.in);

        System.out.println("escribe dos numeros para crear un array");
        int cont1 = lector.nextInt();
        int cont2 = lector.nextInt();                                                                                                                                                                  
        int[][] vector = new int[cont1][cont2];
        cont1=0;
        cont2=0;
        int contador=1;
        System.out.println("a rellenar");
        while(cont1<vector.length)
        {     
            while(cont2<vector[cont1].length)
            {
                vector[cont1][cont2]=lector.nextInt();
                cont2++;
            }
            cont2=0;
            cont1++;
        }

        cont1=0;
        cont2=0;
        int pos=0, neg=0, zero=0;
        
        while(cont1<vector.length)
        {     
            while(cont2<vector[cont1].length)
            {
                System.out.print(vector[cont1][cont2]+" ");   
                if(vector[cont1][cont2]==0)
                {
                    zero++;
                }
                if(vector[cont1][cont2]<0)
                {
                    neg++;
                }
                if(vector[cont1][cont2]>0)
                {
                    pos++;
                }
                cont2++;
            }
            System.out.println("");
            cont2=0;
            cont1++;
        }
        System.out.println("positivos: "+pos+" negativos: "+neg+" ceros "+zero);
    }    
}