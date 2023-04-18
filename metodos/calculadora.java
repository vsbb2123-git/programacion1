import java.util.Scanner;
public class calculadora {
    public static int menu()
    {
        
        Scanner lector=new Scanner(System.in);
        System.out.println("1. Suma (A + B)");
        System.out.println("2. Resta (A - B)");
        System.out.println("3. Multiplicación (A * B)");
        System.out.println("4. División (A / B)");
        System.out.println("5. Área de un rectángulo (Base x Altura)");
        System.out.println("6. Área de un triángulo equilátero (Base x Altura / 2)");
        System.out.println("7. Área de un círculo (Pi x R²)");
        System.out.println("8. Seno, Coseno y Tangente (de X)");
        System.out.println("9. Salir");
        System.out.println("Escriba un numero del 1 al 9");
        int opcion=lector.nextInt();
        while(opcion<1||opcion>9)
        {
            System.out.println("escriba una opcion valida (1-9)");
            opcion=lector.nextInt();
        }
        return opcion;
      
    }
    public static void suma()
    {
        Scanner lector=new Scanner(System.in);
        System.out.println("introduzca dos numeros");
        double num1=lector.nextDouble();
        double num2=lector.nextDouble();
        System.out.println(num1+" + "+num2+" = " + (num1 + num2));
    }
    public static void resta()
    {
        Scanner lector=new Scanner(System.in);
        System.out.println("introduzca dos numeros");
        double num1=lector.nextDouble();
        double num2=lector.nextDouble();
        System.out.println(num1+" - "+num2+" = " + (num1 - num2));
    }
    public static void mult()
    {
        Scanner lector=new Scanner(System.in);
        System.out.println("introduzca dos numeros");
        double num1=lector.nextDouble();
        double num2=lector.nextDouble();
        System.out.println(num1+" * "+num2+" = " + (num1 * num2));
    }
    public static void div()
    {
        Scanner lector=new Scanner(System.in);
        System.out.println("introduzca dos numeros");
        double num1=lector.nextDouble();
        double num2=lector.nextDouble();
        while(num2==0)
        {
            System.out.println("no se puede dividir entre 0, vuelve a introducir un número");
            num2=lector.nextDouble();
        }
        System.out.println(num1+" * "+num2+" = " + (num1 * num2));
    }
    public static void rect()
    {
        Scanner lector=new Scanner(System.in);
        double num1=-1;
        double num2=-1;
        
        while(num1<0||num1>1000000)
        {
            System.out.println("introduzca la base del rectángulo (entre 0 y 1000000)");
            num1=lector.nextDouble();
        }
        while(num2<0||num2>1000000)
        {
            System.out.println("introduzca la altura del rectángulo (entre 0 y 1000000)");
            num2=lector.nextDouble();
        }
        System.out.println("un rectangulo de base "+num1+" y de altura "+num2+" tiene un area de  " + (num1 * num2));
    }
    public static void tri()
    {
        Scanner lector=new Scanner(System.in);
        double num1=-1;
        double num2=-1;
        
        while(num1<0||num1>1000000)
        {
            System.out.println("introduzca la base del triángulo (entre 0 y 1000000)");
            num1=lector.nextDouble();
        }
        while(num2<0||num2>1000000)
        {
            System.out.println("introduzca la altura del triángulo (entre 0 y 1000000)");
            num2=lector.nextDouble();
        }
        System.out.println("un triángulo equilátero de base "+num1+" y de altura "+num2+" tiene un area de  " + (num1 * num2)/2);
    }
    public static void circ()
    {
        Scanner lector=new Scanner(System.in);
        double num1=-1;
        
        while(num1<0||num1>1000000)
        {
            System.out.println("introduzca el radio del circulo (entre 0 y 1000000)");
            num1=lector.nextDouble();
        }
        System.out.println("un círculo de radio "+num1+" tiene un area de  " + (num1 * num1 *Math.PI));
    }
    public static void seno()
    {
        Scanner lector=new Scanner(System.in);
        double num1=-1000;
        
        while(num1<-360||num1>360)
        {
            System.out.println("introduzca el ángulo (entre -360 y 360)");
            num1=lector.nextDouble();
        }
        System.out.println("El seno es: "+Math.sin(num1)+", el coseno es: "+Math.cos(num1)+" y la tangente es: " + Math.tan(num1));
    }


    public static boolean opcion(int opc)
    {
        if (opc==1)
        {
            suma();
        }
        if (opc==2)
        {
            resta();
        }
        if (opc==3)
        {
            mult();
        }
        if (opc==4)
        {
            div();
        }
        if (opc==5)
        {
            rect();
        }
        if (opc==6)
        {
            tri();
        }
        if (opc==7)
        {
            circ();
        }
        if (opc==8)
        {
            seno();
        }
        if (opc==9)
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
        while(opcion(menu())==false) {}      
    }  
}
