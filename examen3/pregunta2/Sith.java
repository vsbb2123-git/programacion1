package examen3.pregunta2;

public class Sith extends Maestro {

    public Sith(String nombre, int vida, int fuerza) {
        super(nombre, vida, fuerza);
    }

    @Override
    public String toString() {
        return "Sith: " + nombre + ". Vida: " + vida + ". Fuerza Oscura: " + fuerza;
    }

    @Override
    public void ataca(Maestro m) {
        if (this.vida <= 0) {
            System.out.println(this.nombre + " no puede atacar.");
        } else {
            System.out.println(this.nombre + " ataca a " + m.getNombre() + ". Le quita " + this.fuerza + " puntos de vida y 1 de fuerza.");
            m.setVida(m.getVida() - this.fuerza);
            m.setFuerza(m.getFuerza() - 1);
        }
    }
    
}
