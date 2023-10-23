
package Modelo;

import java.util.Vector;


public class ListaHelados {
    
    private static Vector datos = new Vector();
    
    public static void guardar(Object obj){
        datos.addElement(obj);
    }
    
    public static void eliminar(int pos){
        datos.removeElement(pos);
    }
    
    public static Vector mostrar(){
        return datos;
    }
}
