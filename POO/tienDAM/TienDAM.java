package tienDAM;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.transform.Source;

import java.util.InputMismatchException;

public class TienDAM 
{
    private static Scanner lector = new Scanner(System.in);
    private static Almacen a = new Almacen(50);

    public static void menuTienDAM() 
    {
        int num = 1;
        while(num != 3) 
        {
            System.out.println("Bienvenido a TienDAM: "); ///Menú principal, te redirige al submenú que le pidas o sale del programa 
            System.out.println("Donde quiere acceder?");
            System.out.println("1- Almacen");
            System.out.println("2- Pedido");
            System.out.println("3- Salir");
            

            do{ ///do-while para comprobar que los datos introducidos son correctos 
                if(num>3 && num<1)
                {
                    System.out.println("Por favor, introduzca un numero entre 1 y 3");
                }
                try 
                {
                    num = lector.nextInt(); 
                } 
                catch (InputMismatchException e) 
                {
                    System.err.println("Por favor, Introduzca un numero entero");
                    lector.nextLine();
                }
            }while(!(num<=3 && num>=1));


            switch(num) 
            {
                case 1:
                    menuAlmacen();
                    break;
                case 2:
                    System.out.println("zona en desarrollo");
                    break;
                case 3:
                    System.out.println("Vuelva pronto!");
                    break;
            }
        }
    }

    public static void menuAlmacen()  
    {
        int num = 1;
        while(num != 8) 
        {
            System.out.println("Menú del almacen de TienDAM");///Submenú dedicado a funciones específicas del almacén
            System.out.println("Que quiere hacer?");
            System.out.println("1- Añadir un nuevo articulo");
            System.out.println("2- Ver todos los articulos");
            System.out.println("3- Buscar articulo");
            System.out.println("4- Modificar precio artículo");
            System.out.println("5- Recibir articulos");
            System.out.println("6- Devolver articulos");
            System.out.println("7- Borrar artículo");
            System.out.println("8- Volver al menu principal");
           
            do{
                if(num>8 && num<1)
                {
                    System.out.println("Por favor, introduzca un numero entre 1 y 8");
                }
                try 
                {
                    num = lector.nextInt(); 
                } 
                catch (InputMismatchException e) 
                {
                    System.err.println("Por favor, Introduzca un numero entero");
                    lector.nextLine();
                }
            }while(!(num<=8 && num>=1));


            switch (num) 
            {
                case 1:
                    añadirArticuloAlmacen();
                    break;
                case 2:
                    System.out.println(a.toString());
                    break;
                case 3:
                    buscarArticulos();
                    break;
                case 4:
                    modificarPrecio();
                    break;
                case 5:
                    recibirArticulo();
                    break;
                case 6:
                    devolverArticulo();
                    break;   
                case 7:
                    borrarArticulo();
                    break;            
            }
        }
    }


  public static void añadirArticuloAlmacen() ///añade un artículo al almacén si hay espacio suficiente
    {
        System.out.println("Introduzca el nombre del articulo");
        String nom = lector.next();
        lector.nextLine();

    
        System.out.println("Introduzca el precio del articulo");
        double p=2;
        do{
            if(p<0)
            {
                System.out.println("Por favor introduzca un precio correcto (mayor que 0)");
            }
            p = lector.nextDouble(); 

        }while (!(p>0));


        System.out.println("Introduzca el IVA del articulo");
        double iva=2;
        do{
            if(iva<0)
            {
                System.out.println("Por favor introduzca un iva correcto (mayor que 0)");
            }
            iva = lector.nextDouble();
        }while (!(iva>0));


        System.out.println("Introduzca la cantidad");
        int cant=1;
            do{
                if(cant<0)
                {
                    System.out.println("Por favor introduzca una cantidad correcta (mayor o igual que 0)");
                }
                try 
                {
                    cant=lector.nextInt(); 
                } 
                catch (InputMismatchException e) 
                {
                    System.err.println("Por favor, Introduzca un numero entero");
                    lector.nextLine();
                }
            }while(!(cant>=0));


        if(a.añadirArticulo(nom, p, iva, cant)) 
        {
            System.out.println("El artículo se ha añadido correctamente");
        }
        else 
        {
            System.out.println("Ha ocurrido un error al añadir el Artículo (no hay espacio disponible)");
        }
    }


    public static void buscarArticulos() ///dependiendo de la cantidad de artículos que hayan en articulosEncontrados, muestra o no los resultados
    {
        System.out.println("Introduzca el nombre del artículo a buscar");
        String nombre = lector.next();
        ArrayList<Articulo> articulosEncontrados = new ArrayList();
        articulosEncontrados = a.buscarArticulo(nombre);

        if(articulosEncontrados.size()==0)
        {
            System.out.println("No hay ningún artículo registrado que contenga '"+nombre+"' en su nombre");
            
        }
        if(articulosEncontrados.size()==1)
        {
            System.out.println(articulosEncontrados.get(0).toString());
        }
        if(articulosEncontrados.size()>1)
        {
            System.out.println("Hay "+articulosEncontrados.size()+" artículos que contienen '"+nombre+"':");

            for(int i=0; i<articulosEncontrados.size(); i++) 
            {
                System.out.println(articulosEncontrados.get(i).toString()); 
            }
        }
    }


    public static void modificarPrecio() ///funcion para modificar el precio de un artículo
    { 
        System.out.println( a.toString());
       
        System.out.println("Introduzca el Nº del articulo cuyo precio quiere modificar");
        int num = lector.nextInt();
        if(a.getArticulos().size()<num)
        {
            System.out.println("Ese número no corresponde a ninguno de los artículos");
        }
        else
        {
            System.out.println("Introduzca el nuevo precio de "+a.verArticulo(num).getNombre()+" por favor");
            Double p=lector.nextDouble();
            if(a.verArticulo(num).setPrecio(p))
            {
                System.out.println("Precio cambiado");
            }
        }
    }

    
    public static void recibirArticulo() ///funcion para actualizar la cantidad de artículos de un tipo, (solo aumenta)
    {
        System.out.println( a.toString());
        System.out.println("Introduzca el Nº del articulo del cual ha recibido una o mas unidades");
        int num = lector.nextInt();
        if(a.getArticulos().size()<num)
        {
            System.out.println("Ese número no corresponde a ninguno de los artículos");
        }
        else 
        {
            System.out.println("Introduzca la cantidad de " + a.verArticulo(num).getNombre() + " que ha recibido");
            int cant = lector.nextInt();
            if(a.recibir(num, cant)) 
            {
                System.out.println("La cantidad de " + a.verArticulo(num).getNombre() + " ha sido actualizada correctamente");
            }
        }

    }

    public static void devolverArticulo() 
    {
        System.out.println( a.toString());
        System.out.println("Introduzca el Nº del articulo del cual ha devuelto una o mas unidades");
        int num = lector.nextInt();
        if(a.getArticulos().size()<num)
        {
            System.out.println("Ese número no corresponde a ninguno de los artículos");
        }
        else 
        {
            System.out.println("Introduzca la cantidad de " + a.verArticulo(num).getNombre() + " que ha devuelto");
            int cant = lector.nextInt();
            if(a.devolver(num, cant)) 
            {
                System.out.println("La cantidad de " + a.verArticulo(num).getNombre() + " ha sido actualizada correctamente");
            }
        }
    }

    public static void borrarArticulo()
    {
        System.out.println( a.toString());
        System.out.println("Introduzca el Nº del articulo que quiere borrar");
        int num = lector.nextInt();
        if(a.getArticulos().size()<num)
        {
            System.out.println("Ese número no corresponde a ninguno de los artículos");
        }
        else 
        {
            System.out.println("Seguro que quiere borrar el artículo " + a.verArticulo(num).getNombre() + "?(escribe s para sí, cualquier otra cosa para no)");
            String comprobar = lector.next();
            if(comprobar.equals("s")) 
            {
                
                System.out.println("El objeto " + a.verArticulo(num).getNombre() + " ha sido borrado correctamente");
                a.quitarArticulo(num);
            }
            else
            {
                System.out.println("El artículo " + a.verArticulo(num).getNombre() + " NO ha sido borrado");
            }
        }
    }
    
    public static void main(String[] args) 
    {        
        menuTienDAM();
    }
}