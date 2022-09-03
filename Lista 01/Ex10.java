import java.util.Scanner;

public class Ex10{
	
	public static void main (String[] args) {
		System.out.println("10 - Qual alternativa possui apenas nomes validos para arquivos de codigo fonte Java?");
		System.out.println("\n 1 - Fatec.java e Treinamentos.java.\n 2 - fatec.java e Treinamentos.Java.\n 3 - Fatec.JAVA e Treinamentos.java.\n 4 - FATEC.JAVA e Treinamentos.JAVA.\n 5 - Fatec.Java e Treinamentos.Java.");
		
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
			System.out.println("Resposta Errada!\n\nR: 1 - Fatec.java e Treinamentos.java.");
		}

	}
	
}

