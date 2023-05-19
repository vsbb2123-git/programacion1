package tienDAM;
import java.util.ArrayList;

public class Pedido 
{
    private String nombre;
    private double porcentDescuento;
    private double subTotal;
    private double precioFinal;
    private ArrayList<Integer> cantidadAComprar = new ArrayList();
    private ArrayList<Articulo> articulos = new ArrayList();
    private int maxArticulos;


    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    public double getPorcentDescuento() 
    {
        return porcentDescuento;
    }
    public void setPorcentDescuento(double porcentDescuento) 
    {
        this.porcentDescuento = porcentDescuento;
    }
    public double getSubTotal() 
    {
        return subTotal;
    }
    public void setSubTotal(double subTotal) 
    {
        this.subTotal = subTotal;
    }
    public double getPrecioFinal() 
    {
        return precioFinal;
    }
    public void setPrecioFinal(double precioFinal)
    {
        this.precioFinal = precioFinal;
    }
    public ArrayList<Integer> getCantidadAComprar() 
    {
        return cantidadAComprar;
    }
    public void setCantidadAComprar(ArrayList<Integer> cantidadAComprar) 
    {
        this.cantidadAComprar = cantidadAComprar;
    }
    public ArrayList<Articulo> getArticulos() 
    {
        return articulos;
    }
    public void setArticulos(ArrayList<Articulo> articulos) 
    {
        this.articulos = articulos;
    }
    public int getMaxArticulos() 
    {
        return maxArticulos;
    }
    public void setMaxArticulos(int maxArticulos) 
    {
        this.maxArticulos = maxArticulos;
    } 
}
