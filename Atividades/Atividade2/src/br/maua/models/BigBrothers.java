package br.maua.models;

import br.maua.enums.HorarioSistema;
import br.maua.enums.TiposMembros;

public class BigBrothers extends Membros{

    public BigBrothers(String nomeUsuario, String email, TiposMembros funcao) {
        super(nomeUsuario, email, funcao);
    }

    @Override
    public void apresentar() {
        System.out.println(toString());
    }

    @Override
    public void postarMensagem() {
        if(qualHorario() == HorarioSistema.Regular)
            System.out.println("Sempre ajudando as pessoas membros ou não S2!");
        if(qualHorario() == HorarioSistema.Extra)
            System.out.println("...");
    }

    @Override
    public String toString() {
        return "BigBrothers{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", email='" + email + '\'' +
                ", funcao=" + funcao +
                '}';
    }
}
