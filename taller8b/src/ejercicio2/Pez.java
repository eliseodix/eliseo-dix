
package ejercicio2;


public class Pez extends Animal{
    private String tipoAgua;

    public Pez(String tipoAgua, String especie) {
        super(especie);
        this.tipoAgua = tipoAgua;
    }
    
    @Override
        public void mostarEspecie(){
            super.mostarEspecie();
            System.out.println("tipo agua:" +tipoAgua);
            
        }


    
}
