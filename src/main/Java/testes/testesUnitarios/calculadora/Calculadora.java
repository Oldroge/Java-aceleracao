package testes.testesUnitarios.calculadora;

public class Calculadora {
  public int somar(int x, int y) {
    return x + y;
  }

  public int subtrair(int x, int y) {
    return x - y;
  }

  public int dividir(int x, int y) {

    if (verificarDividendo(y)) {
      return x / y;
    } else {
      return 0;
    }

  }

  // verifica se o dividendo é diferente de zero
  public boolean verificarDividendo(int y) {
    if (y == 0) {
      return false;
    } else {
      return true;
    }
  }

}
