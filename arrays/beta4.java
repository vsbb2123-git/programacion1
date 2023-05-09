
import java.util.Scanner;

public class beta4
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("escribe todas las notas, y cuando acabes escribe -1 (escribe solo valores enteros de 1 al 10 para las notas)");
        int cont =0, total=0, diez=0, numero=0;

        while(numero !=-1)
        {
            numero = lector.nextInt();
            if(numero!=-1)
            {
                cont++;
                if (numero== 10)
                {
                    diez++;
                }
                total =total+numero;
            }
            
        }
        System.out.println("la suma total de todos los numeros introducidos es "+total+" la media es "+(total/cont)+" y has tenido "+diez+" dieces");
    }
}
