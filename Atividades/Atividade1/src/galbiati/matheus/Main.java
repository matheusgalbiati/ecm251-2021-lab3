//Matheus dos Santos Galbiati   RA: 19.01324-8
//João Pedro Moura Penafiel     RA: 19.00097-9

package galbiati.matheus;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Transacoes transacoes = new Transacoes();
        sistema.criaConta(1000);
        sistema.criaConta(250);
        sistema.criaConta(3000);
        System.out.println(transacoes.geraRequisicao(1, "perigo", 1));


    }
}
