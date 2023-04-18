import java.util.Scanner;
public class ej15
{
    public static int suma(int a[])
    {
        int cont =0;
        int suma=0;
        while(cont<100)
        {
            suma=suma+a[cont];
            cont++;
        }
        return suma;
    } 
    public static int mult(int a[])
    {
        int cont =1;
        int mult=1;
        while(cont<100)
        {
            mult=mult*a[cont];
            cont++;
        }
        return mult;
    }
    public static void main(String args[])
    {
        int[] vector = new int[100]; 
        int cont =1;
        Scanner lector = new Scanner(System.in);
        while(cont<100)
        {
            vector[cont]=cont;
            cont++;
        }
        System.out.println("la suma total es de; " + suma(vector) + " y la multiplicacion total es de: "+ mult(vector));
    }    
}
  