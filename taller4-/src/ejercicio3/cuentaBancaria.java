
package ejercicio3;


public class cuentaBancaria {
    

   private double saldo;
   
   public cuentaBancaria(double saldo){
       this.saldo=saldo;
       
   }
  public void Depositar(double cantidad){
      if(cantidad > 0){
       this.saldo += cantidad;
      }
      
  }
  public double resultado (){
      return saldo;
  }
    
}
   

