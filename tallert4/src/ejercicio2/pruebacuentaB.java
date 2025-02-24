
package ejercicio2;


public class pruebacuentaB {
    public static void main(String [] args){
        double salario= 100.0;
        String tipoCuenta="corriente";
        cuentaBancaria C = new cuentaBancaria(0, salario, tipoCuenta);
     //   C.numeroCuenta=123456;
        System.out.println("salario:"+C.getSaldo(salario));
        System.out.println("nombre de cuenta:"+C.tipoCuenta);
    //    System.out.println("numero de la cuenta"+ C.numeroCuenta);
        //otra vez al momento de llamar una clase privada directamente 
        // no es posible acceder a ella solo marcara error y no te aparecera
    }
    
}
