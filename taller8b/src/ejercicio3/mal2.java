/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Lenovo
 */
public class mal2 extends mal{
   

    public mal2( String nombre) {
        super(nombre);
     
       
    }
    @Override
        public void moss(){
            super.moss();//es un uso incorrecto ya que noo se esta sobre escribiendo nada ni modifica
            System.out.println("nombres de animal");
        }

    
    
    
    
}
