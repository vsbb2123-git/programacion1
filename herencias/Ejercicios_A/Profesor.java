
public class Profesor extends Persona 
{
    String especialidad;
    double salario;
   
  
    public Profesor(String n, String a, String f, double s, String e) 
    {
        nombre = n;
        apellidos = a;
        fechaNacim = f;
        salario=s;
        especialidad=e;
    }

    public Profesor()
    {

    }
     
    public String toString()
    {
        return "Profesor: "+nombre+" "+apellidos+" "+fechaNacim+" "+salario+" "+especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
