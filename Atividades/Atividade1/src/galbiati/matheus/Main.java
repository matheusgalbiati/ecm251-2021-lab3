//Matheus dos Santos Galbiati   RA: 19.01324-8
//João Pedro Moura Penafiel     RA: 19.00097-9

//Material de referencia: aulas de Linguagens de Programação I

package galbiati.matheus;

public class Main {

    public static void main(String[] args) {
        Contas contas = new Contas();

        Contas c1 = contas.criaConta(1000,"matheus","123","matheus@teste.com");
        Contas c2 = contas.criaConta(250,"joao","456","joao@teste.com");
        Contas c3 = contas.criaConta(3000,"ana","789","ana@teste.com");

        System.out.println("Estado Inicial:");
        System.out.println("Nome de usuario: "+c1.usuarios.nome+" - Saldo: "+c1.saldo);
        System.out.println("Nome de usuario: "+c2.usuarios.nome+" - Saldo: "+c2.saldo);
        System.out.println("Nome de usuario: "+c3.usuarios.nome+" - Saldo: "+c3.saldo);

        String t1 = contas.transacoes.gerarRequisicao(1, "matheus", 250);
        contas.transacoes.pagarRequisicao(c2, c1, t1);
        contas.transacoes.pagarRequisicao(c3, c1, t1);
        contas.transacoes.pagarRequisicao(c2, c1, t1);
        String t2 = contas.transacoes.gerarRequisicao(2,"joao",1000);
        contas.transacoes.pagarRequisicao(c3, c2, t2);

        System.out.println("Estado Final:");
        System.out.println("Nome de usuario: "+c1.usuarios.nome+" - Saldo: "+c1.saldo);
        System.out.println("Nome de usuario: "+c2.usuarios.nome+" - Saldo: "+c2.saldo);
        System.out.println("Nome de usuario: "+c3.usuarios.nome+" - Saldo: "+c3.saldo);

    }
}
