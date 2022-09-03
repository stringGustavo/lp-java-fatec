import java.util.Scanner;

public class Ex17 {
	
	public static void main (String[] args) {
		System.out.println("17 - Qual codigo pode ser utilizado para exibir a mensagem Fatec em Java?");
		System.out.println("\n 1 - system.out.println(\"Fatec\");.\n 2 - System.out.println(\"Fatec\");.\n 3 - System.Console.WriteLine(\"Fatec\");.\n 4 - system.console.writeLine(\"Fatec\");.\n 5 - print(\"Fatec\");.");
		
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
			System.out.println("Resposta Errada!\n\nR: 2 - System.out.println(\"Fatec\");.");
		}
	}
}
