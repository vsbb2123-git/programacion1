import java.net.Socket;
import java.util.Scanner;
public class paciente 
{   
    //creamos las variables
    private boolean cuidados_especiales, tratado;   //comprobantes de tratamiento/cuidados especiales
    private  String SIP, nombre, direccion;               //SIP, nombre y dirección del paciente
    public static paciente pacientes[]=new paciente[100];
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSIP() {
        return SIP;
    }
    public boolean getCuidados_especiales() {
        return cuidados_especiales;
    }
    public boolean getTratado() {
        return tratado;
    }
    public void setSIP(String sIP) {
        SIP = sIP;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setCuidados_especiales(boolean cuidados_especiales) {
        this.cuidados_especiales = cuidados_especiales;
    }
    public static void setPacientes(paciente[] pacientes) {
        paciente.pacientes = pacientes;
    }
    
    //constructor de un paciente pasando sip nombre y dirección y poniendo tratado y cuidados especiales a false
    public paciente(String sip, String nom, String dir)
    {
        this.SIP = sip;
        this.nombre = nom;
        this.direccion = dir;
        this.cuidados_especiales=false;
        this.tratado=false;
    }
    public paciente()   {    }//constructor vacío
    //métodos
    public static void altapaciente()      //método paara crear pacientes con las variables sip nombre y direccion
    {
        Scanner lee = new Scanner(System.in);
        String SIP, NOM, DIR;       //variables en las que guardarán los datos

        System.out.println("Por favor escriba el SIP del paciente");
        SIP=lee.nextLine();
    
        System.out.println("Por favor escriba el nombre del paciente");
        NOM=lee.nextLine();
    
        System.out.println("Por favor escriba la dirección del paciente");
        DIR=lee.nextLine();
        int cont=0;
        while(pacientes[cont]!=null&&cont<100) //bucle para que se guarde en el primer hueco disponible
        {
            cont++;
        }
        if (cont==100)
        {
            System.out.println("no se ha podido añadir el paciente a la base de datos por que está llena");
        }
        else
        {
            pacientes[cont]=new paciente(SIP, NOM, DIR);
        }
    }
    public static void Bajapaciente() //método para borrar pacientes en base al numero de paciente pedido al usuario
    {
        Scanner lee = new Scanner(System.in);
        System.out.println("Por favor escriba el número del paciente que se va a dar de baja");
        int num=lee.nextInt();
        System.out.println("El paciente que se ba a dar de baja es: "+ pacientes[num].nombre+" con SIP: "+pacientes[num].SIP+", está seguro de que lo quiere borrar? (1 para si, 0 para no)");
        int confirmar=lee.nextInt();
        if (confirmar==1)
        {
            System.out.println("Paciente dado de baja");
            pacientes[num]=null;
            pacientes[num]=new paciente();
        }
        else
        {
            System.out.println("Operación cancelada");
        }
    }
    public static void DatosPaciente()//método para sacar por pantalla los datos de todos los pacientes ordenados por el numero de paciente 
     {
        int vacio=0;
        for(int cont=0;cont<100;cont++)
        {
            if(pacientes[cont]!=null)
            System.out.println("Paciente nº "+cont+" nombre: "+pacientes[cont].nombre+", SIP: "+pacientes[cont].SIP+" y dirección: "+pacientes[cont].direccion+".");
            vacio++;
        }
        if(vacio==0)
        {
            System.out.println("no hay pacientes registrados");
        }
    }
    public static void BuscarPaciente()//método para buscar uno o mas pacientes en base a una cadena de texto
    {
        Scanner lee = new Scanner(System.in);
        System.out.println("Por favor escriba el nombre del paciente que quiere buscar");
        String buscar = lee.next();
        boolean encontrado = false;
        for(int cont=0;cont<100;cont++)
        {
            if(pacientes[cont]==null){}
            else if (pacientes[cont].nombre.toUpperCase().indexOf(buscar.toUpperCase()) != -1) {
                System.out.println
                
                
                ("Paciente nº "+cont+" nombre: "+pacientes[cont].nombre+", SIP: "+pacientes[cont].SIP+" y dirección: "+pacientes[cont].direccion);
                encontrado = true;
            }
            cont++;
        }
        if (!encontrado)
        System.out.println("No se han encontrado pacientes");
    }
    public static void TratarPaciente()//método para tratar un paciente(poner la variable tratado a true si es false)
    {
        Scanner lee = new Scanner(System.in);
        System.out.println("Por favor escriba el número del paciente a tratar");
        int num=lee.nextInt();
        if(pacientes[num]==null)
        {
            System.out.println("Este paciente no existe");
        }
        else if(pacientes[num].tratado==true)
        {
            System.out.println("Este paciente ya estaba tratado");
        }
        else
        {
            pacientes[num].tratado=true;
            System.out.println("Paciente tratado de manera correcta");
        }
    }
    public static void VerTratados()//método para ver los pacientes ya tratados
    {
        for(int cont=0;cont<100;cont++)
        {
            if(pacientes[cont]!=null&&pacientes[cont].tratado==true)
            System.out.println("Paciente nº "+cont+" nombre: "+pacientes[cont].nombre+", SIP: "+pacientes[cont].SIP+" y dirección: "+pacientes[cont].direccion+".");
        }
    }
    public static void CuidadosEspeciales()//metodo para enviar a un paciente a cuidados especiales(poner la variable cuidados_especiales a true si es false)
    {
        Scanner lee = new Scanner(System.in);
        System.out.println("Por favor escriba el número del paciente que quiere llevar a cuidados especiales");
        int num=lee.nextInt();
        if(pacientes[num]==null)
        {
            System.out.println("Este paciente no existe");
        }
        else if(pacientes[num].cuidados_especiales==true)
        {
            System.out.println("Este paciente ya estaba en cuidados especiales");
        }
        else
        {
            pacientes[num].cuidados_especiales=true;
            System.out.println("Paciente llevado a cuidados especiales");
        }
    }
    public static void VerCuidadosEspeciales()//método para ver los pacientes en cuidados especiales
    {
        for(int cont=0;cont<100;cont++)
        {
            if(pacientes[cont]!=null&&pacientes[cont].cuidados_especiales==true)
            System.out.println("Paciente nº "+cont+" nombre: "+pacientes[cont].nombre+", SIP: "+pacientes[cont].SIP+" y dirección: "+pacientes[cont].direccion+".");
        }
    }
    public static int asignado()//método para seleccionar un paciente a asignar, devuelve el numero del paciente, si no detecta el paciente, devuelve un -1
    {
        Scanner lee = new Scanner(System.in);
        System.out.println("Que paciente quiere asignar?");
        int num=lee.nextInt();
        if(num<0||num>99)
        {
            return -1;
        }
        else if(pacientes[num]==null)
        {
            return -1;
        }
        else 
        {
            return num;
        }
        
    }
}
