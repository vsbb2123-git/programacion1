
import java.util.Scanner;

public class beta9
{
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        int cont=1, dado, uno=0, dos=0, tres=0, cuatro=0, cinco=0, seis=0;
        while(cont<=100)
        {
            dado = (int)(Math.random()*6+1);
            cont++;
            switch (dado)
            {
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
                case 6:
                    seis++;
                    break;
            }
        }
        System.out.print(uno+" ");System.out.print(dos+" ");System.out.print(tres+" ");System.out.print(cuatro+" ");System.out.print(cinco+" ");System.out.println(seis);
        System.out.print(uno *100/100+"% ");System.out.print(dos*100/100+"% ");System.out.print(tres*100/100+"% ");System.out.print(cuatro*100/100+"% ");System.out.print(cinco*100/100+"% "); System.out.println(seis*100/100+"% ");
    }
}
