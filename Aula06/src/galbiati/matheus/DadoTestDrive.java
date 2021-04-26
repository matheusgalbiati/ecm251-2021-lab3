package galbiati.matheus;

public class DadoTestDrive {
    public static void main(String[] args) {
        Dado d1 = new Dado(6);
        System.out.println("Primeiro Leitura:" + d1.pegarFaceAtual());
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero sorteado:" + d1.sortearNumero());
            System.out.println("Face Atual:" + d1.pegarFaceAtual());
        }
    }
}
