
import java.util.Scanner;

public class Entregable3
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Escriba cinco números ");  
        double num1 = lector.nextDouble();
        double num2 = lector.nextDouble();
        double num3 = lector.nextDouble();
        double num4 = lector.nextDouble();
        double num5 = lector.nextDouble();

        double total = num1 + num2 + num3 + num4 + num5;
        System.out.println ("el precio total es "+ total +"€");

        double descuento = total * 0.1;
        System.out.println ("el valor del descuento es "+ descuento +"€");

        double totalsindesc = total - descuento;
        System.out.println ("el precio a pagar con el descuento es de "+ totalsindesc +"€");
       
        double iva = totalsindesc * 0.21;
        System.out.println ("el valor del iva a pagar es de  "+ iva +"€");
        
        double recibo = totalsindesc + iva ;
        System.out.println ("el precio final con descuento e iva es de "+ recibo +"€"); 
    }
}