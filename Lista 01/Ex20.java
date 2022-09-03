import java.util.Scanner;

public class Ex20 {
	
	public static void main (String[] args) {
		System.out.println("20 - Considere o seguinte programa em Java:");
		System.out.println("\nclass Argumentos {\n\tpublic static void main(String[] args) {\n\t\tSystem.out.println(args[0]);\n\t\tSystem.out.println(args[1]);\n\t}\n}");
		System.out.println("\nO que seria exibido na saida padrao se a classe Argumentos fosse executada com o seguinte comando?\n\n\n\t\t\t\tComando: java Argumentos Fatec Livros\n");
		System.out.println("\n 1 - java e Argumentos.\n 2 - Argumentos e Fatec.\n 3 - Fatec e Livros.\n 4 - java e Fatec.\n 5 - Argumentos e Livros");
		
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
		
		if (num == 3){
			System.out.println("Resposta Certa!");
		}
		else {
			System.out.println("Resposta Errada!\n\nR: 3 - Fatec e Livros.");
		}
	}
}
