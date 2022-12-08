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
        soma = a + c; // atribuição da soma da variável a + b para a variável soma
        System.out.println(numeroInteiro);
        System.out.println(soma);
	}

}
