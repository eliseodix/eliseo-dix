
package ejercicio3;


public abstract class Error {
    
    
    public abstract void mirar();
    
    public class Gato extends Error { //Aunque el código compila, esta es una mala práctica 

        /**
         *
         */

    @Override
    public void mirar() {
        System.out.println("Miau miau!");
    }
    }}

    

