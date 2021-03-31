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
public class Operario  extends Funcionario {
    private float valorProdução=1, quantidadeProduzida=1; 

    public Operario( String nome, String dataNascimento,float valorProdução, float quantidadeProduzida) {
        super(nome, dataNascimento, valorProdução * quantidadeProduzida);
        this. valorProdução =  valorProdução;
        this.quantidadeProduzida = quantidadeProduzida;
    }
    @Override
      public void status(){
        super.status();
        System.out.println("Valor Produção: " + valorProdução);
        System.out.println("Quantidade Produzida: " + quantidadeProduzida);
    }
    
    
}
