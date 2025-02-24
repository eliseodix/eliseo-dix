
package ejercicio2;


public class cuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    public String tipoCuenta;
    
    public cuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
        this.tipoCuenta=tipoCuenta;
        
    }
    public double getSaldo(double saldo){
        return saldo;
    }
    public void setSaldo(double saldo){
        if(saldo >0){
            this.saldo=saldo;
        }
        throw new IllegalArgumentException("El saldo no puede ser negativo");
    }
}
