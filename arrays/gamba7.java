
import java.util.Scanner;



public class gamba7
{
    public static void main(String args[])
    {
        int cont1=0, cont2=0, cont3=1;
        while (cont1<24)
        {
           while (cont2<60)
           {
                while(cont3<60)
                {
                    System.out.println(cont1+":"+cont2+":"+cont3);
                    cont3++;
                }
                cont2 ++;
                cont3=0;
           }
           cont1++;
           cont2=0;
        }
    }
}
