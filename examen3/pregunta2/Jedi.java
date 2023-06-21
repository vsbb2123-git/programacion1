package examen3.pregunta2;

public class Jedi extends Maestro {

    public Jedi(String nombre, int vida, int fuerza) {
        super(nombre, vida, fuerza);
    }

    @Override
    public String toString() {
        return "Jedi: " + nombre + ". Vida: " + vida + ". Fuerza Luz: " + fuerza;
    }

    @Override
    public void ataca(Maestro m) {
        if (this.vida <= 0) {
            System.out.println(this.nombre + " no puede atacar.");
        }
        else if (this.vida < 10) {
            System.out.println(this.nombre + " ataca a " + m.getNombre() + ". Le quita " + (3 * this.fuerza) + " puntos de vida (daño triple).");
            m.setVida(m.getVida() - (3 * this.fuerza));
        } else {
            System.out.println(this.nombre + " ataca a " + m.getNombre() + ". Le quita " + this.fuerza + " puntos de vida.");
            m.setVida(m.getVida() - this.fuerza);
        }
    }
    
}
