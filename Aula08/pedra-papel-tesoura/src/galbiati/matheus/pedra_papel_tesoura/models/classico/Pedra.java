package galbiati.matheus.pedra_papel_tesoura.models.classico;

import galbiati.matheus.pedra_papel_tesoura.models.Jogada;

public class Pedra extends Jogada {
    @Override
    public boolean verificaSeGanhei(Jogada jogada) {
        return jogada instanceof Tesoura;
    }

    @Override
    public boolean verificaSePerdi(Jogada jogada) {
        return jogada instanceof Papel;
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}
