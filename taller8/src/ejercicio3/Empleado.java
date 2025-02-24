
package ejercicio3;


public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public void mostrarDetalles(){
        System.out.println("nombre: " +nombre);
        System.out.println("salario: "  +salario);
    }
    
}
