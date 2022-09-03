
public class ExibeNome {
	
	public static void main (String[] args) {
		System.out.println("3 - Crie um arquivo chamado ExibeNome.java. Implemente um programa em Java que declare uma variavel do tipo String chamada nome. Essa variavel deve ser associada o seu nome. Ele deve ser escrito entre aspas. Por fim, exiba o valor associado a essa variavel na saida padrao.");
		
		System.out.print("\nDigite seu nome: ");
		String nome = System.console().readLine();
		
		System.out.println("\nO nome digitado foi: "+nome);
	}
}

