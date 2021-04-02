//Matheus dos Santos Galbiati   RA: 19.01324-8
//João Pedro Moura Penafiel     RA: 19.00097-9

//Material de referencia: aulas de Linguagens de Programação I e apostila java Caelum

package galbiati.matheus;

import java.util.Scanner;

public class Contas {
    private Scanner scanner;

    protected int idConta;
    protected double saldo;
    protected Usuarios usuarios;
    private static int totalDeContas;

    Transacoes transacoes = new Transacoes();


    public Contas() {
        this.scanner = new Scanner(System.in);
    }

    public Contas(int idConta, double saldo, Usuarios usuarios) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuarios = usuarios;
    }

    protected Contas criaConta(double saldoInicial, String nome, String senha, String email) {
//        System.out.println("Informe o nome:");
//        String nome = scanner.next();
//        System.out.println("Crie uma senha:");
//        String senha = scanner.next();
//        System.out.println("Informe o e-mail:");
//        String email = scanner.next();
        Usuarios novoUsuario = new Usuarios(nome, senha, email);
        Contas.totalDeContas += 1;
        Contas novaConta = new Contas(Contas.totalDeContas, saldoInicial, novoUsuario);
        return novaConta;
    }

    protected double getSaldo() {
        return this.saldo;
    }

    protected void depositar(double valor) {
        this.saldo += valor;
    }

    protected boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    protected boolean transferirPara(Contas destino, double valor) {
        if(this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Contas{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                ", usuarios=" + usuarios.toString() +
                '}';
    }
}
