package orientacaoAObjetos.Abstration;

public class Main {
  public static void main(String[] args) {
    Livro livro = new Livro("asd");
    int numeroDePaginas = livro.retornarNumeroDePaginas();
    System.out.println(numeroDePaginas);
  }
}
