
public class Triangulo extends Figura
{
    protected double altura;

    public Triangulo(double l,double a)
    {
        super(l);
        altura=a;
    }
    public double area()
    {
        return ((linea*altura)/2);
    }
}
