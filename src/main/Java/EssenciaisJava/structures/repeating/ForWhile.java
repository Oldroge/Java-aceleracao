package EssenciaisJava.structures.repeating;
import java.util.Random;

public class ForWhile {
	public static void main(String[] args) {
	//WHILE
	// Cria um array com os inscritos
		String[] inscritos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA", "JOAO", "FELIPE", "LUCIA", "ANTONIO", "FERNANDA",
				"MARCELA", "VITOR", "BEATRIZ", "JORGE", "JULIA" };

		// Determina o número máximo de vagas
		final int numeroVagas = 10;
		// A palavra `final` determina que o valor dessa variável não é alterável, ele
		// passa a ser uma constante!

		// Criamos um vetor vazio com espaço igual ao número de vagas. Não se preocupe
		// se não entender a sintaxe 100% — em breve entenderá!
		String[] vagas = new String[numeroVagas];

		// Determinamos quantas vagas já foram preenchidas
		int vagaAtual = 0;

		// Percorremos todos inscritos e adicionamos nas vagas até que o número
		// total de vagas seja preenchido
		String inscrito = "Indefinido";
		String log;

		while (vagaAtual < numeroVagas) {
			inscrito = inscritos[vagaAtual];
			log = "Adicionando a inscrição: " + inscrito + " Na vaga: " + (vagaAtual + 1) + "|n"; 
			vagas[vagaAtual] = inscrito;
			vagaAtual += 1;
			System.out.println(log);
		}
		
	//FOR

		int numero;
		String log2;
		
		// Leia como: PARA numero = 1, contanto que numero <= 10, faça o loop e depois
		// faça numero += 1!
		for (numero = 1; numero <= 10; numero += 1) {
			log2 = "O Número atual é: " + numero + "|n";
			System.out.println(log2);
		}
		
//	FOR COM ARRAYS
	// Cria um vetor com 4 alunos
		String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };
		String log3;

		// Pega o total de alunos existentes no vetor
		int totalAlunos = alunos.length;

		// Nossa variável 'log' não é muito útil agora, mas serve para registrarmos o
		// que está acontecendo! ✌️
		log3 = "A lista de chamadas possui " + totalAlunos + " alunos|n";

		// Imprime a lista de chamadas. Note que você pode declarar a variável posição
		// dentro do for!
		int matricula;
		for (int posicao = 0; posicao < totalAlunos; posicao++) {
			matricula = posicao + 1;
			log3 = "Matricula: " + matricula + " Aluno: " + alunos[posicao] + "|n";
			System.out.println(log3);
		}
		
//	FOR COM OUTRA SINTAXE
		for (String nome : alunos) {
			System.out.println(nome);
		}
		
//	DO/WHILE
		int tentativas = 0;
		int atendeu = 0;
		String log4;

		do {
			log4 = "Ligando para candidato selecionado ...|n";
			// O código abaixo nos dá um numero aleatório entre 0 e 2.
			atendeu = new Random().ints(0, 2).findFirst().getAsInt();
			tentativas += 1;
		} while (atendeu == 0 && tentativas < 3);

		log4 = "Candidato atendeu na tentativa: " + tentativas;
		System.out.println(log4);
	}
}
