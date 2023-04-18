import java.util.Arrays;
import java.util.Scanner;
public class cuentasbancarias {
    public static int menu()
    {
        
        Scanner lector=new Scanner(System.in);
        System.out.println("1. Ver cuentas.");
        System.out.println("2. Ingresar dinero.");
        System.out.println("3. Retirar dinero.");
        System.out.println("4. Agregar cuenta.");
        System.out.println("5. Eliminar cuenta");
        System.out.println("6. Buscar cuenta.");
        System.out.println("7. Mostrar morosos.");
        System.out.println("8. Salir");
        System.out.println("Escriba un numero del 1 al 8");
        int opcion=lector.nextInt();
        while(opcion<1||opcion>8)
        {
            System.out.println("escriba una opcion valida (1-8)");
            opcion=lector.nextInt();
        }
        return opcion;
      
    }
    public static void vercuentas(int[] dinero, String[] nombre)
    {
        int continv=99;
        int cont=0;
        while(nombre[continv].equals("vacío")&&continv!=0)
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
    }
    public static void ingresar(int[] dinero, String[] nombre)
    {
        Scanner lector=new Scanner(System.in);
        vercuentas(dinero, nombre);
        System.out.print("Introduce el numero de la cuenta");
        int num;
        int cont=lector.nextInt();
        if(nombre[cont].equals("vacío")){System.out.println("esta cuenta no existe");}
        else
        {
            
            System.out.println("Introduce el dinero que desea ingresar");
            num=lector.nextInt();
            dinero[cont]=dinero[cont]+num;
            System.out.println("Se han ingresado "+num+" euros a la cuenta de "+nombre[cont]);
        } 
    }
    public static void retirar(int[] dinero, String[] nombre)
    {
        Scanner lector=new Scanner(System.in);
        vercuentas(dinero, nombre);
        System.out.print("Introduce el numero de la cuenta");
        int cont=lector.nextInt();
        int num;
        if(nombre[cont].equals("vacío")){System.out.println("esta cuenta no existe");}
        else
        {
            
            System.out.println("Introduce el dinero que desea retirar");
            num=lector.nextInt();
            dinero[cont]=dinero[cont]-num;
            System.out.println("Se han retirado "+num+" euros a la cuenta de "+nombre[cont]);
        }
    }
    public static void agregar(int[] dinero, String[] nombre)
    {
        int cont=0;
        Scanner lector=new Scanner(System.in);
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
    }
    public static void eliminar(int[] dinero, String[] nombre)
    {
        Scanner lector=new Scanner(System.in);
        vercuentas(dinero, nombre);
        System.out.print("Introduce el numero de la cuenta");
        int cont=lector.nextInt();
        if(nombre[cont].equals("vacío")){System.out.println("Esta cuenta no existe");}
        else
        {
            nombre[cont]="vacío";
            dinero[cont]=0;
            System.out.println("Cuenta borrada");
        }
    }
    public static void buscar(int[] dinero, String[] nombre)
    {
        Scanner lector=new Scanner(System.in);
        System.out.print("Dime el nombre a buscar: ");
        String buscar = lector.next();
        boolean encontrado = false;
        int cont=0;
        while (cont < 100) 
        {
            if(nombre [cont].equals("vacío")){}
            else if (nombre[cont].toUpperCase().indexOf(buscar.toUpperCase()) != -1) {
                System.out.println(cont+". "+nombre[cont]+" Saldo: "+dinero[cont]+" euros");
                encontrado = true;
            }
            cont++;
        }
        if (!encontrado)
        System.out.println("No se han encontrado cuentas");
    }
    public static void morosos(int[] dinero, String[] nombre)
    {
        int cont=0;
        while(cont<dinero.length)
        {
            if(dinero[cont]<0)
            {
                System.out.println(cont+". "+nombre[cont]+" Saldo: "+dinero[cont]+" euros");
            }
            cont++;
        }     
    }


    public static boolean opcion(int opc, int[] dinero, String[] nombre)
    {
        if (opc==1)
        {
            vercuentas(dinero, nombre);
        }
        if (opc==2)
        {
            ingresar(dinero, nombre); 
        }
        if (opc==3)
        {
            retirar(dinero, nombre);
        }
        if (opc==4)
        {
            agregar(dinero, nombre);
        }
        if (opc==5)
        {
            eliminar(dinero, nombre);
        }
        if (opc==6)
        {
            buscar(dinero, nombre);
        }
        if (opc==7)
        {
            morosos(dinero, nombre);
        }
        if (opc==8)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        int[] dinero = new int[100];
        String[] nombre = new String[100];
        Arrays.fill(nombre, "vacío");
        while(opcion(menu(), dinero, nombre)==false) {}      
    }  
}
