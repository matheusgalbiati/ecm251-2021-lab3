package br.maua.models;

import br.maua.controladores.Sistema;
import br.maua.enums.HorarioSistema;
import br.maua.enums.TiposMembros;
import br.maua.interfaces.Apresentacao;
import br.maua.interfaces.PostarMensagem;

/**
 * Classe abstrata usada como modelo para os tipos de membros
 */
abstract class Membros implements PostarMensagem, Apresentacao {
    protected String nomeUsuario;
    protected String email;
    protected TiposMembros funcao;

    /**
     * Método construtor da classe abstrada Membros
     * @param nomeUsuario Nome de usuário do membro
     * @param email e-mail do membro
     * @param funcao Função atribuída ao membro
     */
    public Membros(String nomeUsuario, String email, TiposMembros funcao) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.funcao = funcao;
    }

    /**
     * Método usado para pegar o valor do horário do sistema
     * @return Horário do sistema
     */
    public HorarioSistema qualHorario(){
        return Sistema.getHorario();
    }
}
