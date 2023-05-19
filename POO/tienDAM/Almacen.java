package tienDAM;
import java.util.ArrayList;

public class Almacen 
{
    private ArrayList<Articulo> articulos;
    private final int maxArticulos;


    public Almacen(int max)
    {
        maxArticulos = max;
        articulos = new ArrayList();
    }

    public ArrayList<Articulo> getArticulos() ///getter del arrayList
    {
        return articulos;
    } 

    public Articulo verArticulo(int indice) ///getter del artículo en la posición indice del arrayList
    {
        return articulos.get(indice);
    }

    public boolean añadirArticulo(Articulo a) ///intenta meter el artículo creado en añadirArticulo(nom p iva cant) en el arrayList, si puede, devuelve true, si no, devuelve false 
    {
        boolean resultado;
        if(articulos.size()<maxArticulos) 
        {
            articulos.add(a);
            resultado = true;
        }
        else
        {
            resultado=false;
        }
        return resultado;
    }

    public boolean añadirArticulo(String nom,double p, double iva, int cant) ///crea un artículo y devuelve una llamada a añadirArticulo(a)
    {
        Articulo a = new Articulo(nom, p, iva, cant);
        return añadirArticulo(a);
    }
    
    public boolean quitarArticulo(int indice) ///borra el artículo en la posición indice del arrayList
    {
        boolean resultado;
        if(indice>=0 && articulos.size()>=indice) 
        {
            articulos.remove(indice);
            resultado=true;
        }
        else 
        {
            resultado=false;
        }
        return resultado;
    }

    public boolean modificarPrecio(int indice, double p) 
    {
        return articulos.get(indice).setPrecio(p);
    }

    public ArrayList<Articulo> buscarArticulo(String cad) ///devuelve un arrayList con todos los artículos con la cadena de texto cad en ellos
    {
        ArrayList<Articulo> articulosEncontrados= new ArrayList();
        for(int i=0; i<articulos.size(); i++) 
        {
            if(articulos.get(i).getNombre().contains(cad)) 
            {
                articulosEncontrados.add(articulos.get(i));
            }
        }
        return articulosEncontrados;
    }

    public boolean recibir(int indice, int cant) ///se recibe nuevo stock de un Artículo en el almacén (se aumenta la cantidad del artículo en la posicion indice en la cantidad cant)
    {
        return articulos.get(indice).aumentar(cant);
    }

    public boolean devolver(int indice, int cant) ///se devuelve parte del stock de un Artículo del almacén (disminuye la cantidad del artículo en la posicion indice en la cantidad cant)
    {
        return articulos.get(indice).disminuir(cant);
    }

    public String toString()
    {
        String cad=" "; ///devuelve una cadena de texto con todos los artículos
        for (int i=0; i<articulos.size(); i++) 
        {
            cad =cad +"--Artículo Nº "+ i + ": " + articulos.get(i).toString()+"   ";
        }
        return cad;
    }
}
