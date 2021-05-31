package br.maua.maps;

import br.maua.models.Item;

import java.util.HashMap;
import java.util.Map;

public class HashMapTestDrive {
    public static void main(String[] args) {
        Map<String, Item> itemMap = new HashMap<>();

        //Adiciona elementos no HashMap
        itemMap.put("Item1", new Item("Maca", 1));
        itemMap.put("Item2", new Item("Pera", 2));
        itemMap.put("Item3", new Item("Maca", 1));
        itemMap.put("Item1", new Item("Banana", 3));

        itemMap.forEach((chave, valor) -> System.out.println("Chave:"+chave+"\tValor:"+valor));

        System.out.println(itemMap);

        //Recuperação dos itens do Mapa
        Item item = itemMap.get("Item1");
        System.out.println(item);
        item = itemMap.get("Item10");
        System.out.println(item);
        item = itemMap.getOrDefault("Item10", new Item("Vegeta", 100));
        System.out.println(item);
        System.out.println(itemMap);
    }
}
