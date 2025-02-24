
package taller6;


public class Coche {
    private String marca;
    private String modelo;
      static int contadorCoche = 0;
    
    public Coche(int contador){
        contadorCoche++;
    }
    public String getMarca(String marca){
        return marca;
    }
    public String getTipo(String tipo){
        return tipo;
    }
    
    public static void mostrarCoches(){
        System.out.println("numeros de choches"+contadorCoche );
        
    }
    
}
