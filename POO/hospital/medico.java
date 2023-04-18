import java.lang.reflect.Array;
import java.util.Scanner;

public class medico {
    /*
     * DNI = DNI del medico
     * Especialización = Tipo de tratamiento que hace el medico
     * Nombre = Nombre del medico
     * Apellidos = Apellidos del medico
     */

    // Atributos
    String DNI;
    String Especializacion;
    String Nombre;
    String Apellidos;
    Integer paciente_posicion;

    // Atributos Estaticos
    private static int maxMedicos = 100;
    private static int contMedicos = 0;
    public static medico[] medicos = new medico[maxMedicos];

    // Getters and Setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getEspecializacion() {
        return Especializacion;
    }

    public void setEspecializacion(String especializacion) {
        Especializacion = especializacion;
    }

    // Constructor
    public medico(String dNI, String especializacion, String nombre, String apellidos) {
        DNI = dNI;
        Especializacion = especializacion;
        Nombre = nombre;
        Apellidos = apellidos;
    }

    // Constructor vacio
    public medico() {

    }

    // Métodos del medico

    /*
     * Función que permite añadir todos los datos de un objeto "medico",
     * que cuando se guarda el objeto en el array, aumenta en 1 el contador de
     * la posición del array
     */

    // Si lleno es = 0, no hay datos en el array, si es 1, el array esta lleno y
    // si es 2 es cualquier opcion que no sea las dos anteriores
    public static int estado_array() {
        int cantidad = 0;
        int lleno;
        for (int cont = 0; cont < 100; cont++) {
            if (medicos[cont] == null) {
                cantidad++;
            }
        }

        if (cantidad == 100) {
            lleno = 0;
        } else if (cantidad == 0) {
            lleno = 1;
        } else {
            lleno = 2;
        }
        return lleno;
    }

    // Añadir un medico si la funcion "Estado_Array" da un 0 o un 2, si da 0,
    // mostrara por pantalla que la base de datos esta llena
    public static void AddMedico() {
        int estado = estado_array();
        if (estado != 1) {
            Scanner lee = new Scanner(System.in);
            System.out.println("Introudzca el nombre del medico");
            String nombre = lee.nextLine();
            System.out.println("Introduzca los apellidos del medico");
            String Apellidos = lee.nextLine();
            System.out.println("Introduzca el DNI del medico");
            String Dni = lee.nextLine();
            System.out.println("Introduzca la especialización del medico");
            String especializacion = lee.nextLine();
            medicos[contMedicos] = new medico(Dni, especializacion, nombre, Apellidos);
            contMedicos++;
        } else {
            System.out.println("La base de datos esta vacia");
        }
    }

    /*
     * Funcion que escribe en la posición del array que
     * elija el usuario, y escribe en esa posición
     * "null", para indicar que esa posición esta vacia.
     * Luego ordena el array para evitar dejar paosiciones vacias en
     * medio de posiciones con datos.
     */

    public static void DespedirMedico() {
        int estado = estado_array();
        Scanner lee = new Scanner(System.in);
        
        if (estado == 1 || estado == 2) {
            Vermedicos();
            System.out.println("Introduzca el número del medico que quiere eliminar");
            int n_eleccion = lee.nextInt();

            while (n_eleccion > 99 && n_eleccion <= 0) {
                System.out.println("El numero no es valido, introduzcalo de nuevo");

            }
            eliminarMedico(medicos[n_eleccion]);
        } else {
            System.out.println("La base de datos esta vacia");
        }
    }

    public static void eliminarMedico(medico m) {
        int contador = -1;
    
        // Buscar el numero del objeto en el array
        for (int cont = 0; cont < contMedicos; cont++) {
            if (medicos[cont] == m) {
                contador = cont;
                break;
            }
        }
    // Mover los objetos que están después del objeto a eliminar una posición hacia abajo
        if (contador != -1) {
            
            for (int contador2 = contador; contador2 < contMedicos - 1; contador2++) {
                medicos[contador2] = medicos[contador2 + 1];
            }
    
            // Asignar null al último elemento del array y reducir contMedicos en uno
            medicos[contMedicos - 1] = null;
            contMedicos--;
        }
    }
    
    // Funcion que muestra uno por uno, los datos del objeto medico dentro del
    // arrays "Medicos"

    public static void Vermedicos() {
        int cont = 0;
        int estado = estado_array();
        if (estado == 1 || estado == 2) {
            while (medicos[cont] != null) {
                System.out.println("------------------");
                System.out.println("Medico: " + cont);
                System.out.println("DNI: " + medicos[cont].DNI);
                System.out.println("Nombre: " + medicos[cont].Nombre);
                System.out.println("Apellidos: " + medicos[cont].Apellidos);
                System.out.println("Especialización: " + medicos[cont].Especializacion);
                System.out.println(medicos[cont].paciente_posicion);
                System.out.println();
                cont++;
            }
        } else {
            System.out.println("No hay medicos que mostrar");
        }
    }

    // Funcion que permite modificar una variable del objeto "medico"
    public static void CambiarEspecialidad() {
        int estado = estado_array();
        if (estado == 1 || estado == 2) {
            Scanner lee = new Scanner(System.in);
            int n_medico;
            String info;

            Vermedicos();

            System.out.println("Indica a que medico quieres modificarle la especialidad");
            n_medico = lee.nextInt();
            System.out.println("Introduzca la nueva información");
            info = lee.next();
            medicos[n_medico].Especializacion = info;
            System.out.println("La nueva información se ha sobrescrito");
        } else {
            System.out.println("La base de datos esta vacia");
        }
    }

    public static void AsignarMedico(int n_paciente) {
        // -1 no esta bien
        Scanner lee = new Scanner(System.in);
        int estado = estado_array();
        if (estado == 1 || estado == 2) {
            Vermedicos();
            System.out.println("Indica que medico quieres asignar para un paciente");
            int medico = lee.nextInt();
            paciente.DatosPaciente();
            int paciente_elejido;
            do {
                paciente_elejido = n_paciente;
                if (paciente_elejido == -1) {
                    System.out.println("Introduzca un número valido");
                }
            } while (paciente_elejido == -1);
            medicos[medico].paciente_posicion = paciente_elejido;
        } else {
            System.out.println("No hay medicos en la base de datos");
        }
    }

    public static void medico_paciente() {
        int contador, cantidad = 0, estado = estado_array();
        if (estado != 0) {
            for (int cont = 0; cont < medicos.length; cont++) {
                if (medicos[cont] != null && medicos[cont].paciente_posicion != null) {
                    cantidad++;
                }
            }
            if (cantidad != 0) {
                for (contador = 0; contador < 100; contador++) {
                    if (medicos[contador] != null && medicos[contador].paciente_posicion != null) {
                        System.out.println("------------------");
                        System.out.println("DNI: " + medicos[contador].DNI);
                        System.out.println("Nombre: " + medicos[contador].Nombre);
                        System.out.println("Apellidos: " + medicos[contador].Apellidos);
                        System.out.println("Especialización: " + medicos[contador].Especializacion);
                        System.out.println();
                        System.out.println("Paciente asignado");
                        System.out.println("------------------");
                        System.out.println("SIP: " + paciente.pacientes[medicos[contador].paciente_posicion].getSIP());
                        System.out.println(
                                "Nombre: " + paciente.pacientes[medicos[contador].paciente_posicion].getNombre());
                        System.out.println(
                                "Dirección: " + paciente.pacientes[medicos[contador].paciente_posicion].getDireccion());
                        System.out.println();
                    }
                }
            } else {
                System.out.println("No hay medicos asignados");
            }
        } else {
            System.out.println("No hay medicos");
        }
    }    
}