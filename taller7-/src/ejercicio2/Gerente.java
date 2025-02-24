
package ejercicio2;


public class Gerente extends Empleado{
    private double salarioBase;
    private double bono;

    public Gerente(double salarioBase, double bono) {
        this.salarioBase=salarioBase;
        this.bono=bono;
    }
    
    
    
    @Override
    double calcularSalario(){
        return salarioBase + bono;
    }
    
}
