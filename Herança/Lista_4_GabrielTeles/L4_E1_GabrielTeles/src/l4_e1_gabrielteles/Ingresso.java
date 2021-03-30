/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4_e1_gabrielteles;

/**
 *
 * @author Bielt
 */
public class Ingresso {
    private final float valor;
    public Ingresso(float v){
        valor = v ;
    }
    public float getValor(){ 
        return valor;
    }  
    public void imprimeValor(){
        System.out.printf("Valor %.2f",getValor());
    }

    void ingressoNormal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void imprimeValorVip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
