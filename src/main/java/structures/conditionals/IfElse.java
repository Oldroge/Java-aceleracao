package structures.conditionals;

public class IfElse {
	public static void main(String[] args) {
		double mediaFinal = 7.5;
		String resultado = "Indefinido";
		
		if (mediaFinal >= 7) {
			resultado = "Aprovada";
		} else if (mediaFinal == 6.0) {
			resultado = "Realizar prova bonus";
		}
		else {
			resultado = "Reprovada";
		}
	}
}
