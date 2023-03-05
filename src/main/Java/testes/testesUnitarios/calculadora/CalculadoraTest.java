package testes.testesUnitarios.calculadora;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe que testa a calculadora")
class CalculadoraTest {
  @Test
  @DisplayName("testa o método somar")
  public void testeSomar() {
    Calculadora cal = new Calculadora();
    assertEquals(34, cal.somar(32, 2));
  }


  @Test
  @DisplayName("Testa o método subtrair")
  public void testeSubtrair() {
    Calculadora cal = new Calculadora();
    assertEquals(1, cal.subtrair(3, 2));
  }

  @Test
  @DisplayName("testa o método que verifica o dividendo")
  public void testeVerificarDividendo() {
    Calculadora cal = new Calculadora();
    assertTrue(cal.verificarDividendo(5));
  }

  @DisplayName("testando o método dividir")
  public void testeDividir() {
    Calculadora cal = new Calculadora();
    assertEquals(3, cal.dividir(6, 2));
  }

  @DisplayName("testando a exceção do método dividir...")
  public void testeDividirExcecao() {
    Calculadora cal = new Calculadora();
    assertThrows(ArithmeticException.class, () -> {
      cal.dividir(3, 0);
    });
  }



}
