
package ejercicio3;



public class Ejemplo {
    public int atributoNoEstatico=10;
    
    public static void atributoEstatico(){
        Ejemplo p = new Ejemplo();
        p.atributoNoEstatico=20;
        System.out.println("es.." +p.atributoNoEstatico);
    //    atributoNoEstatico=20;
    //intento modificar un atrivuto no estico
    }
    public static void main(String [] args){
        atributoEstatico();
    }
    //la forma correcta de acceder es por medio de una instancia
}
