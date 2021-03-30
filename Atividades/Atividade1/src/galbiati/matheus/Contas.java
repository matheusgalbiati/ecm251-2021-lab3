//Matheus dos Santos Galbiati   RA: 19.01324-8
//João Pedro Moura Penafiel     RA: 19.00097-9

package galbiati.matheus;

import java.util.Scanner;

public class Contas {
    protected int idConta;
    protected double saldo;
    protected Usuarios usuarios;
    private Scanner scanner;
    private int contador=0;

    public Contas(int idConta, double saldo, String nome, String senha, String email) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuarios = new Usuarios(nome, senha, email);
    }

    protected double getSaldo(int idConta) {
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

    @Override
    public String toString() {
        return "Contas{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                ", usuarios=" + usuarios +
                '}';
    }
}
