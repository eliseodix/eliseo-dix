/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Lenovo
 */
public class Incoerencia {
     interface nadador {
    void nadar();
}

// Clase que representa un coche
public class Carro implements nadador {
    // El coche no nada, pero implementa la interfaz Volador
    @Override
    public void nadar() {
        // Esta implementación no tiene sentido para un coche
        System.out.println("El carro esta nadando");
    }
}
    
}
