package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
    public static void main(String args[])
    {
        Scanner lector = new Scanner(System.in);
        ArrayList<Integer> notas=new ArrayList <Integer>();
        System.out.println("Introduzca las notas que quiera, una vez haya acabado, escriba -1");
        int comprobar=lector.nextInt();
        while(comprobar!=-1)
        {
            if(comprobar<1||comprobar>10)
            {
                System.out.println("nota erronea ");
            }
            else
            {
                notas.add(comprobar);
            }
            System.out.print("introduzca la siguiente nota ");
            comprobar=lector.nextInt();
        }
        System.out.println(notas);
    }
}