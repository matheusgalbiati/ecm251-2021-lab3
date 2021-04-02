//Matheus dos Santos Galbiati   RA: 19.01324-8
//João Pedro Moura Penafiel     RA: 19.00097-9

//Material de referencia: aulas de Linguagens de Programação I

package galbiati.matheus;

import java.util.Random;

public class Transacoes {

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    protected String gerarRequisicao(int idConta, String nomeUsuario, int valor) {
        int numAleatorio = getRandomNumberInRange(1000, 9999);
        return (idConta+";"+nomeUsuario+";"+valor+";"+numAleatorio);
    }

    protected void pagarRequisicao(Contas pagador, Contas recebedor, String QRCode) {
        String[] dados = QRCode.split(";");
        String idContaDestino = dados[0];
        String usuarioDestino = dados[1];
        double valor = Double.parseDouble(dados[2]);
        if(idContaDestino.equals(""+recebedor.idConta) && usuarioDestino.equals(recebedor.usuarios.nome)){
            pagador.transferirPara(recebedor, valor);
        }
    }

}
