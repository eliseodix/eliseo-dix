
package taller;


public class Taller {

   //prueba salario
    public static void main(String[] args) {
        double salario=20.0;
        Empleado m = new Empleado("Eliseo", salario);
        
        System.out.println("nombre:" +m.nombre + "\nsalario:" +m.getSalario(salario));
      
    }
    
}
