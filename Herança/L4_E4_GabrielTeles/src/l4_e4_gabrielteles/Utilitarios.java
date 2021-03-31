package l4_e4_gabrielteles;
public class Utilitarios extends Veiculos {
    private final int numeroEixos; 
    private final String pesoMaximo;
    private final String volumeMaximo;

    public Utilitarios( String marca, String modelo, String placa, int códigoCadastro,int numeroEixos, String pesoMaximo, String volumeMaximo) {
        super(marca, modelo, placa, códigoCadastro);
        this.numeroEixos = numeroEixos;
        this.pesoMaximo = pesoMaximo;
        this.volumeMaximo = volumeMaximo;
    }
    @Override
   public void status(){
       super.status();
       System.out.println("numero eixos" + numeroEixos);
       System.out.println("peso maximo: "+ pesoMaximo);
       System.out.println("volume maximo: " + volumeMaximo);
   }
    
}
