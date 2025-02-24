
package taller4;

import javax.swing.JOptionPane;


public class Taller4 {
     //Orueba de Estudiante 
    public static void main(String[] args) {
        
        try{
              String nombre=JOptionPane.showInputDialog("Ingresa el nombre ");
               int edad=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad"));
               double notaPromedio=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota promedio"));
                Estudiante m=new Estudiante(nombre, edad, notaPromedio);
                System.out.println("Nombre:" + m.getNombre(nombre));
                System.out.println("Edad:" +m.getEdad(edad));
                System.out.println("nota promedio:" +m.getNotaPromedio(notaPromedio));
        
               m.setEdad(m.getEdad(edad));
               m.setNombre(m.getNombre(nombre));
               m.setNotaPromedio(m.getNotaPromedio(notaPromedio));
              }catch (IllegalArgumentException n) {
                System.out.println("Error- "+n.getMessage());  
               JOptionPane.showMessageDialog(null, "Error-"  +n.getMessage());
          
         }
        
      
    }
    
}
