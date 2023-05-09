
import java.util.Scanner;

public class Temperatura
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        int temp = lector.nextInt();

        switch (temp) {
            case 1: case 2: case 3: case 4: case 5: 
            case 6: case 7:case 8: case 9: 
            System.out.println("Frio");
            break;
            case 10: case 11: case 12: case 13: case 14: case 15: 
            case 16: case 17:case 18: case 19:
            System.out.println("Templado");
            break;
            case 21: case 22: case 23: case 24: case 25: 
            case 26: case 27:case 28: case 29: 
            System.out.println("Caluroso");
            break;
            default:
            System.out.println("Tropical");
            }

    }
}
