package examen3.pregunta1;



import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("DNI? ");
                String dni = in.nextLine();
                if (dni.equals("-1"))
                    break;

                System.out.print("Nombre? ");
                String nombre = in.nextLine();

                System.out.print("Día? ");
                int dia = in.nextInt();
                System.out.print("Mes? ");
                int mes = in.nextInt();
                System.out.print("Año? ");
                int año = in.nextInt();
                in.nextLine();

                Carnet c1 = new Carnet(dni, nombre, dia, mes, año);
                System.out.println(c1);
                System.out.println();

            } catch (Exception e) {
                System.out.println(e.getMessage());
                in.nextLine();
            }
        }
        
    }


}
