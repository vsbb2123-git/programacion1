package programación.ejercicios;
import java.util.Scanner;

public class Horasadiasysemanas
{
    public static void main(String args[])
    {
        System.out.println("Escriba un numero de horas para pasarlas a dias y semanas");  

        Scanner lector = new Scanner(System.in);
    
        int horas = lector.nextInt();

        int dias = horas/24;
        int semanas = dias/7;
        dias = dias-(semanas*7);
 
        System.out.println (horas + " horas son " + semanas + " semanas y " + dias + " dias");
    }

}
