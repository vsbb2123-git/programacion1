
import java.util.Scanner;

public class Diasdelasemana
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        int numero = lector.nextInt();

        switch (numero)
        {
            case 1:
            System.out.println("lunes");
            break;
            case 2:
            System.out.println("martes");
            break;
            case 3:
            System.out.println("miercoles");
            break;
            case 4:
            System.out.println("jueves");
            break;
            case 5:
            System.out.println("viernes");
            break;
            case 6:
            System.out.println("sabado");
            break;
            case 7:
            System.out.println("domingo");
            break;
            default:
            System.out.println("????????????????");
            break;
        }

    }
}
