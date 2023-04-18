
public class Main 
{
    public static void main(String[] args) 
    {   
        punto p1 = new punto(0,5);
        punto p2 = new punto(10,10);
        punto p3 = new punto(-3,7);

        System.out.println("Coordenadas del punto p1 (" + p1.x + "," + p1.y + ")");
        System.out.println("Coordenadas del punto p2 (" + p2.x + "," + p2.y + ")");
        System.out.println("Coordenadas del punto p3 (" + p3.x + "," + p3.y + ")");

        p1.x += 3;
        p1.y = 6;

        p2.x /= 2;
        p2.y *= 2;

        p3.x -= 5;
        p3.y %= 2;

        System.out.println("Nuevas coordenadas del punto p1 (" + p1.x + "," + p1.y + ")");
        System.out.println("Nuevas coordenadas del punto p2 (" + p2.x + "," + p2.y + ")");
        System.out.println("Nuevas coordenadas del punto p3 (" + p3.x + "," + p3.y + ")");
    }
}
