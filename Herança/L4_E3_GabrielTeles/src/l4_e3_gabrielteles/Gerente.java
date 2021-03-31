
package l4_e3_gabrielteles;
public class Gerente extends Funcionário {
    private final String senha;
    private final int usuario;
    /**
     *
     * @param nome
     * @param salario
     * @param senha
     * @param usuario
     */

    public Gerente( String nome, float salario, int usuario,String senha) {
        super(nome, salario);
        this.senha = senha;
        this.usuario = usuario;
    }
    @Override
    public void status( ) {
        super.status();
        System.out.println("usuario: "+usuario+"\n");
    }

    
}
