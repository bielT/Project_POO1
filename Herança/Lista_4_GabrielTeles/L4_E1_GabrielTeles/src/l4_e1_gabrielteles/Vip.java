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
public class Vip extends Ingresso {
    private float valorAd;
    public Vip(float a,float b){
        super(a);
        valorAd= b;
    }

    public float getValorAd() {
        return valorAd;
    }
    public void imprimeValorVip(){
        System.out.print("Ingresso vip ");
        imprimeValor();
        System.out.printf(" Valor Ad: %.2f\n",getValorAd());
    }
}
