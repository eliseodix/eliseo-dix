
package ejercicio2;


public class Vendedor extends Empleado{
    private double salarioBase;
    private double comision;
    private double ventas;

    public Vendedor(double salarioBase, double comision, double ventas) {
        this.salarioBase=salarioBase;
        this.comision=comision;
        this.ventas= ventas;
    }
    
    
    
    @Override
    double calcularSalario(){
        return salarioBase + (comision * ventas);
        
    }
    
}
