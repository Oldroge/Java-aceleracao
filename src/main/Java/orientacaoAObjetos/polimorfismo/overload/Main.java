package orientacaoAObjetos.polimorfismo.overload;

public class Main {

  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    System.out.println("soma(int a, int b): " + calc.soma(3, 7));
    System.out.println("soma(int a, int b, int c): " + calc.soma(3, 7, 5));
    System.out.println("soma(double a, double b): " + calc.soma(3.5, 7.9));

  }

}
