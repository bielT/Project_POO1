package l4_e2_gabrielteles;

/**
 *
 * @author Gabriel Teles 30/03/2021
 */
public class L4_E2_GabrielTeles {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
 
        Pessoa p0 = new Fornecedor(p.input.next(), p.input.next(), p.input.next(), p.input.nextFloat(), p.input.nextFloat());
        Pessoa p1 = new Empregado(p.input.next(), p.input.next(), p.input.next(), p.input.nextInt(), p.input.nextFloat(), p.input.nextFloat());
        Pessoa p2 = new Fornecedor(p.input.next(), p.input.next(), p.input.next(), p.input.nextFloat(), p.input.nextFloat());
        Pessoa p3 = new Fornecedor(p.input.next(), p.input.next(), p.input.next(), p.input.nextFloat(), p.input.nextFloat());
       Pessoa p4 = new Empregado(p.input.next(), p.input.next(), p.input.next(), p.input.nextInt(), p.input.nextFloat(), p.input.nextFloat());
        p0.status();
        p1.status();
        p2.status();
        p3.status();
        p4.status();
        p2.obterSaldo();
        p1.calcularSalario();

    }

}
