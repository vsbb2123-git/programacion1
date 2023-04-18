
public class Main 
{
    public static void main(String[] args) 
    {   
        Rectangulo r1 = new Rectangulo(0,5,0,5);
        Rectangulo r2 = new Rectangulo(7,9,2,3);
        if(r1.x1<r1.x2||r1.y1<r1.y2)
        {
            System.err.print("ERROR");
        }
        if(r2.x1<r2.x2||r2.y1<r2.y2)
        {
            System.err.print("ERROR");
        }
        int base1= r1.x2-r1.x1;
        int base2= r2.x2-r2.x1;
        int altura1= r1.y2-r1.y1;
        int altura2= r1.y2-r1.y1;
        int per1=(base1+altura1)*2;
        int per2=(base2+altura2)*2;
        int area1=base1*altura1;
        int area2=base2*altura2;
        System.out.println("las coordenadas del rectánculo 1 son: ("+r1.x1+","+r1.y1+")("+r1.x2+","+r1.y2+"), su perímetro es "+per1+" y su area es "+area1);
        System.out.println("las coordenadas del rectánculo 2 son: ("+r2.x1+","+r2.y1+")("+r2.x2+","+r2.y2+"), su perímetro es "+per2+" y su area es "+area2); 
    }
}
