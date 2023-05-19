import java.util.Scanner;
public class programator {
    //Vicente Santamaria Botella
    public static int menu()
    {//menú sacado por pantalla + seleccionar opcion
        Scanner lector=new Scanner(System.in);
        System.out.println("PROGRAMATOR");
        System.out.println("----------------------------");
        System.out.println("1. VOCALÍMETRO");
        System.out.println("2. CERÍMETRO");
        System.out.println("3. MEDIA VALORES ALTOS");
        System.out.println("4. SALIR");
    
        int opcion=lector.nextInt();
        while(opcion<1||opcion>4)
        {
            System.out.println("escriba una opcion valida (1-4)");
            opcion=lector.nextInt();
        }
        return opcion;
      
    }
    /*
     * 
     *    METODOS "principales"
     * 
     */
    public static void vocalímetro() 
    {
        Scanner lector=new Scanner(System.in);
        System.out.println("BIENVENIDOS AL VOCALIMETRO");
        System.out.println("Introduce una frase para comprobar la palabra con mayor número de vocales");
        String frase=lector.nextLine();
        frase=frase.toLowerCase();
        int espacio=frase.indexOf(" ");//variable para saber cual es el espacio mas cercano al principio de frase
        String masgrande=frase.substring(0,espacio);//variable para saber cual es la palabra con mas vocales de momento
        while(frase.indexOf(" ")!=-1)//bucle que va a seguir hasta que frase no tenga ningún espacio
        {
            espacio=frase.indexOf(" ");//actualizamos espacio
            masgrande=masvocales(frase.substring(0,espacio), masgrande);//metemos en masgrande la mas grande
            frase=frase.substring(espacio+1, frase.length());//"quitamos" la primera palabra de la frase
        }
        System.out.println("La palabra con mas vocales es: "+masgrande);

    }
    public static String masvocales(String a, String b)//metodo para saber cual de las dos palabras pasadas tiene mas vocales
    {
        if (numvocales(a)<=numvocales(b))
        {
            return b;
        }
        else 
        {
            return a;
        }
    }   
    public static int numvocales(String a)//metodo para saberla cantidad de vocales de una palabra
    {
        char[]dividido= a.toCharArray();
        int vocales=0;
        for(int cont=0;cont<a.length();cont++)
        {
            if((dividido[cont]=='a')||(dividido[cont]=='e')||(dividido[cont]=='i')||(dividido[cont]=='o')||(dividido[cont]=='u'))
            {
                vocales++;
            }
        }
        return vocales;
    }
    public static void cerímetro()
    {
        Scanner lector=new Scanner(System.in);
        System.out.println("BIENVENIDOS AL CERÍMETRO");
        System.out.println("introduce la cantidad de numeros que vas a guardar");
        int num=lector.nextInt();
        int[] vector = new int[num];//array para guardar todos los números
        int[] ordenado=new int[num];//array para guardar todos los numeros ordenados
        System.out.println("Ahora introduce los "+num+" números");

        for(int cont=0;cont<num;cont++)
        {
            vector[cont]=lector.nextInt();
        }
        for(int cont2= 0;cont2<num;cont2++)
        {
            for (int cont=0;cont<num;cont++)
            {
                
            }
        }
    }
    public static int numceros(int a)//metodo para saber la cantidad de ceros de un int
    {
        String conversor=String.valueOf(a);
        char[]dividido= conversor.toCharArray();
        int ceros=0;
        for(int cont=0;cont<conversor.length();cont++)
        {
            if(dividido[cont]=='0')
            {
                ceros++;
            }
        }
        return ceros;
    }
    public static void media()
    {
        Scanner lector=new Scanner(System.in);
        System.out.println("introduce la cantidad de numeros que vas a guardar");
        int num=lector.nextInt();
        int[] vector = new int[num];//array para guardar todos los números
        System.out.println("Ahora introduce los "+num+" números");
        for(int cont=0;cont<num;cont++)
        {
            vector[cont]=lector.nextInt();
        }
        double sumatresmayores=0;
        for(int cont2=0;cont2<3;cont2++)//bucle para llamar al metodo tresmayores y sumar el resultado dentro de sumatresmayores
        {
            sumatresmayores=sumatresmayores+tresmayores(vector, cont2);
        }
        System.out.println("La media aritmética de los tres valores mas altos es: " + (sumatresmayores/3));
    }
    public static int tresmayores(int[] a, int b)//metodo para saber los tres numeros mas grandes y dependiendo del parametro "b" se devuelve el mas grande, el segundo mas grande o el tercero mas grande
    {
        int mayor=a[0];//creamos variables que corresponden a los tres numeros mas grandes
        int segundomayor=0;
        int terceromayor=0;
        for(int cont=1;cont<a.length;cont++)
        {
            if (mayor<a[cont])//se va eligiendo el mayor
            {
                terceromayor=segundomayor;
                segundomayor=mayor;
                mayor=a[cont];
            }
            else if(segundomayor<a[cont])//se va eligiendo el segundo mayor
            {
                terceromayor=segundomayor;
                segundomayor=a[cont];
            }
            else if(terceromayor<a[cont])//se va eligiendo el tercero mayor
            {
                terceromayor=a[cont];
            }
        }
        if(b==0)//dependiendo de el valor de b se devueve uno de los tres numeros
        {
            return mayor;
        }
        if(b==1)
        {
            return segundomayor;
        }
        if(b==2)
        {
            return terceromayor;
        }
        return 2;//esto es para que no de error
    }   
    /*
     * 
     *    FIN METODOS "principales"
     * 
     */
    public static boolean opcion(int opc)
    {//llama a los distintos métodos despendiendo de la opcion introducida, si es un 4 devuelve true para que se acabe el programa y si no, devuelve false, haciendo que el programa siga
    
        if (opc==1)
        {
            vocalímetro();
        }
        if (opc==2)
        {
            cerímetro();
        }
        if (opc==3)
        {
            media();
        }
        if (opc==4)
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
