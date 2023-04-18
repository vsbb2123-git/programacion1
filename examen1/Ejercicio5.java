import java.util.Scanner;
public class Ejercicio5
{

    public static void main(String[] args) 
    {
        {
            Scanner teclado=new Scanner(System.in);
            System.out.println("escriba los dias, mes y año, respectivamente");
            int dia=teclado.nextInt();
            int mes=teclado.nextInt();
            int año=teclado.nextInt();

            System.out.println("ahora escriba un numero que determinará cuantos dias pasarán tras la fecha previamente introducida");
            int X=teclado.nextInt();
            int cont=1;
            while(cont<=X)
            {

                if (dia>=30)
                {
                    dia=1;
                    if (mes>=12)
                    {
                        año++;
                        mes=1;
                    }
                    else 
                    {
                        mes++;
                    }
                }
                else 
                {
                   dia++; 
                }
                System.out.println(dia+"/"+mes+"/"+año);
                cont++;
            }
        
        }
    }
}