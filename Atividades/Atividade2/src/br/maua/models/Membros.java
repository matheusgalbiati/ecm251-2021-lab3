package br.maua.models;

abstract class Membros {
    public String nomeUsuario;
    public String email;
    public String funcao;

    public String qualHorario(){
        return Sistema.getHorario();
    }
}
