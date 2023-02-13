package colections.streamsOperations;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    Collection<String> nomes = List.of("Fulano", "Maria", "Fulano", "José", "José", "Joana");
    long pessoasDistintas = nomes.stream().distinct().count();
    System.out.println(pessoasDistintas);

    String firstName = nomes.stream().filter(a -> a == "Maria").collect(Collectors.toList()).get(0);
    System.out.println(firstName);


    Collection entrada2 = Stream.of("um", "dois", "três", "quatro").filter(e -> e.length() > 3)
        .peek(e -> System.out.println("Valor filtrado: " + e)).map(String::toUpperCase)
        .peek(e -> System.out.println("Valor mapeado: " + e)).collect(Collectors.toList());

    System.out.println(entrada2);
  }

}
