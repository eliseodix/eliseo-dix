
package taller8;


public class Vehiculo {
    private double velocidadMaxima;
    private String marca;

    public Vehiculo(double velocidadMaxima, String marca) {
        this.velocidadMaxima = velocidadMaxima;
        this.marca = marca;
        
    }
    public void mostrarDetalles(){
        System.out.println("velocidad maxima::" + velocidadMaxima); 
        System.out.println("marca::" + marca);
        
    }
    
    
    
}
