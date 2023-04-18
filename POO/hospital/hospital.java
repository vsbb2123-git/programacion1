import java.util.Scanner;

public class hospital {
    public static int menu() {
        Scanner lee = new Scanner(System.in);
        int opcion;
        System.out.println(" ------------------------------------------");
        System.out.println("| Bienvienido al Hopital Snüsk              |");
        System.out.println(" ------------------------------------------");
        System.out.println("| 1. Dar de alta a un paciente             |");
        System.out.println("| 2. Dar de baja a un paciente             |");
        System.out.println("| 3. Ver datos de los pacientes            |");
        System.out.println("| 4. Buscar paciente                       |");
        System.out.println("| 5. Tratar paciente                       |");
        System.out.println("| 6. Ver pacientes tratados                |");
        System.out.println("| 7. Enviar paciente a cuidados especiales |");
        System.out.println("| 8. Ver Cuidados especiales               |");
        System.out.println("| 9. Añadir medico                         |");
        System.out.println("| 10. Despedir medico                      |");
        System.out.println("| 11. Asignar medico a un paciente         |");
        System.out.println("| 12. Cambiar Especialidad de un medico    |");
        System.out.println("| 13. Ver medicos                          |");
        System.out.println("| 14. Ver los pacientes asignados          |");
        System.out.println("| 0. Salir                                 |");
        System.out.println(" ------------------------------------------");
        opcion = lee.nextInt();
        return opcion;
    }

    public static int funcion(int numero) {
        switch (numero) {
            case 1:
                paciente.altapaciente();
                break;
            case 2:
                paciente.Bajapaciente();
                break;
            case 3:
                paciente.DatosPaciente();
                break;
            case 4:
                paciente.BuscarPaciente();
                break;
            case 5:
                paciente.TratarPaciente();
                break;
            case 6:
                paciente.VerTratados();
                break;
            case 7:
                paciente.CuidadosEspeciales();
                break;
            case 8:
                paciente.VerCuidadosEspeciales();
                break;
            case 9:
                medico.AddMedico();
                break;
            case 10:
                medico.DespedirMedico();
                break;
            case 11:
            {
                paciente.DatosPaciente();
                medico.AsignarMedico(paciente.asignado());
            }
                
                break;
            case 12:
                medico.CambiarEspecialidad();
                break;
            case 13:
                medico.Vermedicos();
                break;
            case 14:
                medico.medico_paciente();
                break;
            case 0:
                System.out.println("Gracias por usar nuestro servicios");
            default:
                System.out.println("Introduzca un numero válido");
        }
        return numero;
    }

    public static void main(String[] args) {
        int numero;
        do {
            numero = menu();
            funcion(numero);
        } while (numero != 0);

    }
}