package galbiati.matheus.pedra_papel_tesoura_2.models.bazinga;

import galbiati.matheus.pedra_papel_tesoura_2.models.Jogada;
import galbiati.matheus.pedra_papel_tesoura_2.models.classico.Papel;
import galbiati.matheus.pedra_papel_tesoura_2.models.classico.Pedra;
import galbiati.matheus.pedra_papel_tesoura_2.models.classico.Tesoura;

public class Spoke extends Jogada {
    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[] {new Papel(), new Lagarto()};
    }

    @Override
    public String toString() {
        return "Spoke";
    }
}
