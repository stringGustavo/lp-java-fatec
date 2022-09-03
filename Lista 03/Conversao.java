

public class Conversao {
	
	public static void main (String[] args) {
		//Aluno: Gustavo Sant'Anna dos Santos'
		
		System.out.println("3 - Crie um arquivo chamado Conversao.java. Crie uma variavel chamada texto do tipo String e associe a ela a sequencia de caracteres \"19.09\". Depois, faca a conversao do valor associado a essa variavel para double e armazene o resultado em uma variavel chamada numero do tipo double. Por fim, exiba o valor da variavel numero.");
		
		String texto = "19.09";
		double numero = Double.parseDouble("19.09");
		
		System.out.printf("\nString = %s\nDouble = %f", texto, numero);
		
	}
}

