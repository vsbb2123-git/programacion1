package ExamenSantamariaVicente;

public class Pregunta1 
{
    public static void main(String[] args)
    {
        invertirVector(new int[] {1,2,7,5,5});
        System.out.println(contarOcurrenciasPalabra("la casa es grande, la casa es bonita y la casa es preciosa casa casa", "casa"));
        maximosColumnasMatriz(new int[][]{{1,5,3},{4,9,2}});
        subArray(new int[] {1,2,7,5,5}, new int[] {1,0,4,2,0});
    }
    static int sumaPares(int[] v)
    {
        int suma = 0;
        for (int i = 0; i < v.length; i++) 
        {
            if(v[i]%2==0)
            {
                suma=suma+v[i];
            }
        }
        return suma;
    }

    static boolean esAscendente(int[] v)
    {
        int ultimo = v[0];
        for (int i = 1; i < v.length; i++) 
        {
            if(v[i]>ultimo)
            {
                ultimo=v[i];
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    
    static void invertirVector(int[] v)
    {
        int cambiaUltimo;
        int cambiaPrimero;
        for (int i = 0; i < v.length/2; i++) 
        {
            cambiaPrimero=v[i];
            cambiaUltimo=v[v.length-1-i];
            v[i]=cambiaUltimo;
            v[v.length-1-i]=cambiaPrimero;
        }
        /// esto es para la prueba del main
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);
        System.out.println(v[3]);
        System.out.println(v[4]);
    }

    static int[] subArray(int[] v, int[] p)
    {
        int[] d = new int[p.length];
        for (int i = 0; i < d.length; i++) 
        {
            d[i]=v[p[i]];
        }
        /// esto es para la prueba del main
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(d[3]);
        System.out.println(d[4]);
        return d;
    }

    static int contarOcurrenciasPalabra(String frase, String palabra)
    {   
        int contador = 0;
        int ultimaContada=0;
        boolean fin=false;
        while(fin==false)
        {
            if(ultimaContada<frase.lastIndexOf(palabra))
            {
                ultimaContada=frase.indexOf(palabra, ultimaContada)+palabra.length();
                contador++;
            }
            else
            {
                fin=true;
            }
        }
        return contador;
    }
    
    static int[] maximosColumnasMatriz(int[][] m)
    {
        int[] d = new int[m[0].length];
        for (int i = 0; i < d.length; i++) 
        {
            if(m[0][i]<m[1][i])
            {
                d[i]=m[1][i];
            }
            else 
            {
                d[i]=m[0][i];
            }
        }
        /// esto es para la prueba del main
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        return d;
    }
}
