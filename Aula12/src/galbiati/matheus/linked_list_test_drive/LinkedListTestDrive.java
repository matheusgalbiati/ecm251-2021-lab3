package galbiati.matheus.linked_list_test_drive;

import galbiati.matheus.model.Pessoa;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(new Pessoa("Batman","001"));
        pessoas.add(new Pessoa("Superman","002"));
        pessoas.add(new Pessoa("Mutano","056"));
        pessoas.addFirst(new Pessoa("Ravena","000"));

        System.out.println("====================");
        System.out.println("Passa por toda a ListaLigada:");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        System.out.println("====================");
        System.out.println("Passa por toda a ListaLigada Iterator:");
        Iterator<Pessoa> iterator = pessoas.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
