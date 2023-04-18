import java.util.Scanner;
/*Vicente Santamaría Botella*/
public class Programa1 
    {
    public static void main (String[] args)
    {
        Scanner lector = new Scanner(System.in);
        System.out.println("escriba el numero de módulos que el alumno ha cursado");
        int nummax=lector.nextInt();
        int[] numeros = new int[nummax];
        String[] texto = new String[nummax+2];
        int contxt=2;
        int aprobados=0;
        int suspendidos=0;
        String cero="NO";
        String diez="NO";
        double media=0;
        int contnum=0;
        System.out.println("Escriba el nombre y los apellidos del alumno");
        texto[0]=lector.next();
        lector.nextLine();
        System.out.println("Escriba la fecha de nacimiento del alumno en formato dd/mm/aaaa  ");
        texto[1]=lector.next();
        lector.nextLine();
        while (contnum<nummax)
        {
            System.out.println("escriba el nombre del módulo");
            texto[contxt]=lector.next();
            System.out.println("escriba la nota del módulo");
            numeros[contnum]=lector.nextInt();
            while(numeros[contnum]<0||numeros[contnum]>10)
            {
                System.out.println("escriba una nota correcta");
                numeros[contnum]=lector.nextInt();
            }
            if(numeros[contnum]==10)
            {
                diez="SI";
            }
            if(numeros[contnum]==0)
            {
                cero="SI";
            }
            if(numeros[contnum]<5)
            {
                suspendidos++;
            }
            if(numeros[contnum]>=5)
            {
                aprobados++;
            }
            media+=numeros[contnum];
            contnum++;
            contxt++;
        }
        media=media/nummax;
        contnum=0;
        contxt=2;

        System.out.println("BOLETIN DE NOTAS");
        System.out.println("Alumna/o: "+ texto[0]);//aqui me falta el código cliente
        System.out.println("------------------------------");
        while(contnum<nummax)
        {
            System.out.println(texto[contxt]+ ":     "+ numeros[contnum]);
            contnum++;
            contxt++;
        }
        System.out.println("------------------------------");
        System.out.println("Nota Media:      "+media);
        System.out.println("Aprobados:       "+aprobados);
        System.out.println("Suspendidos:     "+suspendidos);
        System.out.println("¿Algún 10?:      "+diez);
        System.out.println("¿Algún 0?:       "+cero);
    }   
}
