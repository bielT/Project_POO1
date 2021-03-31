package l4_e4_gabrielteles;
public class L4_E4_GabrielTeles {
    public static void main(String[] args) {
        Veiculos v[]=new Veiculos[10];
        v[0]= new Convencionais("Fiat","Palio","FFF00000",3213,"Azul",true,true,5);
        v[0].status();
        v[1]= new Utilitarios("Ford","a","FFF11111",13,3,"1000 Kg","300m3");
        v[1].status();
        
       
    }
    
}
