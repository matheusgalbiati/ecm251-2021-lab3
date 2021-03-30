//Matheus dos Santos Galbiati   RA: 19.01324-8
//João Pedro Moura Penafiel     RA: 19.00097-9

package galbiati.matheus;

import java.util.Random;

public class Transacoes {

    protected String[] geraRequisicao(int idConta, String nomeUsuario, int valor) {
        int numAleatorio = getRandomNumberInRange(1000, 9999);
        String numConvertido = Integer.toString(numAleatorio);
        String idContaConvertido = Integer.toString(idConta);
        String valorConvertido = Integer.toString(valor);
        String[] resposta = {idContaConvertido, nomeUsuario, valorConvertido, numConvertido};
        return resposta;
    }

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
