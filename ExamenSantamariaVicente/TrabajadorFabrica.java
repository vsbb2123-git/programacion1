package ExamenSantamariaVicente;

public class TrabajadorFabrica extends Trabajador
{
    protected int contadorHorasNocturnas;


    public TrabajadorFabrica(String nombre, int contadorHoras, int contadorHorasNocturnas)   
    {
        super(nombre,contadorHoras);
        this.contadorHorasNocturnas=contadorHorasNocturnas;
    }
    public TrabajadorFabrica(String nombre, int contadorHoras) 
    {
        super(nombre,contadorHoras);
        this.contadorHorasNocturnas=0;
    }
    public TrabajadorFabrica(String nombre) 
    {
        super(nombre);
        this.contadorHorasNocturnas=0;
        
    }


    public int getContadorHorasNocturnas() 
    {
        return contadorHorasNocturnas;
    }
   
    public void setContadorHorasNocturnas(int contadorHorasNocturnas) 
    {
        this.contadorHorasNocturnas = contadorHorasNocturnas;
    }
    

    @Override
    public double cobrarNomina() 
    {
        double dinero=this.contadorHoras*this.sueldobase+this.contadorHorasNocturnas*this.sueldoHorasNocturnas;
        this.contadorHoras=0;
        this.contadorHorasNocturnas=0;
        return dinero;
    }

    @Override
    public void trabajar(int horas) 
    {
        if(this.contadorHoras+this.contadorHorasNocturnas<this.maxHoras-horas)
        {
            this.contadorHoras=this.contadorHoras+horas;
        }
        else
        {
            System.out.println("Los trabajadores de la fabrica no pueden trabajar mas de 30 horas en una semana");
        }
    }    

    public void trabajarNoche(int horas) 
    {
        if(this.contadorHoras+this.contadorHorasNocturnas<this.maxHoras-horas)
        {
            this.contadorHorasNocturnas=this.contadorHorasNocturnas+horas;
        }
        else
        {
            System.out.println("Los trabajadores de la fabrica no pueden trabajar mas de 30 horas en total");
        }
    }    

    public String toString()
    {
        return ("Nombre del Trabajador: "+this.nombre+", lugar de trabajo: fabrica, horas trabajadas: "+this.contadorHoras+", horas trabajadas por la noche: "+this.contadorHorasNocturnas+", horas por trabajar hasta llegar al máximo: "+(this.maxHoras-this.contadorHoras-this.contadorHorasNocturnas));
    }
}
