//Matheus dos Santos Galbiati   RA: 19.01324-8
//João Pedro Moura Penafiel     RA: 19.00097-9

package galbiati.matheus;

public class Usuarios {
    private String nome;
    private String senha;
    private String email;

    public Usuarios(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
