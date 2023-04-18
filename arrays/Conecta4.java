import java.util.Scanner;
import java.util.Arrays;
public class Conecta4 
{
    public static void main (String[] args)
    {
        Scanner lector = new Scanner(System.in);
        int[][] posicion = new int[7][6];
        int cont=0;
        int cont2=0;
        int fin=0;
        int pos=0;
        int contfin=0;
        int correcta=0;
        int seguidas=0;
        while(cont2<posicion.length)
        {     
            while(cont<posicion[cont].length)
            {
                posicion[cont2][cont]=0;
                cont++;
            }
            cont=0;
            cont2++;
        }
        cont2=0;
        while(cont2<posicion[cont].length)
        {     
            while(cont<posicion.length)
            {
                System.out.print(posicion[cont][cont2]+" "); 
                cont++;
            }
            System.out.println();
            cont=0;
            cont2++;
        }
        cont2=0;
        
        while(fin==0)
        {
            System.out.println("es su turno, jugador (tu ficha es el 1, la cpu tiene el -1)");
            System.out.println("elija donde poner la ficha (0-6)");
            while(correcta==0)
            {
                pos=lector.nextInt();
                if(pos<0||pos>6)
                {
                    System.out.println("seleccione una posicion correcta (del 0 al 6)");
                }
                else if(posicion[pos][0]!=0)
                {
                    System.out.println("columna llena");
                }
                else
                {
                    correcta=1;
                }
            }
            cont=5;
            correcta=0;
            while(posicion[pos][cont]!=0)
            {
                cont--;
            }
            posicion[pos][cont]=1;
            cont=0;

            while(cont2<posicion.length)
            {     
                while(cont<posicion[cont].length)
                {
                    if(posicion[cont2][cont]==1)
                    {
                        seguidas++;
                        if(seguidas==4)
                        {
                            fin=1;
                        }
                    }
                    else
                    {
                        seguidas=0;
                    }
                    cont++;
                }
                seguidas=0;
                cont=0;
                cont2++;
            }
            cont2=0;
            while(cont<posicion[cont].length)
            {     
                while(cont2<posicion.length)
                {
                    if(posicion[cont2][cont]==1)
                    {
                        seguidas++;
                        if(seguidas==4)
                        {
                            fin=1;
                        }
                    }
                    else
                    {
                        seguidas=0;
                    }
                    cont2++;
                }
                seguidas=0;
                cont2=0;
                cont++;
            }
            cont2=0;


            if(fin!=1)
            {
                while(correcta==0)
                {
                    pos=(int) (Math.random()*7);
                    if(posicion[pos][0]==0)
                    {
                        correcta=1;
                    }
                }
                cont=5;
                correcta=0;
                while(posicion[pos][cont]!=0)
                {
                    cont--;
                }
                posicion[pos][cont]=-1;
                cont=0;

                while(cont2<posicion.length)
                {     
                    while(cont<posicion[cont].length)
                    {
                        if(posicion[cont2][cont]==-1)
                        {
                            seguidas++;
                            if(seguidas==4)
                            {
                                fin=-1;
                            }
                        }
                        else
                        {
                            seguidas=0;
                        }
                        cont++;
                    }
                    seguidas=0;
                    cont=0;
                    cont2++;
                }
                cont2=0;
                while(cont<posicion[cont].length)
                {     
                    while(cont2<posicion.length)
                    {
                        if(posicion[cont2][cont]==-1)
                        {
                            seguidas++;
                            if(seguidas==4)
                            {
                                fin=-1;
                            }
                        }
                        else
                        {
                            seguidas=0;
                        }
                        cont2++;
                    }
                    seguidas=0;
                    cont2=0;
                    cont++;
                }
                cont=0;
            }
            while(cont2<posicion[cont].length)
            {     
                while(cont<posicion.length)
                {
                    if(posicion[cont][cont2]==-1)
                    {
                        System.out.print(" "+posicion[cont][cont2]);
                    }
                    else
                    {
                        System.out.print("  "+posicion[cont][cont2]);
                    }
                     
                    cont++;
                }
                System.out.println();
                cont=0;
                cont2++;
            }
            cont2=0;
            contfin++;
            if(contfin==21&&fin==0)
            {
                fin=2;
            }
        }
        if(fin==1)
        {
            System.out.println("has ganado");
        }
        if(fin==-1)
        {
            System.out.println("ha ganado la maquina");
        }
        if(fin==2)
        {
            System.out.println("empate");
        }
    }
}
