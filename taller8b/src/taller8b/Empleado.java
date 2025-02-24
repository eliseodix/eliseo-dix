
package taller8b;


public class Empleado extends Persona{
    private String departamento;

    public Empleado(String departamento, String nombre, int edad) {
        super(nombre, edad);
        this.departamento = departamento;
    }
    
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("departamento:" +departamento);
        
        
    }

    
}
