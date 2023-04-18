import java.util.Scanner;
public class Ejercicio1
{
    public static void main(String[] args) 
    {
        {
            Scanner teclado=new Scanner(System.in);
            System.out.println("escribe un numero");
            int num=teclado.nextInt();
            int cont=1, res;
            while (cont<=10)
            {
                res=cont*num;
                cont++;
                System.out.print(res+"   ");
            }
        }
    }
}