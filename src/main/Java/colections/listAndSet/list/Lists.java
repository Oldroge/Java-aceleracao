package colections.listAndSet.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lists {

  /**
   * Listas ordenadas, são listas nas quais podem haver itens repedidos e haverá uma ordem na
   * entrada dos dados porém isso não significa em que os dados terão uma ordem como no seu valor em
   * sí, o que trás a ordem a este tipo de estrutura é o index no qual ele se refere.
   */
  public static void main(String[] args) {
    System.out.println("ARRAY LIST");
    var numeros = new ArrayList<Integer>();
    numeros.add(7);
    numeros.add(2);
    numeros.add(1);
    numeros.add(9);
    System.out.println(numeros); // [7, 2, 1, 9]
    /**
     * Reparando neste output, foi visto que seguiu uma ordem de entrada dos valores, ou seja, a
     * lista será lida na ordem de inserção.
     */

    /**
     * É possível ordenar os ítens dentro de uma lista de maneira comparativa, do menor para o menor
     * e vice-versa
     */
    Collections.sort(numeros); // Collections aqui não é o mesmo que a interface (Collection)
    System.out.println(numeros); // [1, 2, 7, 9]
    /**
     * Após order dessa maneira se acrescentar mais um ítem ele não entra na ordem de comparação que
     * sort atrubuí, por exemplo:
     */
    numeros.add(3); // Após o sorte estamos acrescentando mais um valor a lista
    System.out.println(numeros); // [1, 2, 7, 9, 3]

    /**
     * LIST
     */
    System.out.println("==========================");
    System.out.println("LIST");
    System.out.println("Existe diferentes formas de se declarar uma lista usando o List:");
    System.out.println("====================================================");
    System.out.println("PRIMEIRA FORMA: Arrays.asList(\"João\", \"Maria\", \"Pedro\", \"Rosa\");");
    List<String> estudantes = Arrays.asList("João", "Maria", "Pedro", "Rosa");
    System.out.println(estudantes);
    System.out.println("====================================================");
    System.out.println(
        "SEGUNDA FORMA: Arrays.asList(new String[] {\"João\", \"Maria\", \"Pedro\", \"Rosa\"});");
    List<String> estudantes2 = Arrays.asList(new String[] {"João", "Maria", "Pedro", "Rosa"});
    System.out.println(estudantes2);
    String[] arrayDeEstudantes = new String[] {"João", "Maria", "Pedro", "Rosa"};
    List<String> estudantes3 = Arrays.asList(arrayDeEstudantes);
    System.out.println("====================================================");
    System.out.println("TERCEIRA FORMA: ");
    System.out.println(
        "String[] arrayDeEstudantes = new String[] {\"João\", \"Maria\", \"Pedro\", \"Rosa\"};");
    System.out.println("List<String> estudantes3 = Arrays.asList(arrayDeEstudantes);");
    System.out.println(estudantes3);

  }

}
