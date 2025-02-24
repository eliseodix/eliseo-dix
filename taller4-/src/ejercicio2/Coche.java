
package ejercicio2;


public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;
    
    public Coche(String marca, String modelo, double velocidadMaxima){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadMaxima=velocidadMaxima;
        
        
    }
    public  String getMarca(String marca){
        return marca;
        
    }
    public String getModelo(String modelo){
        return modelo;
    }
    public double getvelocidadMaxima(double velocidadMaxima){
        return velocidadMaxima;
    }
    public void acelerar(double incremento){
        if (incremento > 0){
            this.velocidadMaxima += incremento;
            
        }else{
            throw new IllegalArgumentException("El invremento debe ser positivo");
    }
    
}
}