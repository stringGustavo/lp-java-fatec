import java.util.Scanner;

public class Ex18 {
	
	public static void main (String[] args) {
		System.out.println("18 - Qual sequencia de escape indica uma \"quebra de linha\"? ");
		System.out.println("\n 1 - \\n.\n 2 - \\r.\n 3 - \\f.\n 4 - \\t.\n 5 - \\b.");
		
		Scanner resposta = new Scanner(System.in);
		System.out.print("\nDigite a Resposta: ");
		int num = resposta.nextInt();
		
		while (num < 1 || num > 5){
			System.out.println("ERRO 01 - Resposta invalida, tente novamente.\n");
			resposta = new Scanner(System.in);
			System.out.print("Digite a Resposta: ");
			num = resposta.nextInt();
		}
		System.out.println("\nSua resposta foi: "+num);
		
		if (num == 1){
			System.out.println("Resposta Certa!");
		}
		else {
			System.out.println("Resposta Errada!\n\nR: 1 - \\n.");
		}
	}
}
