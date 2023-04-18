import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {   
        
        Scanner lector=new Scanner(System.in);
       
        System.out.println("introduce el nombre de la persona numero 1");
        String nombre=lector.nextLine();
        System.out.println("introduce los apellidos de la persona numero 1");
        String apellidos=lector.nextLine();
        System.out.println("introduce el dni de la persona numero 1");
        String dni=lector.nextLine();
        System.out.println("introduce la edad de la persona numero 1");
        int edad=lector.nextInt();
        Persona p1 = new Persona(dni, nombre, apellidos, edad);
        System.out.print(p1.nombre+" "+p1.apellidos+" con DNI "+p1.dni);

        System.out.println("introduce el nombre de la persona numero 2");
        nombre=lector.nextLine();
        System.out.println("introduce los apellidos de la persona numero 2");
        apellidos=lector.nextLine();
        System.out.println("introduce el dni de la persona numero 2");
        dni=lector.nextLine();
        System.out.println("introduce la edad de la persona numero 2");
        edad=lector.nextInt();
        Persona p2 = new Persona(dni, nombre, apellidos, edad);
        
        System.out.print(p1.nombre+" "+p1.apellidos+" con DNI "+p1.dni);
        if(p1.edad<18)
        {
            System.out.print(" no ");
        }
        System.out.println("es menor de edad");

        System.out.print(p2.nombre+" "+p2.apellidos+" con DNI "+p2.dni);
        if(p2.edad<18)
        {
            System.out.print(" no ");
        }
        System.out.println("es menor de edad");
        
    }
}
