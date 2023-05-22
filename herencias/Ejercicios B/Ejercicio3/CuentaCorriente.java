public class CuentaCorriente 
{
    String titular;
    Double saldo;
    Double comisionOperacion;
    Double comisionMensual;
    Double interesMensual;

    protected CuentaCorriente(String t, Double s)
    {
        titular=t;
        saldo=s;
        comisionOperacion=1.0;
        comisionMensual=1.0;
        interesMensual=5.0;
    }

    public String getTitular() 
    {
        return titular;
    }
    public Double getSaldo() 
    {
        return saldo;
    }

    public void ingresar(double cant)
    {
        saldo=saldo+cant;
    }
    public boolean retirar(double cant)
    {
        if(cant>saldo)
        {
            System.out.println("no tiene saldo suficiente en su cuenta para hacer esta operación");
            return false;
        }
        else
        {
            System.out.println("operacion completada correctamente");
            return true;
        }
    }
    public void actualizarMensualidad ()
    {
        saldo=saldo+saldo*comisionMensual/100;
        saldo=saldo-interesMensual; 
    }
    
    public String toString()
    {
        return ("Tipo de cuenta: " + this.getClass().getSimpleName() + " Titular: " + getTitular() + " Saldo: " + getSaldo());
    }
}
