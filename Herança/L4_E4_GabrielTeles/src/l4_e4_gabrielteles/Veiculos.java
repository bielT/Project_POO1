package l4_e4_gabrielteles;
public class Veiculos{

    private final String marca;
    private final String modelo;
    private final String placa;
   private final int códigoCadastro ;

    public Veiculos(String marca, String modelo, String placa, int códigoCadastro) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.códigoCadastro = códigoCadastro;
    }
   public void status(){
       System.out.println("marca: "+ marca);
       System.out.println("modelo: "+ modelo);
       System.out.println("placa: "+ placa);
       System.out.println("código cadastro: "+ códigoCadastro);
   }
   
    
}
