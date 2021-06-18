package br.maua.models;

import br.maua.interfaces.Apresentacao;
import br.maua.interfaces.PostarMensagem;

abstract class Membros implements PostarMensagem, Apresentacao {
    public String nomeUsuario;
    public String email;
    public String funcao;

    public String qualHorario(){
        return Sistema.getHorario();
    }
}
