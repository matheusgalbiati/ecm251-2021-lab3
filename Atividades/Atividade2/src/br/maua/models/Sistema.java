package br.maua.models;

import br.maua.enums.HorarioSistema;

import java.util.Scanner;

public class Sistema {
    public boolean continuarExecucao;
    public Scanner scanner;
    
    private static HorarioSistema horario = HorarioSistema.Regular;


    public Sistema() {
        this.continuarExecucao = true;
        this.scanner = new Scanner(System.in);
    }

    public void executar(){
        while (continuarExecucao){
            exibirMenu();
            int opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    public static HorarioSistema getHorario() {
        return horario;
    }

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
