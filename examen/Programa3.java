import java.util.Scanner;
/*Vicente Santamaría Botella*/
import java.util.Arrays;
public class Programa3 
{
    public static void main (String[] args)
    { 
        Scanner lector = new Scanner(System.in);
        System.out.println("escriba el numero de deportistas en la competición");
        int max=lector.nextInt();;
        int cont=0;
        int cont2=0;
        String[] nombres = new String[max];
        String[] distancia = new String[max];
        int ultimoespacio=0;
        int totalpalabra=0;
        while(cont<max)
        {
            System.out.println("escriba el nombre del deportista nº "+(cont+1)+" y la distancia a la que ha lanzado el martillo");
            nombres[cont]=lector.next();
            lector.nextLine();
            cont++;
        }
        cont=0;

        while(cont<max)
        {
            ultimoespacio=nombres[cont].lastIndexOf(" ");
            totalpalabra=nombres[cont].length();
            distancia[cont]=nombres[cont].substring(ultimoespacio, totalpalabra); 
            cont++;
        }
        cont=max;
        Arrays.sort(distancia);
        while(cont>0)
        {
            while (cont2<max)
            {
                ultimoespacio=nombres[cont2].lastIndexOf(" ");
                totalpalabra=nombres[cont2].length();
                if(distancia[cont].equals(nombres[cont2].substring(ultimoespacio, totalpalabra)))
                {
                    System.out.println(cont+". "+nombres [cont2]);
                }
                cont2++;
            }
            cont2=0;
            cont--;
        }        
    }
}
