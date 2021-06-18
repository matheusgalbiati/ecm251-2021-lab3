package br.maua.models;

import br.maua.enums.HorarioSistema;
import br.maua.enums.TiposMembros;
import br.maua.interfaces.Apresentacao;
import br.maua.interfaces.PostarMensagem;

abstract class Membros implements PostarMensagem, Apresentacao {
    public String nomeUsuario;
    public String email;
    public TiposMembros funcao;

    public Membros(String nomeUsuario, String email, TiposMembros funcao) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.funcao = funcao;
    }

    public HorarioSistema qualHorario(){
        return Sistema.getHorario();
    }
}
