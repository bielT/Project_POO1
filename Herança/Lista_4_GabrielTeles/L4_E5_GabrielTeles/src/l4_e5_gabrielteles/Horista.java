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
public class Horista extends Funcionario{
    private float valorHora=1, totalHora=1;

    public Horista( String nome, String dataNascimento,float valorHora, float totalHora) {
        super(nome, dataNascimento, valorHora*totalHora);
        this.valorHora = valorHora;
        this.totalHora = totalHora;
    }

    @Override
      public void status(){
        super.status();
        System.out.println("Valor Hora: " + valorHora);
        System.out.println("total hora: " + totalHora);
    }


}
