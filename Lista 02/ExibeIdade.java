import java.util.Scanner;

public class ExibeIdade {
	
	public static void main (String[] args) {
		System.out.println("1 - Crie um arquivo chamado ExibeIdade.java. Implemente um programa em Java que declare uma variavel do tipo int\nchamada idade. Essa variavel deve ser inicializada com o valor da sua idade. Por fim, exiba o valor dessa variavel\nna saida padrao.\n");
		
		Scanner idadeDoUsuario = new Scanner (System.in);
		System.out.print("Digite sua idade: ");
		int idade = idadeDoUsuario.nextInt();
		
		System.out.println("\nVoce tem "+idade+" Anos!");
		
		 
		
		
	}
}

