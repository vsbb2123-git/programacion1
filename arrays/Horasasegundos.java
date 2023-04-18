package programación.ejercicios;
import java.util.Scanner;

public class Horasasegundos
{
    public static void main(String args[])
    {
        System.out.println("Escriba las horas");  

        Scanner lector = new Scanner(System.in);
    
        int horas = lector.nextInt();

        int segundos = 3600 * horas;

        System.out.println (horas + " horas son " + segundos + " segundos");
    }
}