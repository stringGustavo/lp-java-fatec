import java.util.Scanner;

public class Ex14 {
	
	public static void main (String[] args) {
		System.out.println("14 - Ao compilar o arquivo Programa.java (codigo abaixo), quantos arquivos com a extensao .class serao gerados?");
		System.out.println("\nclass Maria {\n\tpublic static void main (String[] args) {\n\t\tSystem.out.println(\"Maria\");\n\t}\n}");
		System.out.println("\nclass Lobato {\n\tpublic static void main (String[] args) {\n\t\tSystem.out.println(\"Lobato\");\n\t}\n}");
		System.out.println("\nclass Jonas {\n\tpublic static void main (String[] args) {\n\t\tSystem.out.println(\"Jonas\");\n\t}\n}");
		
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
			System.out.println("Resposta Errada!\n\nR: 3 arquivos .class.");
		}
	}
}
