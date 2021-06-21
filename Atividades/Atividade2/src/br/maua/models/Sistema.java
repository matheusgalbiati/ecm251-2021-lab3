package br.maua.models;

import br.maua.enums.HorarioSistema;

import java.util.Scanner;

/**
 * Classe responsável pelo funcionamento do sistema
 */
public class Sistema {
    public boolean continuarExecucao;
    public Scanner scanner;

    private static HorarioSistema horario = HorarioSistema.Regular;

    /**
     * Método construtor da classe Sistema
     */
    public Sistema() {
        this.continuarExecucao = true;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Método que inicializa a execução do sistema e avalia as opções
     */
    public void executar(){
        while (continuarExecucao){
            exibirMenu();
            int opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    /**
     * Getter do horário do sistema
     * @return O valor do atributo horario
     */
    public static HorarioSistema getHorario() {
        return horario;
    }

    /**
     * Método usado para avaliar o input do usuário
     * @param opcao Opção que o usuário escolher
     */
    public void avaliarOpcao(int opcao){
        switch (opcao){
            case 0:
                System.out.println("Obrigado por utilizar nosso sistema");
                this.continuarExecucao = false;
                break;
            case 3:
                if(horario == HorarioSistema.Regular) {
                    horario = HorarioSistema.Extra;
                    break;
                }
                if(horario == HorarioSistema.Extra){
                    horario = HorarioSistema.Regular;
                    break;
                }
        }
    }

    /**
     * Menu de exibição inicial
     */
    public void exibirMenu(){
        System.out.println("Bem-vindo a Mask_Society");
        System.out.println("Horario de trabalho atual: " + horario);
        System.out.println("1 - Cadastrar novo membro");
        System.out.println("2 - Postar mensagem");
        System.out.println("3 - Trocar horario de trabalho");
        System.out.println("4 - Excluir membro");
        System.out.println("0 - Encerrar sistema");
    }
}
