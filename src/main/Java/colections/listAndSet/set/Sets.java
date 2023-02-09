package colections.listAndSet.set;

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

  }

}
