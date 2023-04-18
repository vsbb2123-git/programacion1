import java.util.Scanner;
public class ej14
{
    public static void tabla(int a, String b)
    {
        int cont1=1;
        int cont2=1;
        System.out.print(" ");
        while(cont1<=a)
        {
            while(cont2<=(a+cont1-1))
            {
                if(cont2<=(a-cont1))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(b);
                }
                cont2++;
                
            }
            cont2=0;
            cont1++;
            System.out.println();
        }

        
    }
    public static void main(String args[])
    {
        System.out.println("escribe un numero y un caracter");
        Scanner lector = new Scanner(System.in);
        int num=lector.nextInt();
        String letra=lector.next();
        tabla(num,letra);

       
    }    
}
