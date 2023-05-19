public class Alumno extends Persona 
{
    protected String grupo;
    protected String horario;
    
    public Alumno(String n, String a, String f, String g, String h) 
    {
        nombre = n;
        apellidos = a;
        fechaNacim = f;
        grupo=g;
        horario=h;
    }

    public Alumno()
    {

    }

    public String toString()
    {
        return "Alumno: "+nombre+" "+apellidos+" "+fechaNacim+" "+grupo+" "+horario;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
