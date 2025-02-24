
package taller7;


public abstract class Figura {
    abstract double calcularArea();
    
   
    
    public void moastrarArea(){
        double area =calcularArea();
        System.out.println("area:."+area);
    }
    
    
}
