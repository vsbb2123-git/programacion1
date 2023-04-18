
public class Main 
{
    public static void main(String[] args) 
    {   
        Articulo a1 = new Articulo();
        
        a1.nombre = "pijama";
        a1.precio = 5;
        a1.iva = 21;
        a1.cuantosquedan = 8;
        System.out.println(a1.nombre+" - Precio: "+a1.precio+"€ - IVA: "+a1.iva+"% PVP: "+(a1.precio+a1.precio*a1.iva/100)+"€");
        
    }
}
