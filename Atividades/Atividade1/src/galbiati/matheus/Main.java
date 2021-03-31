//Matheus dos Santos Galbiati   RA: 19.01324-8
//João Pedro Moura Penafiel     RA: 19.00097-9

package galbiati.matheus;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Transacoes transacoes = new Transacoes();
        //Contas conta = new Contas();

        Contas c1 = sistema.criaConta(1000);
        Contas c2 = sistema.criaConta(250);
        Contas c3 = sistema.criaConta(3000);
        String t1 = transacoes.gerarRequisicao(1, "perigo", 1);
        transacoes.pagarRequisicao(c1, c2, t1);
        //sistema.transacoes.pagarRequisicao(c1, c2, t1);
        //sistema.transacoes.pagarRequisicao(c1, c2, t1);
        System.out.println(c1.saldo);
        System.out.println(c2.saldo);


    }
}
