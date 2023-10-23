package Modelo;

import java.util.Vector;


public class Helado {
    
    private String NombreP;
    private String Punto;
    private double Utilidad;
    private double Precio;
    private int Cantidad;

    public Helado() {
        
        this.NombreP = NombreP;
        this.Punto = Punto;
        this.Utilidad = Utilidad;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String NombreP) {
        this.NombreP = NombreP;
    }

    public String getPunto() {
        return Punto;
    }

    public void setPunto(String Punto) {
        this.Punto = Punto;
    }

    public double getUtilidad() {
        return Utilidad;
    }

    public void setUtilidad(double Utilidad) {
        this.Utilidad = Utilidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public float Totalpagar(){
    
        return (float) (Precio*Cantidad);
}
    public float Totalutil(){
        return (float) ((Precio*Cantidad)*Utilidad);
    }
    
    public void agregar(){
        ListaHelados.guardar(this);
    }
    
    public void eliminar(){
        ListaHelados.eliminar(0);
    }
    
    public Vector mostrar(){
        return ListaHelados.mostrar();
    }
    
}
