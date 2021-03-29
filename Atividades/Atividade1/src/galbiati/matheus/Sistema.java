//Matheus dos Santos Galbiati   RA: 19.01324-8
//João Pedro Moura Penafiel     RA: 19.00097-9

package galbiati.matheus;

import java.util.Scanner;

public class Sistema {
    private boolean continuarExecucao;
    private Scanner scanner;
    private Contas conta;
    private int contador = 0;

    public Sistema() {
        this.continuarExecucao = true;
        this.scanner = new Scanner(System.in);
    }

    public void executar() {
        while(continuarExecucao){
            exibirMenu1();
            int opcao1 = scanner.nextInt();
            avaliarOpcao1(opcao1);
        }
    }

    private void exibirMenu1() {
        System.out.println("Bem-Vindo ao Seu Banco\n");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Acessar conta");
        System.out.println("0 - Sair do sistema");
    }

    private void avaliarOpcao1(int opcao1) {
        switch (opcao1){
            case 0:
                System.out.println("Obrigado por utilizar o nosso sistema!");
                this.continuarExecucao = false;
                break;
            case 1:
                System.out.println("Informe seu nome completo:");
                String nome = scanner.next();
                System.out.println("Crie uma senha para a conta [6 digitos]:");
                String senha = scanner.next();
                System.out.println("Informe seu e-mail:");
                String email = scanner.next();
                this.contador += 1;
                this.conta = new Contas(this.contador, 0.0, nome, senha, email);
                System.out.println("Conta criada com sucesso!\n");
                //System.out.println(conta.toString());
                break;
            case 2:
                System.out.println("Digite seu e-mail:");
                String emailLogin = scanner.next();
                System.out.println("Digite sua senha:");
                String senhaLogin = scanner.next();

            default:
                System.out.println("Funcionalidade ainda não implementada\n");
                break;
        }
    }
}
