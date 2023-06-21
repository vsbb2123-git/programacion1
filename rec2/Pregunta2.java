import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Pregunta2 {
    
    public static void main(String[] args) {
        
        // Parte 1. Pedir N y crear tablero
        Scanner in = new Scanner(System.in);
        System.out.print("N? ");
        int n = in.nextInt();
        int[][] t = new int[n][n];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = 1 + (int)(Math.random() * 2);
            }
        }

        // Parte 2. Mostrar tablero
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        // Parte 3. Imprimir quién ha ganado la partida
        int uno = 0;
        int dos = 0;

        // Comprobamos filas
        for (int i = 0; i < t.length; i++) {
            int suma = 0;
            for (int j = 0; j < t[i].length; j++) {
                suma += t[i][j];
            }
            if (suma == n)
                uno++;
            else if (suma == (2*n))
                dos++;
        }

        // Comprobamos columnas
        for (int i = 0; i < t.length; i++) {
            int suma = 0;
            for (int j = 0; j < t[i].length; j++) {
                suma += t[j][i];
            }
            if (suma == n)
                uno++;
            else if (suma == (2*n))
                dos++;
        }

        // Comprobamos diagonales
        int sumad1 = 0;
        int sumad2 = 0;
        for (int i = 0; i < t.length; i++) {
            sumad1 += t[i][i];
            sumad2 += t[i][t.length - 1 - i];
        }
        if (sumad1 == n)
            uno++;
        else if (sumad1 == (2*n))
            dos++;
        if (sumad2 == n)
            uno++;
        else if (sumad2 == (2*n))
            dos++;

        // Ganador
        System.out.println("Uno: " + uno);
        System.out.println("Dos: " + dos);
        if (uno > 0 && dos == 0)
            System.out.println("UNO");
        else if (uno == 0 && dos > 0)
            System.out.println("DOS");
        else
            System.out.println("EMPATE");
    }

}
