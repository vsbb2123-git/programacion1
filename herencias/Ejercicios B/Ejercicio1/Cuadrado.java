
public class Cuadrado extends Figura
{
    protected double area;

    public Cuadrado(double l)
    {
        super(l);
    }
    public double area()
    {
        return (linea*linea);
    }
}