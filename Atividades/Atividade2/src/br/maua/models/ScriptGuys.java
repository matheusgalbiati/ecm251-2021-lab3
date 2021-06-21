package br.maua.models;

import br.maua.enums.HorarioSistema;
import br.maua.enums.TiposMembros;

/**
 * Classe do tipo de função Script Guys
 */
public class ScriptGuys extends Membros{

    /**
     * Método construtor da classe Mobile Members
     * @param nomeUsuario Nome de usuário do membro
     * @param email e-mail do membro
     * @param funcao Função do membro
     */
    public ScriptGuys(String nomeUsuario, String email, TiposMembros funcao) {
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
            System.out.println("Prazer em ajudar novos amigos de código!");
        if(qualHorario() == HorarioSistema.Extra)
            System.out.println("QU3Ro_S3us_r3curs0s.py");
    }

    /**
     * Método toString
     * @return A apresentação dos dados do membro
     */
    @Override
    public String toString() {
        return "ScriptGuys{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", email='" + email + '\'' +
                ", funcao=" + funcao +
                '}';
    }
}
