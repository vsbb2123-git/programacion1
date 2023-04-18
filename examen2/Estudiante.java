//Vicente Santamaria Botella
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
public class Estudiante
{
    //creamos los atributos 
    private String Nombre, Apellidos, DNI;
    private int AnyoNacimiento; 
    private double NotaMedia; 
    public static Estudiante DAM1[]=new Estudiante[30];
    public static Estudiante DAM2[]=new Estudiante[30];
    //Constructor   
    public Estudiante(String Nombre, String Apellidos, String DNI, int AnyoNacimiento, double NotaMedia)
    {
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.DNI=DNI;
        if(NotaMedia<=10 && NotaMedia>=0)
        {
            this.NotaMedia=NotaMedia;
        }
        else
        {
            System.out.println("Nota media inválida, tiene que ser un numero entre 0 y 10");
        }
        if(AnyoNacimiento<=2009 && AnyoNacimiento>=1900)
        {
            this.AnyoNacimiento=AnyoNacimiento;
        }
        else
        {
            System.out.println("Año de nacimiento inválido, tiene que ser una fecha entre 1900 y 2009");
        }
    }
    //Getters y setters
    public String getNombre() 
    {
        return Nombre;
    }
    public void setNombre(String nombre) 
    {
        Nombre = nombre;
    }
    public String getApellidos() 
    {
        return Apellidos;
    }
    public void setApellidos(String apellidos) 
    {
        Apellidos = apellidos;
    }
    public String getDNI() 
    {
        return DNI;
    }
    public void setDNI(String dNI) 
    {
        DNI = dNI;
    }
    public int getAnyoNacimiento() 
    {
        return AnyoNacimiento;
    }
    public void setAnyoNacimiento(int anyoNacimiento) 
    {
        if(AnyoNacimiento<=2009 && AnyoNacimiento>=1900)
        {
            AnyoNacimiento = anyoNacimiento;
        }
        else
        {
            System.out.println("Año de nacimiento inválido, tiene que ser una fecha entre 1900 y 2009");
        }
    }
    public double getNotaMedia() 
    {
        return NotaMedia;
    }
    public void setNotaMedia(double notaMedia) 
    {
        if(notaMedia<=10 &&  notaMedia>=0)
        {
            NotaMedia=notaMedia;
        }
        else
        {
            System.out.println("Nota media inválida, tiene que ser un numero entre 0 y 10");
        }
    }
    //Métodos
    public void Imprimeinfo()//metodo para imprimir por pantalla la informacion de un alumno en concreto
    {
        System.out.println("Alumno/a: "+Nombre+" "+Apellidos);
        System.out.println("DNI: "+DNI);
        System.out.println("Edad: "+ (2023-AnyoNacimiento));
        System.out.println("Nota media: "+ NotaMedia);
    }
    public void MostrarInfoClase(int curso)//método para sacar por pantalla la informacion de toda la clase, le tienes que pasar el curso que quieres que muestre
    {
        if(curso==1)
        {   
            int cuentalumnos=0, cuentaprobados=0, cuentasuspensos=0;
            double sumanotas=0;
            for(int cont=0;cont<100;cont++)
            {
                if(DAM1[cont]!=null)
                {   
                    System.out.println("*******  ALUMNO/A "+cont+"  *******");
                    DAM1[cont].Imprimeinfo();
                    cuentalumnos++;
                    sumanotas=sumanotas+DAM1[cont].NotaMedia;
                    if(DAM1[cont].NotaMedia<5)
                    {
                        cuentasuspensos++;
                    }
                    else
                    {
                        cuentaprobados++;
                    }
                }
            }
            if(cuentalumnos==0)
            {
                System.out.println("no hay alumnos registrados en DAM1");
            }
            System.out.println("La clase tiene "+ cuentalumnos+" alumnos/as");
            System.out.println("*************************************");
            System.out.println("Hay "+cuentaprobados+" alumnos con nota media de aprobado");
            System.out.println("Hay "+cuentasuspensos+" alumnos con nota media de suspensa");
            System.out.println("LA NOTA MEDIA DE LA CLASE ES DE: "+sumanotas/cuentalumnos);
        }
        if(curso==2)
        {
            int cuentalumnos=0, cuentaprobados=0, cuentasuspensos=0;
            double sumanotas=0;
            for(int cont=0;cont<100;cont++)
            {
                if(DAM2[cont]!=null)
                {   
                    System.out.println("*******  ALUMNO/A "+cont+"  *******");
                    DAM2[cont].Imprimeinfo();
                    cuentalumnos++;
                    sumanotas=sumanotas+DAM2[cont].NotaMedia;
                    if(DAM2[cont].NotaMedia<5)
                    {
                        cuentasuspensos++;
                    }
                    else
                    {
                        cuentaprobados++;
                    }
                }
            }
            if(cuentalumnos==0)
            {
                System.out.println("no hay alumnos registrados en DAM2");
            }
            System.out.println("La clase tiene "+ cuentalumnos+" alumnos/as");
            System.out.println("*************************************");
            System.out.println("Hay "+cuentaprobados+" alumnos con nota media de aprobado");
            System.out.println("Hay "+cuentasuspensos+" alumnos con nota media de suspensa");
            System.out.println("LA NOTA MEDIA DE LA CLASE ES DE: "+sumanotas/cuentalumnos);
        }
    }
    public void anyadir()//método para añadir un alumno
    {
        Scanner lector = new Scanner(System.in);
        String NOM, AP, Dni;       //variables en las que se guardarán los datos (nombre, apellido y DNI)
        int F_N;                   //variable en la que guardará la fecha de nacimiento
        double N_M;                //variable en la que guardará la nota media
        System.out.println("Por favor escriba el nombre del alumno");//se rellenan todas las variables
        NOM=lector.nextLine();
    
        System.out.println("Por favor escriba los apellidos del alumno");
        AP=lector.nextLine();
    
        System.out.println("Por favor escriba el DNI del alumno");
        Dni=lector.nextLine();

        System.out.println("Por favor escriba el año de nacimiento del alumno");
        F_N=lector.nextInt();
        if(F_N>=2009 && F_N<=1900)
        {
            System.out.println("Fecha incorrecta");
           
        }

        System.out.println("Por favor escriba la nota media del alumno");
        N_M=lector.nextDouble();
        if(F_N>=0 && F_N<=10)
        {
            System.out.println("Nota incorrecta");
        }
        System.out.println("en que curso quiere meter al alumno? (1 para DAM1 y 2 para DAM2)");
        int curso=lector.nextInt();

       if (curso==1)//se elige un curso dependiendo de la eleccion del usuario
        {
            int cont=0;
            while(DAM1[cont]!=null&&cont<30) //bucle para que se guarde en el primer hueco disponible
            {
                cont++;
            }
            if (cont==30)
            {
                System.out.println("no se ha podido añadir el alumno a DAM 1 por que la clase está llena");
            }
                DAM1[cont]=new Estudiante(NOM, AP, Dni, F_N, N_M);
        }
        else if (curso==2)
        {  
            int cont=0;
            while(DAM2[cont]!=null&&cont<30) //bucle para que se guarde en el primer hueco disponible
            {
                cont++;
            }
            if (cont==30)
            {
                System.out.println("no se ha podido añadir el alumno a DAM 2 por que la clase está llena");
            }
            DAM2[cont]=new Estudiante(NOM, AP, Dni, F_N, N_M);
        } 
        else
        {
            System.out.println("esa clase no existe");
        }
    }

    public void editar()//metodo para editar un alumno ya creado
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriba el curso del alumno que quiere editar (1 para DAM1 y 2 para DAM2)");
        int curso=lector.nextInt();
        System.out.println("Escriba el numero del alumno que quiere editar");
        int num=lector.nextInt();

        System.out.println("Por favor escriba el nombre del alumno");
        String NOM=lector.nextLine();
    
        System.out.println("Por favor escriba los apellidos del alumno");
        String AP=lector.nextLine();
    
        System.out.println("Por favor escriba el DNI del alumno");
        String Dni=lector.nextLine();

        System.out.println("Por favor escriba el año de nacimiento del alumno");
        int F_N=lector.nextInt();
        while(F_N>=2009 && F_N<=1900)
        {
            System.out.println("Por favor escriba un año correcto (1900-2009)");
            F_N=lector.nextInt();
        }

        System.out.println("Por favor escriba la nota media del alumno");
        double N_M=lector.nextDouble();
        while(F_N>=0 && F_N<=10)
        {
            System.out.println("Por favor escriba una nota correcta (0-10)");
            F_N=lector.nextInt();
        }
        if (curso==1)//se elige un curso dependiendo de la eleccion del usuario
        {
            int cont=0;
            while(DAM1[cont]!=null&&cont<30) //bucle para que se guarde en el primer hueco disponible
            {
                cont++;
            }
            if (cont==30)
            {
                System.out.println("no se ha podido añadir el alumno a DAM 1 por que la clase está llena");
            }
                DAM1[cont]=new Estudiante(NOM, AP, Dni, F_N, N_M);
        }
        else if (curso==2)
        {  
            int cont=0;
            while(DAM2[cont]!=null&&cont<30) //bucle para que se guarde en el primer hueco disponible
            {
                cont++;
            }
            if (cont==30)
            {
                System.out.println("no se ha podido añadir el alumno a DAM 2 por que la clase está llena");
            }
            DAM2[cont]=new Estudiante(NOM, AP, Dni, F_N, N_M);
        } 
    }
    public void eliminar()//metodo para eliminar un alumno de una clase
    { 
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriba el curso del alumno que quiere borrar (1 para DAM1 y 2 para DAM2)");
        int curso=lector.nextInt();
        System.out.println("Escriba el numero del alumno que quiere borrar");
        int num=lector.nextInt();
        if(curso==1)
        {
            System.out.println("El alumno que se va a borrar es: "+ DAM1[num].Nombre+" "+DAM1[num].Apellidos+", está seguro de que lo quiere borrar? (1 para si, 0 para no)");
            int confirmar=lector.nextInt();
            if (confirmar==1)
            {
                System.out.println("Alumno borrado");
                DAM1[num]=null;
            }
            else
            {
                System.out.println("Operación cancelada");
            }
        }
        else if(curso==2)
        {
            System.out.println("El alumno que se va a borrar es: "+ DAM2[num].Nombre+" "+DAM2[num].Apellidos+", está seguro de que lo quiere borrar? (1 para si, 0 para no)");
            int confirmar=lector.nextInt();
            if (confirmar==1)
            {
                System.out.println("Alumno borrado");
                DAM2[num]=null;
            }
            else
            {
                System.out.println("Operación cancelada");
            }
        }
    }
}
