
import java.util.Scanner;

public class Ifi
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("escriba el año, mes y día, en ese orden");
        int año = lector.nextInt();
        int mes = lector.nextInt();
        int dia = lector.nextInt();
        
        if (dia<1)
        {
            System.out.println("fecha invalida");
        }
        else if (mes<=12)
        {
            if (mes==2)
            {
                if (dia<29)
                {
                    System.out.println("fecha valida");
                }
                else
                {
                    System.out.println("fecha invalida");
                }
            }
            if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)
            {
                if (dia<32)
                {
                    System.out.println("fecha valida");
                }
                else
                {
                    System.out.println("fecha invalida");
                }
            }
            if (mes==4||mes==6||mes==9||mes==11)
            {
                if (dia<31)
                {
                    System.out.println("fecha valida");
                }
                else
                {
                    System.out.println("fecha invalida");
                }
            }
        }
        
    }
}
