import java.util.Scanner;
import java.util.Arrays;
public class bankapp 
{
    public static void main (String[] args)
    {
        Scanner lector = new Scanner(System.in);
        int[] dinero = new int[100];
        String[] nombre = new String[100];
        Arrays.fill(nombre, "vacío");
        int cont=0;
        int num=0;
        int continv=99;
        int selector=9;
        System.out.println("1. Ver cuentas");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Agregar cuenta");
        System.out.println("5. Eliminar cuenta");
        System.out.println("6. Buscar cuenta");
        System.out.println("7. Mostrar morosos");
        System.out.println("8. Salir");
        while(selector!=8)
        {
            if(selector==1)
            {   while(nombre[continv].equals("vacío")&&continv!=0)
                {
                    continv--;
                }
                if(continv==0 && nombre[continv].equals("vacío")){System.out.println("no hay cuentas");}
                else
                {
                    while(cont<=continv)
                    {
                        System.out.println(cont+". "+nombre[cont]+" Saldo: "+dinero[cont]+" euros");
                        cont++;
                    }
                }
                
                continv=99;
                cont=0;
            }
            if(selector==2)
            {   
                System.out.print("Introduce el numero de la cuenta");
                cont=lector.nextInt();
                if(nombre[cont].equals("vacío")){System.out.println("esta cuenta no existe");}
                else
                {
                    
                    System.out.println("Introduce el dinero que desea ingresar");
                    num=lector.nextInt();
                    dinero[cont]=dinero[cont]+num;
                    System.out.println("Se han ingresado "+num+" euros a la cuenta de "+nombre[cont]);
                } 
                cont=0;
                num=0;
            }
            if(selector==3)
            {
                System.out.print("Introduce el numero de la cuenta");
                cont=lector.nextInt();
                if(nombre[cont].equals("vacío")){System.out.println("esta cuenta no existe");}
                else
                {
                    
                    System.out.println("Introduce el dinero que desea retirar");
                    num=lector.nextInt();
                    dinero[cont]=dinero[cont]-num;
                    System.out.println("Se han retirado "+num+" euros a la cuenta de "+nombre[cont]);
                }
                cont=0;
                num=0;
            }
            if(selector==4)
            {
                while(!nombre[cont].equals("vacío"))
                {
                    cont++;
                }
                if(cont==100)
                {
                    System.out.print("demasiadas cuentas");
                }
                else
                {
                    System.out.println("Introduce el nombre de la cuenta");
                    nombre[cont]=lector.next();
                    System.out.println("Introduce el saldo de la cuenta");
                    dinero[cont]=lector.nextInt();
                }
                cont=0;
            }
            if(selector==5)
            {
                System.out.print("Introduce el numero de la cuenta");
                cont=lector.nextInt();
                if(nombre[cont].equals("vacío")){System.out.println("Esta cuenta no existe");}
                else
                {
                    nombre[cont]="vacío";
                    dinero[cont]=0;
                    System.out.println("Cuenta borrada");
                }
                cont=0;
            }   
            if(selector==6)
            {

                System.out.print("Dime el nombre a buscar: ");
                String buscar = lector.next();
                boolean encontrado = false;
                while (cont < 100) 
                {
                    if(nombre [cont].equals("vacío")){}
                    else if (nombre[cont].toUpperCase().indexOf(buscar.toUpperCase()) != -1) {
                        System.out.println(cont+". "+nombre[cont]+" Saldo: "+dinero[cont]+" euros");
                        encontrado = true;
                    }
                    cont++;
                }
                cont=0;
                if (!encontrado)
                System.out.println("No se han encontrado cuentas");
            }

            if(selector==7)
            {
                while(cont<dinero.length)
                {
                    if(dinero[cont]<0)
                    {
                        System.out.println(cont+". "+nombre[cont]+" Saldo: "+dinero[cont]+" euros");
                    }
                    cont++;
                }
                cont=0;
            }
            System.out.println();
            System.out.println("1. Ver cuentas");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Agregar cuenta");
            System.out.println("5. Eliminar cuenta");
            System.out.println("6. Buscar cuenta");
            System.out.println("7. Mostrar morosos");
            System.out.println("8. Salir");
            System.out.println();
            selector=lector.nextInt();
        }
    }    
}
