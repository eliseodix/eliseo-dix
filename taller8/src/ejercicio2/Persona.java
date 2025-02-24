
package ejercicio2;


public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDetalles(){
        System.out.println("nombre:" + nombre);
        System.out.println("edad:"+ edad);
    }
    
    
}
