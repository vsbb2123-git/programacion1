public class Ejercicio3
{

    public static void main(String[] args) 
    {
        {
           int numa=0, numb=1, cambiador, cont=1;
           while (cont<=40)
           {
            System.out.println(numa);
            cambiador=numb;
            numb=numa+numb;
            numa=cambiador;
            cont++;
           }
        }
    }
}