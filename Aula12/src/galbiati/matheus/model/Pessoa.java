package galbiati.matheus.model;

/**
 * Representação de uma pessoa por seu nome e cpf
 */
public class Pessoa {
    final private String nome;
    final private String cpf;

    /**
     * Construtor para inicializar a pessoa
     * @param nome nome atribuído a pessoa
     * @param cpf cpf atribuído a pessoa
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Método que representa o estado do objeto pessoa
     * @return String com nome e cpf
     */
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
