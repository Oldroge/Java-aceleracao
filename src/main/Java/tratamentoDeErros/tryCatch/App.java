package tratamentoDeErros.tryCatch;

public class App {

  public static void main(String[] args) {
    Integer resultado = 2 / 0;
    System.out.println(resultado);
    // Esse código lança um erro ArithmeticException, no caso em matemática não é possível dividir
    // um número por zero
    // além dele mesmo.

    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    // at tratamentoDeErros.tryCatch.App.main(App.java:6)

  }

}
