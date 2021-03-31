package l4_e5_gabrielteles;
public class Vendedor extends Funcionario {
     private float valorFixo =1, comissao =1,  vendas; 

    public Vendedor( String nome, String dataNascimento,float valorFixo , float comissao, float  vendas) {
        super(nome, dataNascimento,(comissao * vendas)+valorFixo);
        this. valorFixo =  valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }
    @Override
      public void status(){
        super.status();
        System.out.println("Valor Fixo: " + valorFixo);
        System.out.println("Comissao: " + comissao);
    }
    
}
