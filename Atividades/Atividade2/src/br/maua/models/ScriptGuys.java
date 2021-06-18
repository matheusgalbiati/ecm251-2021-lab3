package br.maua.models;

import br.maua.enums.HorarioSistema;
import br.maua.enums.TiposMembros;

public class ScriptGuys extends Membros{

    public ScriptGuys(String nomeUsuario, String email, TiposMembros funcao) {
        super(nomeUsuario, email, funcao);
    }

    @Override
    public void apresentar() {
        System.out.println(toString());
    }

    @Override
    public void postarMensagem() {
        if(qualHorario() == HorarioSistema.Regular)
            System.out.println("Prazer em ajudar novos amigos de código!");
        if(qualHorario() == HorarioSistema.Extra)
            System.out.println("QU3Ro_S3us_r3curs0s.py");
    }

    @Override
    public String toString() {
        return "ScriptGuys{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", email='" + email + '\'' +
                ", funcao=" + funcao +
                '}';
    }
}
