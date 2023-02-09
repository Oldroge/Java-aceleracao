package colections.listAndSet.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

  public static void main(String[] args) {
    var numeros = new TreeSet<Integer>();
    numeros.add(7);
    numeros.add(2);
    numeros.add(7);
    numeros.add(9);
    numeros.add(88);
    numeros.add(1);
    numeros.add(10);
    System.out.println(numeros);

    System.out.println("====================================");
    System.out.println("Manipulando o Set:");
    /**
     * Manipular o Set tem semalhaças ao manipular um list, inclusivo nos seus métodos, por exemplo:
     */
    var estudantes = Set.of("João", "Maria", "Pedro", "Rosa"); // imutável
    System.out.println("usando o Set.of()");
    System.out.println(estudantes);

    /**
     * Ao adicionar um novo elemento dentro de uma lista HashSet, a variável onde armazena a adição
     * retorna um booleano.
     */
    System.out.println("====================================");
    System.out.println("Manipulando o HashSet:");
    var estudantes2 = new HashSet<>();
    var adicionouJoao = estudantes2.add("João");// true
    var adicionouJoaoDeNovo = estudantes2.add("João"); // false
    var adicionouMaria = estudantes2.add("Maria"); // true
    System.out.println(String.format("adicionouJoao: %b", adicionouJoao));
    System.out.println(String.format("adicionouJoaoDeNovo: %b", adicionouJoaoDeNovo));
    System.out.println(String.format("adicionouMaria: %b", adicionouMaria));


    System.out.println("====================================");
    System.out.println("Removendo itens na lista do HashSet:");
    /**
     * O hashSet possui uma peculiaridade, não garante a ordem dentro da lista, sendo assim, não
     * possui o index logo, algumas operações como possui no ArrayList, adicionar um item através do
     * index, deixa de fazer sentido. A remoção se faz da mesma maneira como no list:
     */
    var estudantes3 = new HashSet<>();
    estudantes3.add("João");
    estudantes3.add("Maria");
    System.out.println(estudantes3); // ["João", "Maria"];
    estudantes3.remove("João");
    System.out.println(estudantes3); // ["Maria"];

    System.out.println("====================================");
    System.out.println("Medindo o tamanho de uma lista HashSet com size:");

    var estudantes4 = new HashSet<>();
    estudantes4.add("João");
    estudantes4.add("Maria");
    System.out.println(estudantes4.size());
  }

}
