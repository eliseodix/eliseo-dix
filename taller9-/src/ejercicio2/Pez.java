/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Lenovo
 */
public class Pez implements Nadador, Respirador{
    private String nombre;

    public Pez(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void nadar(){
        System.out.println(nombre +  "-Esta nadando");
        
        
    }
    
    @Override
    public void respirar(){
        System.out.println(nombre + "-Esta respirando");
        
    }
    
    
}
