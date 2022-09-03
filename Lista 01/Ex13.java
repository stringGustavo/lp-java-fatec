import java.util.Scanner;

public class Ex13 {
	
	public static void main (String[] args) {
		System.out.println("13 - Qual a extensao dos arquivos que armazenam codigo compilado de um programa Java?");
		System.out.println("\n 1 - .java.\n 2 - .class.\n 3 - .exe.\n 4 - .prog\n 5 - .sh.");
		
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
			System.out.println("Resposta Errada!\n\nR: 2 - .class.");
		}
	}
}
