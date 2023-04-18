package programación;
import java.util.Scanner;



public class gamba8
{
    public static void main(String args[])
    {
        int cont1=1, cont2=1;
        while (cont1<=12)
        {
            if(cont1==1||cont1==3||cont1==5||cont1==7||cont1==8||cont1==10||cont1==12)
            {
                while(cont2<=31)
                {
                    System.out.println(cont2+"/"+cont1);
                    cont2++;
                }
            }
            if(cont1==4||cont1==6||cont1==9||cont1==11)
            {
                while(cont2<=30)
                {
                    System.out.println(cont2+"/"+cont1);
                    cont2++;
                }
            }
            if(cont1==2)
            {
                while(cont2<=28)
                {
                    System.out.println(cont2+"/"+cont1);
                    cont2++;
                }
            }
            cont2=1;
            cont1++;
        }
    }
}
