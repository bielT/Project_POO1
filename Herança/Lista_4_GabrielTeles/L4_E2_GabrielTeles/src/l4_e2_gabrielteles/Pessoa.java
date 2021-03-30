package l4_e2_gabrielteles;

import java.util.Scanner;

    public class Pessoa {
        private String nome;
        private String endereco;
        private String telefone;
    Scanner input = new Scanner(System.in);

    public Pessoa() {
    }
       
    public void cadastrar(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public void status(){
        System.out.println("nome:"+nome);
        System.out.println("endereço:"+endereco);
        System.out.println("telefone:"+telefone);
        
    }
        
}
