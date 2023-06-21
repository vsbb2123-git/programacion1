package examen3.pregunta2;

import examen3.pregunta2.Jedi;
import examen3.pregunta2.Maestro;
import examen3.pregunta2.Sith;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        // Parte A
        ArrayList<Maestro> maestros = new ArrayList<Maestro>();
        maestros.add(new Jedi("Yoda", 50, 10));
        maestros.add(new Jedi("Obi-Wan", 80, 7));
        maestros.add(new Sith("Vader", 100, 9));
        maestros.add(new Sith("Dooku", 70, 7));
        for (Maestro m : maestros){
            System.out.println(m);
        }

        System.out.println();

        // Parte B
        Maestro leon = new Jedi("LEON", 20, 7);
        Maestro zack = new Sith("ZACK", 20, 8);
        System.out.println(leon);
        System.out.println(zack);
        for(int i = 1; i <= 3; i++){
            System.out.println("\n### TURNO " + i);
            leon.ataca(zack);
            zack.ataca(leon);
            System.out.println(leon);
            System.out.println(zack);
        }

    }

}
