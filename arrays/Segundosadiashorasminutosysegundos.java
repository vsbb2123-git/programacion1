
import java.util.Scanner;

public class Segundosadiashorasminutosysegundos
{
    public static void main(String args[])
    {
        System.out.println("Escriba los segundos");  

        Scanner lector = new Scanner(System.in);
    
        int segundos = lector.nextInt();

        int minutos = segundos/60;
        segundos = segundos-minutos*60;
        int horas = minutos/60;
        minutos = minutos-horas*60;
        int dias = horas/24;
        horas = horas-dias*24;

        System.out.println ("Eso se convierte a "+ dias +"  dias, "+ horas +"  horas, "+ minutos +"  minutos, "+ segundos +" segundos");
    }
}