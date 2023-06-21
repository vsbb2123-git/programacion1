package examen3.pregunta2;

public abstract class Maestro {
    
    protected String nombre;
    protected int vida;
    protected int fuerza;

    public Maestro(String nombre, int vida, int fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    public abstract String toString();

    public abstract void ataca(Maestro m);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

}
