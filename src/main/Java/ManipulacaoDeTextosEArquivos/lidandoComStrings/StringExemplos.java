package ManipulacaoDeTextosEArquivos.lidandoComStrings;

public class StringExemplos {

  public String getNumeralConta(String contaFormatada) {
    return contaFormatada.replace('X', '0');
  }

  public void changeName(String name) {
    String nomes = "Maria Magali, Magali da Silva, Magali Medeiros";
    nomes = nomes.replace("Magali", name);


    System.out.println(nomes); // imprime: Maria Magali, Magali da Silva,
                               // Magali Medeiros
  }

}


