//Matheus dos Santos Galbiati   RA: 19.01324-8
//João Pedro Moura Penafiel     RA: 19.00097-9

package galbiati.matheus;

public class Contas {
    private int idConta;
    private double saldo;
    private Usuarios usuarios;
    //private int contador=0;

    public Contas(int idConta, double saldo, String nome, String senha, String email) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuarios = new Usuarios(nome, senha, email);
    }

//    protected void criarConta(String nome, String senha, String email) {
//        this.contador += 1;
//        new Contas(contador, 0.0, nome, senha, email);
//    }


    @Override
    public String toString() {
        return "Contas{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                ", usuarios=" + usuarios +
                '}';
    }
}
