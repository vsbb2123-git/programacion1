package herencias;
public class punto 
{
    ///creamos las variables
    public double x;
    public double y;

    ///creamos el constructor
    public punto(double x,double y)
    {
        this.x=x;
        this.y=y;
    }

    public punto()
    {

    }

    ///getters
    public double getX()  
    {
        return x;
    }
    public double getY() 
    {
        return y;
    }

    ///setters
    public void setX(double x) 
    {
        this.x = x;
    }
    public void setY(double y) 
    {
        this.y = y;
    }

    ///metodos
    public double distanceToZero()
    {
        return Math.sqrt(this.x*this.x +this.y*this.y);
    }
    
    public double distanceToOther(punto other)
    {
        return Math.sqrt(this.x*other.x +this.y*other.y);
    }
    
    public String toString()
    {
        return "("+this.x+"."+this.y+")";
    }
}
