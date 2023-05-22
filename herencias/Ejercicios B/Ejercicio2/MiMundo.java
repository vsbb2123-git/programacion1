public class MiMundo {
    public static void main(String[] args) 
    {
        Animal animal=new Animal();
        System.out.println(animal.toString());
        
        Pez pez=new Pez();
        System.out.println(pez.toString());
        
        PezPayaso pezpayaso=new PezPayaso();
        System.out.println(pezpayaso.toString());
       
        PezEspada pezespada=new PezEspada();
        System.out.println(pezespada.toString());
        
        Pajaro pajaro=new Pajaro();
        System.out.println(pajaro.toString());

        PajaroCarpintero pajarocarpintero=new PajaroCarpintero();
        System.out.println(pajarocarpintero.toString());

        Gallo gallo=new Gallo();
        System.out.println(gallo.toString());


    }
}