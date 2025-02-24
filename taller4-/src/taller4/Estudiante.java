
package taller4;


public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;
    
    public Estudiante(String nombre, int edad, double notaPromedio){
        this.nombre=nombre;
        this.edad=edad;
        this.notaPromedio=notaPromedio;
        
    }
    public String getNombre(String nombre){
        
        return nombre;
        
        
    }
    public void setNombre(String nombre){
        if(nombre !=null && !nombre.trim().isEmpty()){
            this.nombre=nombre;
        }else{
            throw new IllegalArgumentException("Nombre no puede estar en blanco");
                    
       
        }
    }
    public int getEdad(int edad){
        return edad;
    }
    
    public void setEdad(int edad){
        if(edad>=0){
            this.edad=edad;
        } else{
            throw new IllegalArgumentException("La edad no puede ser negativa");
            
        } 
        
    }
    public double getNotaPromedio(double notaPromedio){
            return notaPromedio;
        }
    public void setNotaPromedio(double notaPromedio){
         if (notaPromedio >=0.0 && notaPromedio <=5.0){
            this.notaPromedio=notaPromedio;
        }else{
             throw new IllegalArgumentException(   "la nota promedio debe estar entre 0.0 y 5.0");
         }
    }
   
    
}
