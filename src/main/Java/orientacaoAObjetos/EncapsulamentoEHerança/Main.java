package orientacaoAObjetos.EncapsulamentoEHerança;

public class Main {

  public static void main(String[] args) {
    Caminhao caminhao = new Caminhao("ARF1QZ", "Marcelo", "Preto");
    Carro carro = new Carro("ARS6TZ", "Juliano", "Branco");
    Moto moto = new Moto("BRF7TC", "Fabrício", "Laranja");

    System.out.println("A cor do caminhão: " + caminhao.getCor());
    System.out.println("A Placa da moto: " + moto.getPlaca());
    System.out.println("O nome do motorista: " + carro.getMotorista());

  }

}
