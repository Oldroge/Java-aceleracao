package colections.map;

import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    /**
     * Usando o HashMap para criar dicionários de chave e valor
     */
    var estudantes = new HashMap<String, String>();
    /**
     * Com o método .put(key, value), adiciona novas chaves e valores
     * no dicionário 'estudantes'.
     */
    estudantes.put("x038702", "João");
    estudantes.put("x784244", "Maria");
    estudantes.put("x105852", "Joana");
    String valorAnterior = estudantes.put("x038702", "José"); // Mesma matricula usada no mapeamento com João
    System.out.println("Valor anterior de x038702: " + valorAnterior); // valorAnterior imprime o valor substituído
    System.out.println("Estudantes: " + estudantes); // {x038702=José, x105852=Joana, x784244=Maria}

    /**
     * Leitura de um valor que pertence a uma chave específica usando o
     * método .get(key);
     */
    System.out.println("Chave x038702: " + estudantes.get("x038702"));
  }
}