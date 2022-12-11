package variables.types;

public class PrimitiveTypes {

	public static void main(String[] args) {
//		BYTE
        byte b = 9;
        System.out.println(b);
        
//      SHORT
        short num = 300;
        short formatadaComUnderscore = 20_000;
        System.out.println(num);
        System.out.println(formatadaComUnderscore);
        
//      INT
        int numeroInteiro = 10;
        int a = 10, c = 20, soma; // inicialização de variáveis inline
        soma = a + c; // atribuição da soma da variável a + c para a variável soma
        System.out.println(numeroInteiro);
        System.out.println(soma);
        
//      LONG
        long numA = 102040;
        long numB = 102030405060L; // adicionado L no final para indicar que estamos inserindo um valor do tipo long
        System.out.println(numA);
        System.out.println(numB);
        
//      FLOAT
        float numAa = -101.23f;
        float numBb = 2.356f;
        System.out.println(numA + numB); // -98.874
	}

}
