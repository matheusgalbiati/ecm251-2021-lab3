//Matheus dos Santos Galbiati   RA: 19.01324-8
//João Pedro Moura Penafiel     RA: 19.00097-9

package galbiati.matheus;

import java.util.Random;

public class Transacoes {
    Sistema sistema = new Sistema();
    //protected Contas conta;

    protected String gerarRequisicao(int idConta, String nomeUsuario, int valor) {
        int numAleatorio = getRandomNumberInRange(1000, 9999);
        //String numConvertido = Integer.toString(numAleatorio);
        //String idContaConvertido = Integer.toString(idConta);
        //String valorConvertido = Integer.toString(valor);
        //String[] resposta = {idContaConvertido, nomeUsuario, valorConvertido, numConvertido};
        //return resposta;
        return (idConta+";"+nomeUsuario+";"+valor+";"+numAleatorio);
    }

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    protected boolean transferirPara(double valor, Contas origem, Contas destino) {
        if(origem.sacar(valor, origem)) {
            destino.depositar(valor, destino);
            return true;
        }
        return false;
    }

    protected void pagarRequisicao(Contas pagador, Contas recebedor, String QRCode) {
        String[] dados = QRCode.split(";");
        String idContaDestino = dados[0];
        String usuarioDestino = dados[1];
        double valor = Double.parseDouble(dados[2]);
        if(sistema.contasCadastradas.contains(idContaDestino) && sistema.contasCadastradas.contains(usuarioDestino)){
            transferirPara(valor, pagador, recebedor);
        }
        transferirPara(valor, pagador, recebedor);
        //sistema.conta.transferirPara(valor, pagador, recebedor);
        //conta.transferirPara(valor, pagador, recebedor);
        //sistema.conta.transferirPara(valor, pagador, recebedor);
        //transferirPara(valor, pagador, recebedor);
    }

}
