
public class ValorNull{
	
	public static void main (String[] args) {
		System.out.println("6L2 – Crie um arquivo chamado ValorNull.java. Implemente um programa em Java que declare uma variavel do tipo Double chamada numero. Essa variavel deve ser inicializada com o valor 3.14. Exiba o valor dessa variavel na saida padrao. Depois, armazene o valor null na variavel numero. Por fim, exiba novamente o valor dessa variavel na saida padrao.");
		
		double numero = 3.14;
		
		System.out.println("\nValor da variavel = "+numero);
		
		numero -= numero;
		
		System.out.println("\nValor da variavel anulado = "+numero);
	}
}

