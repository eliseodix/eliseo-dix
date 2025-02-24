
package taller10;


public class Ave implements Volador, Cantante{
     private String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }
     
     
 
    @Override
    public void cantar(){
        System.out.println(nombre+ "-Esta cantando");
        
    }
     @Override
    public void volar(){
         System.out.println(nombre+  "-Esta volando");
        
    }
    

 }
    

