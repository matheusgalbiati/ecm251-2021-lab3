//Matheus dos Santos Galbiati   RA: 19.01324-8
//João Pedro Moura Penafiel     RA: 19.00097-9

package galbiati.matheus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contas {
    protected int idConta;
    protected double saldo;
    protected Usuarios usuarios;
    protected Transacoes transacoes;
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

    protected void depositar(double valor, Contas destino) {
        destino.saldo += valor;
    }

    protected boolean sacar(double valor, Contas origem) {
        if (origem.saldo >= valor) {
            origem.saldo -= valor;
            return true;
        }
        return false;
    }



//    protected boolean transferirPara(double valor, Contas origem, Contas destino) {
//        if(origem.sacar(valor, origem)) {
//            destino.depositar(valor, destino);
//            return true;
//        }
//        return false;
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
