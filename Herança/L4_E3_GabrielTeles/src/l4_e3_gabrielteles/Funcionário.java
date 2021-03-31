package l4_e3_gabrielteles;
public class Funcionário {
    private final String  nome;
    private final float salario;
    
   // cadastrar um funcionário,
  //  imprimir na tela todos os dados de um funcionário

    public Funcionário(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public void status() {
        System.out.println("nome: "+ nome);
        System.out.println("salário: "+salario);
    }
}
