
package ejercicio2;


public abstract class Empleado {
    abstract double calcularSalario();
    
    
    public void mostrarDetalles(){
        double detalles = calcularSalario();
        System.out.println("detalles:"+ detalles);
        
        
    }
    
}
