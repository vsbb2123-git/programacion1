import java.util.Scanner;
public class Ejercicio2
{

    public static void main(String[] args) 
    {
        {
            Scanner teclado=new Scanner(System.in);
            System.out.println("introduzca el precio sin iva de todos sus artículos, cuando acabe, escriba '-1' ");
            int boton=0;
            double total=0, iva=0, totalconiva=0, num=0;
            while(boton==0)
            {
                total=total+num;
                num=teclado.nextDouble();
                if(num==-1)
                {
                    boton=1;
                }
            }
            iva=total/10;
            totalconiva=total+iva;
            System.out.println("El total de los productos es de "+total+"€, el iva es de "+iva+"€, y el total con el iva es de "+totalconiva+"€");
        }
    }
}