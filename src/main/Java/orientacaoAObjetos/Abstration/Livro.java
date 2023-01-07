package orientacaoAObjetos.Abstration;

public class Livro {
  String titulo;
  int numeroDePaginas;
  String isbn;

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
