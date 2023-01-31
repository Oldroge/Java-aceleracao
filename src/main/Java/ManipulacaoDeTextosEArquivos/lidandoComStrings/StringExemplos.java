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

  public void changeNameTwo(String name) {
    String nomes = "Maria Magali, Magali da Silva, Magali Medeiros";

    nomes = nomes.replaceAll("Magali", name); // Usando replaceAll

    System.out.println(nomes); // imprime: Maria Laura, Laura da Silva, Laura Medeiros
  }

  // indexOf
  public void changeSomeLetter(char letra) {
    String saudacao = "Olá, Mundo!";

    System.out.println(saudacao.indexOf(letra)); // imprime: 5
  }

  // indexOf com segundo parâmetro
  public void findSomeLetter(char letra) {
    String lorem = "Lorem ipsum dolor sit amet";

    System.out.println(lorem.indexOf(letra, 10)); // imprime: 18
  }

  // Método split
  public void harryPotterHouses() {
    String casasTexto = "Grifinória;Sonseria;Corvinal;Lufa-Lufa";
    String casas[] = casasTexto.split(";");

    for (String casa : casas)
      System.out.println(casa);
  }

  // Método split com expressões regulares
  public void harryPotterHouses2() {
    String casasTexto = "Grifinória123Sonseria456Corvinal789Lufa-Lufa";
    String casas[] = casasTexto.split("\\d+");

    for (String casa : casas)
      System.out.println(casa);
  }

}


