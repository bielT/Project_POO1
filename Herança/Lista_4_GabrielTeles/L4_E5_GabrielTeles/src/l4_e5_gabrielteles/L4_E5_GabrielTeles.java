package l4_e5_gabrielteles;

/**
 *
 * @author Gabriel Teles 31/03/2021
 */
public class L4_E5_GabrielTeles {
    public static void main(String[] args) {
        FolhaPagamento e=new FolhaPagamento(); 
        Funcionario v[]=new Funcionario[4];
        v[0]=new Chefe("João","31/03",3000);
        v[1]=new Horista("Marco","12/02",30,60);
        v[2]=new Operario("Joao","01/01",3.5f,300);
        v[3]=new Vendedor("Ana","02/02",800,0.05f,2000);
        v[0].status();
        v[1].status();
        v[2].status();
        v[3].status();
        float a = 0;
        for (int i = 0; i < 4; i++) {
            a=e.folhaPag(v[i]);
        }
        System.out.println("Folha de Pagamento: "+a);
    }
    
}
