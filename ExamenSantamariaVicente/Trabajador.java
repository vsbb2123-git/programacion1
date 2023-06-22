package ExamenSantamariaVicente;

public abstract class Trabajador 
{   
    protected String nombre;
    protected int contadorHoras;
    protected  final int sueldobase=10;
    protected final int sueldoHorasNocturnas=20;
    protected int maxHoras;
    protected int minHoras;
        
    public Trabajador(String nombre, int contadorHoras) 
    {
        this.nombre = nombre;
        this.contadorHoras=contadorHoras;
        this.maxHoras=30;
        this.minHoras=0;
    }
    public Trabajador(String nombre) 
    {
        this.nombre = nombre;
        this.contadorHoras=0;
        this.maxHoras=30;
        this.minHoras=0;
    }

    public String getNombre() {
        return nombre;
    }
    public int getContadorHoras() {
        return contadorHoras;
    }
    public int getSueldobase() {
        return sueldobase;
    }
    public int getSueldoHorasNocturnas() 
    {
        return sueldoHorasNocturnas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setContadorHoras(int contadorHoras) {
        this.contadorHoras = contadorHoras;
    }
    

    public abstract void trabajar(int horas);
    public abstract double cobrarNomina();
    
    
}
