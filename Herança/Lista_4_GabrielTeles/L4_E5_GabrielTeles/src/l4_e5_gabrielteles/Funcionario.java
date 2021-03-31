/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4_e5_gabrielteles;

/**
 *
 * @author Bielt
 */
public class Funcionario {
    private String nome,dataNascimento; 
    private float salario;

    public Funcionario(String nome, String dataNascimento, float salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    Funcionario() {
    
    }
    public void status(){
        System.out.println("nome: " + nome);
        System.out.println("dataNascimento: " + dataNascimento);
        System.out.println("salario: " + salario);
    }


    public float getSalario() {
        return salario;
    }
    
}
