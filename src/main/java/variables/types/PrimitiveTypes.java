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
        
//      DOUBLE
        double varDouble = 2.356; // double inicializado naturalmente
        double doubleRecebendoFloat = 1.409F; // double aceitando número float
        double doubleRecebendoLong = 12930L; // double aceitando número long
        System.out.println(doubleRecebendoFloat); // 1.409000039100647
        System.out.println(doubleRecebendoLong); // 12930.0
        
//      BOOLEAN
        boolean isBoolean = true; // outros exemplos: isGreaterThan, isFlexible, isStarted
        boolean ehNumero = false; // outros exemplos: ehMaiorDeIdade, ehCedo, ehValido
        
//      CHAR
        char letraA = 'a';
        char letraAMaiuscula = 'A';
        System.out.println(letraA); // a
        System.out.println(letraAMaiuscula); // A
        
//      STRING
        String frase = "Estou aprendendo Java!";
        String numeros = "09890";
        String caractere = "a";
        
//      CONCATENAR STRING
        String eu = "Eu";
        String ja = " já";
        String sei = " sei";
        String usar = " usar";
        String strings = " Strings";
        String em = " em";
        String java = " Java";

        String frase1 = eu + ja + sei + usar + strings + em + java;
        System.out.println(frase1); // Eu já sei usar Strings em Java
        
//      STRING BUILDER
        StringBuilder stringBuilder = new StringBuilder();
        String eu1 = "Eu";
        String ja1 = " já";
        String sei1 = " sei";
        String usar1 = " usar";
        String strings1 = " Strings";
        String em1 = " em";
        String java1 = " Java";

        String frase2 = stringBuilder.append(eu1)
                .append(ja1)
                .append(sei1)
                .append(usar1)
                .append(strings1)
                .append(em1)
                .append(java1)
                .toString();
        System.out.println(frase2); // Eu já sei usar Strings em Java
        
//      ARRAYS
        int[] arrayDeInteiros = new int[9];
        arrayDeInteiros[0] = 40;
        arrayDeInteiros[1] = 55;
        arrayDeInteiros[2] = 63;
        arrayDeInteiros[3] = 17;
        arrayDeInteiros[4] = 22;
        arrayDeInteiros[5] = 68;
        arrayDeInteiros[6] = 89;
        arrayDeInteiros[7] = 97;
        arrayDeInteiros[8] = 89;

        System.out.println(arrayDeInteiros[8]); // 89
        System.out.println(arrayDeInteiros[2]); // 63

        arrayDeInteiros[9] = 89; // Estoura a pilha porque tentamos inserir um valor em um espaço inexistente do array
	}

}
