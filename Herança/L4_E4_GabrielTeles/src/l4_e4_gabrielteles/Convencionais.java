package l4_e4_gabrielteles;
public class Convencionais extends Veiculos{
   private final String registroCor; 
    private final boolean cambioautomatico;
    private final boolean economico;
   private final int quantidadeMarchas; 

    public Convencionais( String marca, String modelo, String placa, int códigoCadastro,String registroCor, boolean cambioautomatico, boolean economico, int quantidadeMarchas) {
        super(marca, modelo, placa, códigoCadastro);
        this.registroCor = registroCor;
        this.cambioautomatico = cambioautomatico;
        this.economico = economico;
        this.quantidadeMarchas = quantidadeMarchas;
    }
   @Override
   public void status(){
       super.status();
       System.out.println("registro cor: "+ registroCor);
       if (cambioautomatico) {
           System.out.println("Tem cambio automatico" );
       } else {
            System.out.println("Não tem cambio automatico" );
       }
       if (economico) {
           System.out.println("Economico.");
       } else {
           System.out.println("Espotivo .");
       }
       System.out.println("quantidade marchas: "+ quantidadeMarchas);
   }
}
