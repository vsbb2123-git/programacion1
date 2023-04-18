import java.util.Scanner;
/*Vicente Santamaría Botella*/
public class Programa2 
{
    public static void main (String[] args)
    { 
        Scanner lector = new Scanner(System.in);
        System.out.println("escriba el numero de las filas y columnas de la matriz");
        int f=lector.nextInt();
        int c=lector.nextInt();
        int contf=0;
        int contc=0;
        int totalfila=0;
        int[][] matriz = new int[f][c];
        while(contc<c)
        {
            while (contf<f)
            {
                matriz[contf][contc]=(int)(Math.random()*21);
                contf++;
            }
            contf=0;
            contc++;
        }
        contc=0;
        System.out.println("escriba un numero");
        int num=lector.nextInt();
        while(contf<f)
        {
            while (contc<c)
            {
                System.out.print(matriz[contf][contc]+"   ");
                if(matriz[contf][contc]%num==0)
                {
                    totalfila+=matriz[contf][contc];
                }
                contc++;
            }
            System.out.println("Fila "+contf+": "+ totalfila);
            totalfila=0;
            contc=0;
            contf++;
        }
        
    }
}
