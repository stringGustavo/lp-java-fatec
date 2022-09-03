import java.util.Scanner;

public class Ex19 {
	
	public static void main (String[] args) {
		System.out.println("19 - Quais sao os marcadores utilizados para inserir comentarios nos programas em Java?");
		System.out.println("\n 1 - // e %.\n 2 -  #, //, /* e */.\n 3 - //, /* e */.\n 4 - <!- - e - ->.\n 5 - % e #.");
		
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
			System.out.println("Resposta Errada!\n\nR: 3 - //, /* e */.");
		}
	}
}
