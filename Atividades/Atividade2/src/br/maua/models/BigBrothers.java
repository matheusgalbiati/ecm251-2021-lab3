package br.maua.models;

import br.maua.enums.HorarioSistema;
import br.maua.enums.TiposMembros;

/**
 * Classe do tipo de função Big Brothers
 */
public class BigBrothers extends Membros{

    /**
     * Método construtor da classe Big Brothers
     * @param nomeUsuario NOme de usuário do membro
     * @param email e-mail do menbro
     * @param funcao Função do membro
     */
    public BigBrothers(String nomeUsuario, String email, TiposMembros funcao) {
        super(nomeUsuario, email, funcao);
    }

    /**
     * Método que faz a apresentação do membro
     */
    @Override
    public void apresentar() {
        System.out.println(toString());
    }

    /**
     * Método que posta uma mensagem dependendo do horário do sistema
     */
    @Override
    public void postarMensagem() {
        if(qualHorario() == HorarioSistema.Regular)
            System.out.println("Sempre ajudando as pessoas membros ou não S2!");
        if(qualHorario() == HorarioSistema.Extra)
            System.out.println("...");
    }

    /**
     * Método toString
     * @return A apresentação dos dados do membro
     */
    @Override
    public String toString() {
        return "BigBrothers{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", email='" + email + '\'' +
                ", funcao=" + funcao +
                '}';
    }
}
