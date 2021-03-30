package l4_e1_gabrielteles;

/**
 *
 * @Gabriel Teles 30/03/2021;
 */
public class L4_E1_GabrielTeles {
    public static void main(String[] args) {
        Ingresso i[]=new Ingresso[5];
        i[0]= new Normal(50.00f);
        i[1]= new Normal(50);
        i[2]= new Normal(50);
        i[3]= new Vip(50,20);
        i[4]= new Vip(50,20);
        i[0].ingressoNormal();
        i[1].ingressoNormal();
        i[2].ingressoNormal();
        i[3]. imprimeValorVip();
        i[4]. imprimeValorVip();
        
    }

    
}
