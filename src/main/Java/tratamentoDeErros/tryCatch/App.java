package tratamentoDeErros.tryCatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {

  public static void main(String[] args) {
    Integer resultado = 2 / 0;
    System.out.println(resultado);
    // Esse código lança um erro ArithmeticException, no caso em matemática não é possível dividir
    // um número por zero
    // além dele mesmo.

    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    // at tratamentoDeErros.tryCatch.App.main(App.java:6)

    /**
     * Tratando o erro acima com os blocos try/catch Neste caso, quando o try tentar executar o
     * código e estourar a excessão vai cair no bloco catch e fazer o tratamento de erro
     */
    try {
      Integer resultado2 = 2 / 0;
      System.out.println("Será que deu certo?");
      System.out.println(resultado2);
    } catch (ArithmeticException e) {
      System.out.println("Ops! Não é possível realizer divisão por 0");
    }

  }

  /**
   * Esse é um exemplo de método 'checked' no qual o compilador nos obriga a lançar uma excessão
   * para tratamento de erro.
   * 
   * @throws FileNotFoundException
   * @throws IOException
   */
  public static ObjectOutputStream leArquivo() throws FileNotFoundException, IOException {
    File file = new File("arquivo_nao_existe.txt");
    return new ObjectOutputStream(new FileOutputStream(file));
  }

  /**
   * Método recursivo que cria um looping infinito e estoura o erro StackOverflowError.
   * 
   * RECOMENDO NÃO EXECUTAR ESSE CÓDIGO SE VOCÊ TEM AMOR A SUA MÁQUINA.
   * 
   * @param numero
   */
  public static void teste(int numero) {
    if (numero == 0) {
      return;
    } else {
      teste(numero++);
    }
  }

}
