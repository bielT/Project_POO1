package l4_e2_gabrielteles;
public class Empregado extends Pessoa {
   private int  codigoSetor ;
   private float salarioBase, imposto ;

    public Empregado( String nome, String endereco, String telefone,int codigoSetor, float salarioBase, float imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

   @Override
    public void status (){
         super.status();
         System.out.println("Codigo Setor :"+ codigoSetor);
         System.out.println("Salario Base :"+salarioBase);
         System.out.println("imposto" + imposto);
     }
    
    public void calcularSalario(){
        System.out.printf("Salario final : %.2f", salarioBase*(1-( imposto/100)));
    }
    
}
