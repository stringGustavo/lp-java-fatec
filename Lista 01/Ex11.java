import java.util.Scanner;

public class Ex11 {
	
	public static void main (String[] args) {
		System.out.println("11 - Qual o comando utilizado para executar o compilador da linguagem Java?");
		System.out.println("\n 1 - javaC.\n 2 - javac.\n 3 - java-compiler.\n 4 - java.\n 5 - jc.");
		
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
		
		if (num == 2){
			System.out.println("Resposta Certa!");
		}
		else {
			System.out.println("Resposta Errada!\n\nR: 2 - javac.");
		}
		
		
		
	}
}

