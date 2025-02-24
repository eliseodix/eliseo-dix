
package ejercicio2;


public class Estudiante extends Persona{
    private String matricula;

    public Estudiante(String matricula, String nombre, int edad) {
        super(nombre, edad);
        this.matricula = matricula;
    }
    @Override
        public void mostrarDetalles(){
            super.mostrarDetalles();
            System.out.println("matricula::"+ matricula);
            
        }

    
    
}
