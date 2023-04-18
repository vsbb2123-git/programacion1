import java.util.Scanner;
import java.util.Arrays;
public class UD4MEJ4 
{
    public static void main (String[] args)
    {
        Scanner lector = new Scanner(System.in);                                                                                                                                                                 
        double[][] vector = new double[4][5];
        int cont1=0;
        int cont2=0;
        int contador=1;

        while(cont1<vector.length)
        {     
            System.out.println("escribe las notas del alumno "+ (cont1+1));
            while(cont2<vector[cont1].length)
            {
                vector[cont1][cont2]=lector.nextDouble(); ;
                cont2++;
            }
            cont2=0;
            cont1++;
        }

        cont1=0;
        cont2=0;
        double med=0, alt=0, baj=10;
        
        while(cont1<vector.length)
        {    
            System.out.print("las notas del alumno "+ (cont1+1)+ " son: ");
            while(cont2<vector[cont1].length)
            {
                System.out.print(vector[cont1][cont2]+" ");   
                if(vector[cont1][cont2]<baj)
                {
                    baj=vector[cont1][cont2];
                }
                if(vector[cont1][cont2]>alt)
                {
                    alt=vector[cont1][cont2];
                }
                med=med+vector[cont1][cont2];
                cont2++;
            }
            med=med/5;
            System.out.println("la mas alta es un "+alt+" la mas baja es un "+baj+" y la media es un " + med);
            cont2=0;
            cont1++;
            med=0;
            alt=0;
            baj=10;
        }
    }    
}