package orientacaoAObjetos.gettersAndSetters;

public class Main {
  public static void main(String[] args) {
    Carro carro = new Carro("QQ", "Cherry", 2011);

    System.out.println("O nome do carro é: " + carro.getNome());
    System.out.println("A montadora é: " + carro.getMontadora());
    System.out.println("O ano do carro é: " + carro.getAno());
  }

}
