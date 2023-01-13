package orientacaoAObjetos.Abstration;

public class Livro {
  private String titulo;
  private int numeroDePaginas;
  private String isbn;

  public Livro(String message) {
    System.out.println(message);
  }

  public Livro(int num) {
    System.out.println(num);
  }

  public int retornarNumeroDePaginas() {
    return numeroDePaginas;
  }
}
