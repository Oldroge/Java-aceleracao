package colections.listAndSet.list;

import java.util.ArrayList;

public class Lists {

  /**
   * Listas ordenadas, são listas nas quais podem haver itens repedidos e haverá uma ordem na
   * entrada dos dados porém isso não significa em que os dados terão uma ordem como no seu valor em
   * sí, o que trás a ordem a este tipo de estrutura é o index no qual ele se refere.
   */
  public static void main(String[] args) {
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
  }

}
