package br.maua.models;

import br.maua.enums.HorarioSistema;
import br.maua.enums.TiposMembros;

/**
 * Classe do tipo de função Heavy Lifters
 */
public class HeavyLifters extends Membros{

    /**
     * Método construtor da classe Heavy Lifters
     * @param nomeUsuario Nome de usuário do membro
     * @param email e-mail do membro
     * @param funcao Função do membro
     */
    public HeavyLifters(String nomeUsuario, String email, TiposMembros funcao) {
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
        System.out.println("Podem contar conosco!");
        if(qualHorario() == HorarioSistema.Extra)
            System.out.println("N00b_qu3_n_Se_r3pita.bat");
    }

    /**
     * Método toString
     * @return A apresentação dos dados do membro
     */
    @Override
    public String toString() {
        return "HeavyLifters{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", email='" + email + '\'' +
                ", funcao=" + funcao +
                '}';
    }
}
