package br.maua.models;

import br.maua.enums.HorarioSistema;
import br.maua.enums.TiposMembros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável pelo funcionamento do sistema
 */
public class Sistema {
    public boolean continuarExecucao;
    public Scanner scanner;

    private static HorarioSistema horario = HorarioSistema.Regular;

    List<MobileMembers> mobileMembersList = new ArrayList<>();
    List<HeavyLifters> heavyLiftersList = new ArrayList<>();
    List<ScriptGuys> scriptGuysList = new ArrayList<>();
    List<BigBrothers> bigBrothersList = new ArrayList<>();

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
            case 1:
                menuCadastro();
                int tipoMembroCadastro = scanner.nextInt();
                cadastrarMembro(tipoMembroCadastro);
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
            case 4:
                menuRemocao();
                int tipoMembroRemocao = scanner.nextInt();
                excluirMembro(tipoMembroRemocao);
                break;
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

    /**
     * Menu com as opções de membros para fazer o cadastro
     */
    public void menuCadastro(){
        System.out.println("Escolha o tipo de membro que deseja cadastrar");
        System.out.println("1 - Mobile Members");
        System.out.println("2 - Heavy Lifters");
        System.out.println("3 - Script Guys");
        System.out.println("4 - Big Brothers");
    }

    /**
     * Método que cadastra um novo membro
     * @param tipoMembro tipo do membro escolhido pelo usuário para cadastrar
     */
    public void cadastrarMembro(int tipoMembro){
        System.out.println("Digite o nome do novo membro:");
        String nomeNovoMembro = scanner.next();
        System.out.println("Digite o e-mail do novo membro:");
        String emailNovoMembro = scanner.next();
        if(tipoMembro == 1)
            mobileMembersList.add(new MobileMembers(nomeNovoMembro, emailNovoMembro, TiposMembros.MobileMembers));
        if(tipoMembro == 2)
            heavyLiftersList.add(new HeavyLifters(nomeNovoMembro, emailNovoMembro, TiposMembros.HeavyLifters));
        if(tipoMembro == 3)
            scriptGuysList.add(new ScriptGuys(nomeNovoMembro, emailNovoMembro, TiposMembros.ScriptGuys));
        if(tipoMembro == 4)
            bigBrothersList.add(new BigBrothers(nomeNovoMembro, emailNovoMembro, TiposMembros.BigBrothers));
    }

    /**
     * Menu com as opções de membros para fazer a remoção
     */
    public void menuRemocao(){
        System.out.println("Escolha o tipo de membro que deseja excluir");
        System.out.println("1 - Mobile Members");
        System.out.println("2 - Heavy Lifters");
        System.out.println("3 - Script Guys");
        System.out.println("4 - Big Brothers");
    }

    /**
     * Método que exclui um membro pelo seu índice
     * @param tipoMembro tipo do membro escolhido pelo usuário para excluir
     */
    public void excluirMembro(int tipoMembro){
        System.out.println("Digite o índice do membro que deseja excluir:");
        int indice = scanner.nextInt();
        if(tipoMembro == 1)
            mobileMembersList.remove(indice);
        if(tipoMembro == 2)
            heavyLiftersList.remove(indice);
        if(tipoMembro == 3)
            scriptGuysList.remove(indice);
        if(tipoMembro == 4)
            bigBrothersList.remove(indice);
    }
}
