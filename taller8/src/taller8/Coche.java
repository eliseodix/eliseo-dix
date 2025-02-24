
package taller8;


public class Coche extends Vehiculo{
    private int numeroPruebas;

    public Coche(int numeroPruebas, double velocidadMaxima, String marca) {
        super(velocidadMaxima, marca);
        this.numeroPruebas = numeroPruebas;
    }
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("numero de pruebas::" +numeroPruebas);
        
    }
    
    
    
}
