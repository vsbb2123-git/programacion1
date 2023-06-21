package herencias;

public class punto3D extends punto 
{
    ///creamos la nueva coordenada
    double z;

    ///creamos el constructor
    public punto3D(double x,double y, double z)
    {
        super(x,y);
        this.z=z;
    }

    ///getter y setter de z
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    ///metodos
    public double distanceToZero()
    {
        return Math.sqrt(this.x*super.x +super.y*super.y);
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
