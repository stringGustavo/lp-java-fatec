
public class CopiaValores {
	
	public static void main (String[] args) {
		System.out.println("5 – Crie um arquivo chamado CopiaValores.java. Implemente um programa em Java que declare uma variavel do tipo float chamada numero. Essa variavel deve ser inicializada com o valor 3.14. Depois, declare outra variavel do tipo float chamada numeroCopia. Essa variavel deve ser inicializada com uma copia do valor armazenado na variavel numero. Por fim, exiba os valores armazenados nessas variaveis na saida padrao.");
		
		float numero = 3.14f;
		float numeroCopia = numero;
		
		System.out.println("\nPrimeira variavel = "+numero+"\nCopia = "+numeroCopia);
	}
}

