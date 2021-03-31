//Matheus dos Santos Galbiati   RA: 19.01324-8
//João Pedro Moura Penafiel     RA: 19.00097-9

package galbiati.matheus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private boolean continuarExecucao;
    private Scanner scanner;
    protected Contas conta;
    protected Transacoes transacoes;
    private int contador = 0;

    public Sistema() {
        this.continuarExecucao = true;
        this.scanner = new Scanner(System.in);
    }

    List contasCadastradas = new ArrayList();

//    public void executar() {
//        while(continuarExecucao){
//            int opcao = scanner.nextInt();
//            avaliarOpcao(opcao);
//        }
//    }

    protected Contas criaConta(double saldoInicial) {
        System.out.println("Informe seu nome completo:");
        String nome = scanner.next();
        System.out.println("Crie uma senha para a conta [6 digitos]:");
        String senha = scanner.next();
        System.out.println("Informe seu e-mail:");
        String email = scanner.next();
        this.contador += 1;
        this.conta = new Contas(this.contador, saldoInicial, nome, senha, email);
        setContasCriadas(contasCadastradas);
        //this.conta = new Contas(this.contador, saldo, nome, senha, email);
        //System.out.println("Conta criada com sucesso!\n");
        //System.out.println(conta.toString());
        return (this.conta);
    }

    public void setContasCriadas(List contasCadastradas) {
        this.contasCadastradas.add(this.conta);
    }

    //    private void avaliarOpcao(int opcao) {
//        switch (opcao){
//            case 0:
//                System.out.println("Obrigado por utilizar o nosso sistema!");
//                this.continuarExecucao = false;
//                break;
//            case 1:
//                System.out.println("Saldo: R$" + this.conta.getSaldo());
//                break;
//            case 2:
//                System.out.println("Informe o valor:");
//                double valorParaDepositar = scanner.nextDouble();
//                this.conta.depositar(valorParaDepositar);
//                System.out.println("Operação realizada com sucesso!");
//                break;
//            case 3:
//                System.out.println("Informe o valor:");
//                double valorParaRetirar = scanner.nextDouble();
//                if(this.conta.sacar(valorParaRetirar)){
//                    System.out.println("Operação realizada com sucesso!");
//                } else {
//                    System.out.println("Operação falhou! Verificar saldo!");
//                }
//                break;
//            case 5:
//                System.out.println("Nome do título:");
//                String nomeTitulo = scanner.next();
//                System.out.println("Informe o valor do título:");
//                double valorTitulo = scanner.nextDouble();
//                System.out.println("Informe o valor do juros ao dia:");
//                double valorJurosTitulo = scanner.nextDouble();
//                System.out.println("Informe a data de vencimento (aaa-mm-dd):");
//                String dataValidade = scanner.next();
//                Titulo titulo = new Titulo(valorTitulo, valorJurosTitulo, nomeTitulo, dataValidade);
//                if(this.conta.sacar(titulo.getTotalPagamento())){
//                    System.out.println("Operação realizada com sucesso!");
//                } else{
//                    System.out.println("falha na operação!");
//                }
//                break;
//            default:
//                System.out.println("Funcionalidade ainda não implementada\n");
//                break;
//        }
//    }


}
