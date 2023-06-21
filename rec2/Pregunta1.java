package solucion;

import java.util.ArrayList;
import java.util.Arrays;

public class Pregunta1 {

    public static void main(String[] args) {

        //LIO TESTS A
        System.out.println("*** INICIO TESTS A");
        System.out.println(media(new int[] {0}));
        System.out.println(media(new int[] {-1,2}));
        System.out.println(media(new int[] {1,2,3}));
        System.out.println(media(new int[] {1,2,7}));
        System.out.println(media(new int[] {10,20,30}));
        System.out.println(media(new int[] {11,21,31}));
        System.out.println(media(new int[] {-1,10,100}));
        System.out.println("*** FIN TESTS A");

        //LIO TESTS B
        System.out.println("*** INICIO TESTS B");
        int[] vb1 = {0};
        insertar(vb1, 0, 100);
        printVector(vb1);
        int[] vb2 = {1,2,3,4};
        printVector(vb2);
        insertar(vb2, 0, -1);
        printVector(vb2);
        insertar(vb2, 1, -1);
        printVector(vb2);
        insertar(vb2, 2, -1);
        printVector(vb2);
        insertar(vb2, 3, -1);
        printVector(vb2);
        System.out.println("*** FIN TESTS B");

        //LIO TESTS C
        System.out.println("*** INICIO TESTS C");
        printVector(secuencia(0,1));
        printVector(secuencia(1,5));
        printVector(secuencia(-5,10));
        printVector(secuencia(0,0));
        System.out.println("*** FIN TESTS C");

        //LIO TESTS D
        System.out.println("*** INICIO TESTS D");
        System.out.println(totalTicket(new double[] {0.0,0.0}));
        System.out.println(totalTicket(new double[] {1.0,0.05}));
        System.out.println(totalTicket(new double[] {1.0,10,2,5.25}));
        System.out.println(totalTicket(new double[] {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,0.001}));
        System.out.println("*** FIN TESTS D");

        //LIO TESTS E
        System.out.println("*** INICIO TESTS E");
        System.out.print("TRUE: ");
        System.out.print(esCapicua(new int[] {0,0}) + " ");
        System.out.print(esCapicua(new int[] {1,1}) + " ");
        System.out.print(esCapicua(new int[] {2,1,2}) + " ");
        System.out.print(esCapicua(new int[] {1,9,9,1}) + " ");
        System.out.print(esCapicua(new int[] {2,2,0,2,2}) + " ");
        System.out.print(esCapicua(new int[] {-1000,2,0,2,-1000}) + " ");
        System.out.print(esCapicua(new int[] {0}) + " ");
        System.out.print(esCapicua(new int[] {1}) + " ");
        System.out.print(esCapicua(new int[] {7}) + " ");
        System.out.println();
        System.out.print("FALSE: ");
        System.out.print(esCapicua(new int[] {0,1}) + " ");
        System.out.print(esCapicua(new int[] {1,3}) + " ");
        System.out.print(esCapicua(new int[] {1,2,3}) + " ");
        System.out.print(esCapicua(new int[] {9,3,3,8}) + " ");
        System.out.print(esCapicua(new int[] {9,3,-100,3,8}) + " ");
        System.out.print(esCapicua(new int[] {9,3,0,-3,9}) + " ");
        System.out.println();
        System.out.println("*** FIN TESTS E");

        //LIO TESTS F
        System.out.println("*** INICIO TESTS F");
        int[] vf;
        int cuantos = 0;
        for (int i = 1; i <= 100; i++) {
            vf = creaVectorRandom(i);
            if (compruebaVectorRandom(vf) == true)
                cuantos++;
        }
        System.out.println("Vectores Random OK: " + cuantos);
        System.out.println("*** FIN TESTS F");

        //LIO TESTS G
        System.out.println("*** INICIO TESTS G");
        ArrayList<String> frases = new ArrayList();
        frases.add("Hola que tal");
        frases.add("Hola, que, tal");
        frases.add("Hola,que,tal");
        frases.add("Hola ,.que., tal");
        frases.add("Hola. , .,.que., .,, tal");
        frases.add("Pipipi");
        frases.add("    Pi pi pi pi ri pi pi xu    ");
        frases.add("Parece dificil, pero tú puedes. Venga");
        frases.add("");
        for(String palabra : frases){
            System.out.println(palabra + " => " + getIniciales(palabra));
        }
        System.out.println("*** FIN TESTS G");

    }

    //LIO FUNCIÓN NECESARIA PARA LOS TESTS
    static void printVector(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ",");
        }
        System.out.println("]");
    }

    //LIO FUNCIÓN NECESARIA PARA LOS TESTS
    static boolean compruebaVectorRandom(int[] v){
        Arrays.sort(v);
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] == v[i+1])
                return false;
        }
        return true;
    }

    // PREGUNTA A
    static double media(int[] v) {
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            suma += v[i];
        }
        return (double)suma / v.length;
    }

    // PREGUNTA B
    static void insertar(int[] v, int p, int x) {
        // desplazamos
        for (int i = v.length - 1; i > p; i--) {
            v[i] = v[i-1];
        }
        v[p] = x;
    }

    // PREGUNTA C
    static int[] secuencia(int a, int b) {
        int[] v = new int[b - a + 1];
        for (int i = 0; i < v.length; i++) {
            v[i] = a;
            a++;
        }
        return v;
    }

    // PREGUNTA D
    static double totalTicket(double[] v) {
        double total = 0;
        for (int i = 0; i < v.length; i=i+2) {
            total += (v[i] * v[i+1]);
        }
        return total;
    }

    // PREGUNTA E
    static boolean esCapicua(int[] v) {
        for (int i = 0; i < v.length/2; i++) {
            if (v[i] != v[v.length - i - 1])
                return false;
        }
        return true;
    }

    // PREGUNTA F
    static int[] creaVectorRandom(int n) {
        int[] v = new int[n];
        // Para cada posición i del vector v
        for (int i = 0; i < v.length; i++) {
            // Creamos un valor aleatorio, una y otra vez, hasta que sea uno que no exista ya en v
            int random;
            boolean repetir;
            do {
                repetir = false;
                // Valor aleatorio
                random = 1 + (int)(Math.random() * 100);
                // Si random existe en v hay que repetir
                for (int j = 0; j <= i; j++) {
                    if (v[j] == random) {
                        repetir = true;
                        break;
                    }
                }
            } while (repetir);
            v[i] = random;
        }
        return v;
    }

    // PREGUNTA F (otra forma de hacerlo)
    static int[] creaVectorRandom2(int n){
        // Creamos vector de tamaño n donde irán los números aleatorios
        int[] v = new int[n];
        // Creamos una lista con los números del 1 al 100
        ArrayList<Integer> numeros = new ArrayList();
        for (int i = 1; i <= 100; i++) {
            numeros.add(i);
        }
        // Sacamos n números aleatorios de la lista y los metemos en el vector
        for (int i = 0; i < v.length; i++) {
            int rand = (int)(Math.random() * numeros.size());
            v[i] = numeros.get(rand);
            numeros.remove(rand);
        }

        return v;
    }

    // PREGUNTA G
    static String getIniciales(String s) {
        s = s.replace(",", " ").replace(".", " ").toUpperCase();
        String[] palabras = s.split(" ");
        String iniciales = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > 0)
                iniciales += palabras[i].charAt(0);
        }
        return iniciales;

    }
    


}
