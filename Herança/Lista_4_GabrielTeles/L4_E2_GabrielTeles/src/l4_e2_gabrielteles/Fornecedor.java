package l4_e2_gabrielteles;
public class Fornecedor extends Pessoa {
     private float valorCredito, valorDivida;

    public Fornecedor( String nome, String endereco, String telefone,float valorCredito, float valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }
     

     @Override
     public void status (){
         super.status();
         System.out.println("Credito"+valorCredito);
         System.out.println("Divida"+valorDivida);        
     }
     @Override
      public void obterSaldo() {
          System.out.printf("Saldo %.2f",valorCredito-valorDivida );    
       }
}
