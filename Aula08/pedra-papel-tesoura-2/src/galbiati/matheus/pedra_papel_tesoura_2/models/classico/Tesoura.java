package galbiati.matheus.pedra_papel_tesoura_2.models.classico;

import galbiati.matheus.pedra_papel_tesoura_2.models.Jogada;
import galbiati.matheus.pedra_papel_tesoura_2.models.bazinga.Lagarto;
import galbiati.matheus.pedra_papel_tesoura_2.models.bazinga.Spoke;

public class Tesoura extends Jogada {
    @Override
    public Jogada[] jogadasQueGanho() {
        return new Jogada[]{new Lagarto(), new Papel()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[] {new Pedra(), new Spoke()};
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
