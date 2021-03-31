package l4_e3_gabrielteles;
public class Secretária  extends Funcionário {
    private final int ramal ;

    public Secretária(String nome, float salario,int ramal) {
        super(nome, salario);
        this.ramal = ramal;
    }
     @Override
    public void status( ) {
        super.status();
        System.out.println("Ramal: "+ramal+"\n");
    }


}
