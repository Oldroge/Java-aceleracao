package colections.listAndSet.set;

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
    var estudantes = Set.of("João", "Maria", "Pedro", "Rosa");
    System.out.println("usando o Set.of()");
    System.out.println(estudantes);


  }

}
