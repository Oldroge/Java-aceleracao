package tratamentoDeErros.tryCatch;

import java.util.Optional;

public class OptionalExample {

  public static void main(String[] args) {
    // Tratando erros de objetos nulos com o Optional vazio
    // Desta forma conseguimos identificar se o objeto existe.
    Optional<Pessoa> optional = Optional.empty();
    if (optional.isPresent()) {
      System.out.println("Pessoa existe");
    } else {
      System.out.println("Pessoa não existe");
    }

    // Tratando objetos nullos com ofNullable, passando uma instancia
    // desta maneira consegue identificar se de fato existe algo dentro do objeto instanciado.
    Pessoa pessoa2 = new Pessoa("Bob");
    Optional<Pessoa> optional2 = Optional.ofNullable(pessoa2);
    if (optional2.isPresent()) {
      System.out.println("Pessoa existe");
    } else {
      System.out.println("Pessoa não existe");
    }

  }

}
