package colections.streams;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Collection<Estudante> entrada = CodeExample.obterEntrada();
    List<String> matriculas = entrada.stream().filter(e -> "Computação".equals(e.getCurso()))
        .sorted(Comparator.comparing(Estudante::getNome)).map(Estudante::getMatricula)
        .collect(Collectors.toList());
    System.out.println(matriculas);
  }

}
