
package ejercicio3;


public class pruebaCuenta {
    public static void main(String [] args){
        
        cuentaBancaria m = new cuentaBancaria(1000.0);
        System.out.println("salraio:" + m.resultado());
        
        m.Depositar(500.0);
        System.out.println("saldo despues de depositat:"  +m.resultado());
        
        //no sale error pero la falta de set y get no permiten modificar el saldo directamente
        //
    }
}
