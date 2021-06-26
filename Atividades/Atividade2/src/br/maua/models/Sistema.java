package br.maua.models;

import br.maua.enums.HorarioSistema;
import br.maua.enums.TiposMembros;

import java.io.FileWriter;
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
    private static int id = 0;

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
            case 2:
                postarMensagem();
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
            case 5:
                exibirRelatorio();
                break;
            default:
                System.out.println("Funcionalidade ainda não implementada");
                break;
        }
    }

    /**
     * Menu de exibição inicial
     */
    public void exibirMenu(){
        System.out.println("\nBem-vindo a Mask_Society");
        System.out.println("Horario de trabalho atual: " + horario);
        System.out.println("1 - Cadastrar novo membro");
        System.out.println("2 - Postar mensagem");
        System.out.println("3 - Trocar horario de trabalho");
        System.out.println("4 - Excluir membro");
        System.out.println("5 - Exibir relatório");
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
        try {
            if(tipoMembro == 1) {
                mobileMembersList.add(new MobileMembers(nomeNovoMembro, emailNovoMembro, TiposMembros.MobileMembers));
                criaArquivo(TiposMembros.MobileMembers, nomeNovoMembro, id);
                id += 1;
            }
            if(tipoMembro == 2) {
                heavyLiftersList.add(new HeavyLifters(nomeNovoMembro, emailNovoMembro, TiposMembros.HeavyLifters));
                criaArquivo(TiposMembros.HeavyLifters, nomeNovoMembro, id);
                id += 1;
            }
            if(tipoMembro == 3) {
                scriptGuysList.add(new ScriptGuys(nomeNovoMembro, emailNovoMembro, TiposMembros.ScriptGuys));
                criaArquivo(TiposMembros.ScriptGuys, nomeNovoMembro, id);
                id += 1;
            }
            if(tipoMembro == 4) {
                bigBrothersList.add(new BigBrothers(nomeNovoMembro, emailNovoMembro, TiposMembros.BigBrothers));
                criaArquivo(TiposMembros.BigBrothers, nomeNovoMembro, id);
                id += 1;
            }
        } catch (Exception exception){
            System.out.println("Algo deu errado!");
        }
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

    /**
     * Método que percorre todas as listas de membros e posta suas mensagens dependendo do horário
     */
    public void postarMensagem(){
        mobileMembersList.forEach(mobileMembers -> mobileMembers.postarMensagem());
        heavyLiftersList.forEach(heavyLifters -> heavyLifters.postarMensagem());
        scriptGuysList.forEach(scriptGuys -> scriptGuys.postarMensagem());
        bigBrothersList.forEach(bigBrothers -> bigBrothers.postarMensagem());
    }

    /**
     * Método que percorre as listas dos membros e faz a apresentação deles
     */
    public void exibirRelatorio(){
        mobileMembersList.forEach(mobileMembers -> mobileMembers.apresentar());
        heavyLiftersList.forEach(heavyLifters -> heavyLifters.apresentar());
        scriptGuysList.forEach(scriptGuys -> scriptGuys.apresentar());
        bigBrothersList.forEach(bigBrothers -> bigBrothers.apresentar());
    }

    /**
     * Método que cria um arquivo para gravar os dados dos usuários cadastrados
     * @param categoria Tipo de função do membro cadastrado
     * @param nome Nome do membro cadastrado
     * @param id id único atribuído para cada membro cadastrado
     * @throws Exception
     */
    private static void criaArquivo(TiposMembros categoria, String nome, int id) throws Exception {
        FileWriter fileWriter = new FileWriter("arquivo_super_Secreto_nao_abrir.csv", true);
        fileWriter.append(categoria+";"+nome+";"+id+"\n");
        fileWriter.close();
    }
}
