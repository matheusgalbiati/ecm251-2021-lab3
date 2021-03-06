package br.maua.models;

import br.maua.enums.HorarioSistema;
import br.maua.enums.TiposMembros;

/**
 * Classe do tipo de função Mobile Members
 */
public class MobileMembers extends Membros{

    /**
     * Método construtor da classe Mobile Members
     * @param nomeUsuario Nome de usuário do membro
     * @param email e-mail do membro
     */
    public MobileMembers(String nomeUsuario, String email) {
        super(nomeUsuario, email, TiposMembros.MobileMembers);
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
            System.out.println("Happy Coding!");
        if(qualHorario() == HorarioSistema.Extra)
            System.out.println("Happy_C0d1ng.Maskers");
    }

    /**
     * Método toString
     * @return A apresentação dos dados do membro
     */
    @Override
    public String toString() {
        return "MobileMembers{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", email='" + email + '\'' +
                ", funcao=" + funcao +
                '}';
    }
}
