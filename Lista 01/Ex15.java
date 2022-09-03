import java.util.Scanner;

public class Ex15 {
	
	public static void main (String[] args) {
		System.out.println("15 - Para verificar a versao do compilador Java ou do ambiente de execucao Java, qual opcao podemos utilizar ao executar os comandos javac ou java?");
		System.out.println("\n 1 - -version.\n 2 - -v\n 3 - -ver.\n 4 - -versao\n");
		
		Scanner resposta = new Scanner(System.in);
		System.out.print("\nDigite a Resposta: ");
		int num = resposta.nextInt();
		
		while (num < 1 || num > 4){
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
			System.out.println("Resposta Errada!\n\nR: 1 - -version");
		}
	}
}
