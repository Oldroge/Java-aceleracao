package tratamentoDeErros.tryCatch;

import java.util.Optional;

public class OptionalExample {

  public static void main(String[] args) {
    Optional<Pessoa> optional = Optional.empty();
    if (optional.isPresent()) {
      System.out.println("Pessoa existe");
    } else {
      System.out.println("Pessoa não existe");
    }

  }

}
