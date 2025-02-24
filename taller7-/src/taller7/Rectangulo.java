
package taller7;


public class Rectangulo extends Figura{
    private double ancho;
    private double alto;
    
    @Override
    double calcularArea(){
        return ancho * alto;
    }

    
}
