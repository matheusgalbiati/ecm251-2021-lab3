package br.maua;

import br.maua.model.Item;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Item> itens = new ArrayList<>();
	    File file = new File("dados.txt");
	    //Realiza a leitura do conteudo desse arquivo
        try {
            //Cria elemento para iterar pelo arquivo
            Scanner scanner = new Scanner(file);
            //Passa por todos os elementos do arquivo
            while(scanner.hasNext()){
                String linha = scanner.nextLine();
                itens.add(Item.pegaItem(linha));
            }
            //Exibiu um resumo de dados
            exibeResumo(itens);
            //Cria um arquivo com o resumo dos dados
            criarNota(itens);
        }
        catch (Exception exception){
            System.out.println("Algo deu errado");
        }
    }

    private static void criarNota(List<Item> itens) throws Exception{
        //Cria um novo arquivo, sobreescrevendo o anterior
        //FileWriter fileWriter = new FileWriter("nota.txt");
        //Adiciona no fim do arquivo
        FileWriter fileWriter = new FileWriter("nota.txt",true);
        fileWriter.write("=== Resumo Pedido ==="+"\n");
        fileWriter.append("Total de Items:" + itens.size()+"\n");
        double total = 0;
        fileWriter.append("Items:"+"\n");
        for (Item item : itens) {
            fileWriter.append(item.nome+"\t"+item.preco+"\n");
            total += item.preco;
        }
        fileWriter.append("Total do pedido:" + total+"\n");
        //Fechar o arquivo!
        fileWriter.close();
    }

    private static void exibeResumo(List<Item> itens) {
        System.out.println("=== Resumo Pedido ===");
        System.out.println("Total de Items:" + itens.size());
        double total = 0;
        System.out.println("Items:");
        for (Item item : itens) {
            System.out.println(item.nome+"\t"+item.preco);
            total += item.preco;
        }
        System.out.println("Total do pedido:" + total);
    }
}
