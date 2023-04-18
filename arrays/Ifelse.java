package programación.ejercicios;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Ifelse
{
    public static void main(String args[])
    {
        System.out.println("dime tu edad");  

        Scanner lector = new Scanner(System.in);
    
        int edad = lector.nextInt();
        
        if(edad>125)
        {
            System.out.println("lo que tú digas dinosaurio");
        }
        else if(edad>100)
        {
            System.out.println("centenario");
        }
        else if(edad>=18)
        {
            System.out.println("mayor de edad");
        }
        else if(edad>=0)
        {
            System.out.println("menor de edad");
        }
        else 
        {
            System.out.println("Error");
        }
    }
}
