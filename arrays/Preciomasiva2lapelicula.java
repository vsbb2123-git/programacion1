package programación.ejercicios;
import java.util.Scanner;

public class Preciomasiva2lapelicula 
{
    public static void main(String args[])
    {
        System.out.println("escriba el precio del producto para que le muestre su precio con iva");  
        
        Scanner lector = new Scanner(System.in);
        double numero = lector.nextDouble();

        if(numero>=1000)
        {
            System.out.println ("El precio con el iva es de  " + numero * 1.5);
        }
        else
        {
            System.out.println ("El precio con el iva es de  " + numero * 1.21);
        }
    }

}
