package tienDAM;
public class Articulo 
{
    private final String nombre;
    private double precio;
    private final double iva;
    private int cantidad;


    public Articulo(String nom, double precio, double IVA, int cant) ///constructor completo
    {
        nombre = nom;
        this.precio = precio;
        iva = IVA;
        cantidad = cant;
    }


    public String getNombre() ///getters
    {
        return nombre;
    }

    public double getPrecio()
    {
        return precio;
    }

    public double getIVA() 
    {
        return iva;
    }

    public int getCantidad() 
    {
        return cantidad;
    }


    public boolean setPrecio(double precio) ///setters con comprobación 
    {
        if(precio>0) 
        {
            this.precio = precio;
            return true;
        }
        else 
        {
            System.out.println("Error cambiando el precio, precio no puede ser igual o menor a 0");
            return false;
        }
    }
    public boolean aumentar(int cant) 
    {
        if(cant<=0) 
        {
            System.out.println("Error, no se puede aumentar la cantidad de un artículo con un numero negativo");
            return false;
        }
        else
        {
            cantidad=cantidad + cant;
            return true;
        }
        
    }
    public boolean disminuir(int cant) 
    {
        if(cant<=0) 
        {
            System.out.println("Error, no se puede disminuir la cantidad de un artículo con un numero negativo");
            return false;
        }
        else if(cantidad<cant)
        {
            System.out.println("Error, no disponemos de tantas unidades");
            return false;
        }
        else 
        {
            cantidad=cantidad - cant;
            return true;
        }
       
    }
    

    public String toString() ///método toString
    {
        return "El articulo: " + nombre + "   tiene un precio de: " + precio + "   tiene un IVA del: " + iva + "   y hay " + cantidad + " disponible(s)" ;
    }
}
