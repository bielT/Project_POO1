package l4_e3_gabrielteles;

import java.util.Scanner;

/**
 *
 * @author Gabriel Teles 30/03/2021
 */
public class L4_E3_GabrielTeles {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Funcionário f[]= new Funcionário[3];
        System.out.println("Cadastre o gerente nome, salario ,usuario, e senha:");
       f[0]=new Gerente(input.next(),input.nextFloat(),input.nextInt(), input.next() );
        System.out.println("Cadastre o secretária nome, salario e ramal:");
       f[1]=new Secretária(input.next(),input.nextFloat() ,input.nextInt() );
        System.out.println("Cadastre o secretária nome, salario e ramal:");
       f[2]=new Secretária(input.next(),input.nextFloat(),input.nextInt() );
       f[0].status();
       f[1].status();
       f[2].status();
    }
    
}
