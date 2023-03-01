package testes.testesUnitarios.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
  @Test
  public void testeSomar() {
    Calculadora cal = new Calculadora();
    assertEquals(34, cal.somar(32, 2));
  }

  @Test
  public void testeSubtrair() {
    Calculadora cal = new Calculadora();
    assertEquals(1, cal.subtrair(3, 2));
  }

  @Test
  public void testeDividir() {
    Calculadora cal = new Calculadora();
    assertEquals(1.5, cal.dividir(3, 2));
  }

}
