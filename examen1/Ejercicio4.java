import java.util.Scanner;
public class Ejercicio4
{

    public static void main(String[] args) 
    {
        {
            Scanner teclado=new Scanner(System.in);
            System.out.println("escribe cuantas veces quieres tirar la moneda");
            int num=teclado.nextInt();
            int cont =1, caras=0, cruces=0,random;
            while(cont<=num)
            {
                random=(int)(Math.random()*(1+0+1)+1);
                if(random==1)
                {
                    System.out.print("K  ");
                    caras++;
                }
                else
                {
                    System.out.print("#  ");
                    cruces++;
                }

                cont++;
            }
            System.out.println("");
            System.out.print("cara ha salido "+caras+" veces, y cruz ha salido "+cruces+" veces");               
        }
    }
}