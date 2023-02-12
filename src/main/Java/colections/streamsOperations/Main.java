package colections.streamsOperations;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Collection<String> nomes = List.of("Fulano", "Maria", "Fulano", "José", "José", "Joana");
    long pessoasDistintas = nomes.stream().distinct().count();
    System.out.println(pessoasDistintas);

    String firstName = nomes.stream().filter(a -> a == "Maria").collect(Collectors.toList()).get(0);
    System.out.println(firstName);
  }

}
