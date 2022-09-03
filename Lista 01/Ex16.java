import java.util.Scanner;

public class Ex16 {
	
	public static void main (String[] args) {
		System.out.println("16 - Qual alternativa declara corretamente o metodo main?");
		System.out.println("\n 1 - public static main(String[] args).\n 2 - public static void Main(String[] args).\n 3 - void main(String[] args).\n 4 - static void Main().\n 5 - public static void main(String[] args).");
		
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
		
		if (num == 5){
			System.out.println("Resposta Certa!");
		}
		else {
			System.out.println("Resposta Errada!\n\nR: 5 - public static void main(String[] args).");
		}
	}
}
