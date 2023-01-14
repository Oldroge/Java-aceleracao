package orientacaoAObjetos.gettersAndSetters.setters;

public class Main {
  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();

    calculadora.setPrimeiroNumero(10);
    calculadora.setSegundoNumero(5);

    System.out.println("Resultado da multiplicação é: " + calculadora.multiplicar());
  }
}
