import java.util.Scanner;

public class Ex12 {
	
	public static void main (String[] args) {
		System.out.println("12 - Qual é o comando utilizado para executar um programa Java?");
		System.out.println("\n 1 - javac.\n 2 - JAVA.\n 3 - java.\n 4 - java-run.\n 5 - jvm.");
		
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
			System.out.println("Resposta Errada!\n\nR: 3 - java.");
		}
		
		
		
	}
}
