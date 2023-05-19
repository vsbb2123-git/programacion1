package MayorPruebas;
public class MayorPruebas {
    public static int mayorA(int lista[]) {
        int indice, max = Integer.MAX_VALUE;
        for (indice = 0; indice < lista.length - 1; indice++) {
            if (lista[indice] > max) {
                max = lista[indice];
            }
        }
        return max;
    }

    public static int mayorB(int lista[]) {
        int indice, max = Integer.MIN_VALUE;
        for (indice = 0; indice < lista.length; indice++) {
            if (lista[indice] > max) {
                max = lista[indice];
            }
        }
        return max;
    }
}
