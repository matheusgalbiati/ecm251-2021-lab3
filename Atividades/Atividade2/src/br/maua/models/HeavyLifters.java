package br.maua.models;

import br.maua.enums.HorarioSistema;
import br.maua.enums.TiposMembros;

public class HeavyLifters extends Membros{

    public HeavyLifters(String nomeUsuario, String email, TiposMembros funcao) {
        super(nomeUsuario, email, funcao);
    }

    @Override
    public void apresentar() {
        System.out.println(toString());
    }

    @Override
    public void postarMensagem() {
        if(qualHorario() == HorarioSistema.Regular)
        System.out.println("Podem contar conosco!");
        if(qualHorario() == HorarioSistema.Extra)
            System.out.println("N00b_qu3_n_Se_r3pita.bat");
    }

    @Override
    public String toString() {
        return "HeavyLifters{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", email='" + email + '\'' +
                ", funcao=" + funcao +
                '}';
    }
}
