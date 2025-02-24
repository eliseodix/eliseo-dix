
package taller;


public class Empleado {
    
    public String nombre;
    private double salario;
    
    public Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
        
    }
    public double getSalario(double salario){
        return salario;
    }
    public void setSalario(double salario){
        if(salario > 0){
            this.salario=salario;
            
        }
        throw new IllegalArgumentException("El salario no puede ser negativo");
        
    }
    
}
