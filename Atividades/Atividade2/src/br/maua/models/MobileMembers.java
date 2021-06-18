package br.maua.models;

import br.maua.enums.HorarioSistema;
import br.maua.enums.TiposMembros;

public class MobileMembers extends Membros{

    public MobileMembers(String nomeUsuario, String email, TiposMembros funcao) {
        super(nomeUsuario, email, funcao);
    }

    @Override
    public void apresentar() {
        System.out.println(toString());
    }

    @Override
    public void postarMensagem() {
        if(Sistema.getHorario() == HorarioSistema.Regular)
            System.out.println("Happy Coding!");
        if(Sistema.getHorario() == HorarioSistema.Extra)
            System.out.println("Happy_C0d1ng.Maskers");
    }

    @Override
    public String toString() {
        return "MobileMembers{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", email='" + email + '\'' +
                ", funcao=" + funcao +
                '}';
    }
}
