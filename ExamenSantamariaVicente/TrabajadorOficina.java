package ExamenSantamariaVicente;

public class TrabajadorOficina extends Trabajador
{
    public TrabajadorOficina(String nombre, int contadorHoras) 
    {
        super(nombre,contadorHoras);
        this.minHoras=20;
        this.maxHoras=40;
    }
    public TrabajadorOficina(String nombre) 
    {
        super(nombre);
        this.minHoras=20;
        this.maxHoras=40;
    }
 

    @Override
    public double cobrarNomina() 
    {

        double dinero;
        if(this.contadorHoras<this.minHoras)
        {
           dinero=this.contadorHoras*this.sueldobase*0.75;
        }
        else
        {
            dinero=this.contadorHoras*this.sueldobase;
        }
        this.contadorHoras=0;
        return dinero;
    }

    @Override
    public void trabajar(int horas) 
    {
        if(this.contadorHoras<this.maxHoras-horas)
        {
            this.contadorHoras=this.contadorHoras+horas;
        }
        else
        {
            System.out.println("Los trabajadores de la oficina no pueden trabajar mas de 40 horas en una semana");
        }
    }    
    public String toString()
    {
        return ("Nombre del Trabajador: "+this.nombre+", lugar de trabajo: oficina, horas trabajadas: "+this.contadorHoras+", horas por trabajar hasta llegar al máximo: "+(this.maxHoras-this.contadorHoras));
    }
}