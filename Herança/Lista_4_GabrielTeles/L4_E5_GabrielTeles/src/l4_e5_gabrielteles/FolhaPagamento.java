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
public class FolhaPagamento {
    private float salarioTotal=0;

    public FolhaPagamento() {
    }

    public float folhaPag(Funcionario  a){
        salarioTotal+= a.getSalario();
        return salarioTotal;
    }
    
    
}
