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
    System.out.println(
        "PRIMEIRA FORMA: List<String> estudantes = Arrays.asList(\"João\", \"Maria\", \"Pedro\", \"Rosa\");");
    List<String> estudantes = Arrays.asList("João", "Maria", "Pedro", "Rosa");
    System.out.println(estudantes);
    System.out.println("====================================================");
    System.out.println(
        "SEGUNDA FORMA: List<String> estudantes2 = Arrays.asList(new String[] {\"João\", \"Maria\", \"Pedro\", \"Rosa\"});");
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

    System.out.println("====================================================");
    System.out.println("LISTAS IMUTÁVEIS: List.of(\"João\", \"Maria\", \"Pedro\", \"Rosa\"););");
    var estudantes4 = List.of("João", "Maria", "Pedro", "Rosa");
    System.out.println(estudantes4);
    // estudantes4.add("Roge"); // aqui vai gerar um erro de UnsupportedOperationException
    // System.out.println(estudantes4);
    /**
     * Exception in thread "main" java.lang.UnsupportedOperationException at
     * java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142) at
     * java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
     * at colections.listAndSet.list.Lists.main(Lists.java:70)
     */

    // Em todas as listas para conseguir capturar um valor dentro de uma lista atráves do seu indíce
    // se usa
    // o método .get(int index);
    String pedro = estudantes.get(2);
    System.out.println(pedro);

    System.out.println("====================================================");
    System.out.println("ALTERANDO ITENS EM UM ARRAY:");
    estudantes.set(0, "Marina");
    System.out.println(estudantes);
    // O array.asList retorna um array de tamanho fixo, porém com valores mutáveis, qualquer
    // tentativa de adicionar um
    // item novo ao final do array retorna um erro. Mas é possível alterar qualquer um dos valores
    // já existentes no array.
    // Se for necessário adicionar ou remover elementos de uma lista é possível através de um
    // ArrayList, por exemplo:
    System.out.println("====================================================");
    System.out.println("ADICIONANDO ITENS EM UM ARRAY:");
    var estudantes5 = new ArrayList<String>(Arrays.asList("João", "Maria", "Pedro", "Rosa"));
    estudantes5.add("Joana");
    System.out.println(estudantes5);


  }

}
