import java.util.Scanner;

public class Ex7lista2 {
	
	public static void main (String[] args) {
		System.out.println("7L2 - Indique os tipos da linguagem Java que aceitam cada valor da lista abaixo.");
		//System.out.println("\n 1 - \"Bom dia\"\n 2 - 3\n 3 - 235.15\n 4 - true\n 5 - -135\n 6 - 256.23F\n 7 - 'A'\n 8 - 6463275245745L");
		int pts = 0;
		System.out.println("\n 1 - boolean; \n 2 - string; \n 3 - char; \n 4 - float; \n 5 - String.");
		System.out.print("\nQual tipo acima aceita o valor: \"Bom dia\"?: ");
		Scanner scan = new Scanner(System.in);
		byte resposta1 = scan.nextByte();
		
		while (resposta1 < 1 || resposta1 > 5){
			System.out.println("\nResposta Invalida, Tente novamente!");
			System.out.print("\nQual tipo acima aceita o valor: \"Bom dia\"?: ");
			scan = new Scanner(System.in);
			resposta1 = scan.nextByte();
		}
		
		if (resposta1 == 5){
			pts++;
			System.out.println("\nResposta Certa!\n-------------------------------------------------------- Acertos: "+pts);
		}
		else{
			System.out.println("Resposta Errada!\n\nR: 5 - String.\n--------------------------------------------------------");
		}
		
		System.out.println("\n 1 - char;\n 2 - byte;\n 3 - String;\n 4 - boolean.\n 5 - string.");
		System.out.print("\nQual tipo acima aceita o valor: 3?: ");
		Scanner scan2 = new Scanner(System.in);
		byte resposta2 = scan2.nextByte();
		
		while(resposta2 < 1 || resposta2 > 5){
			System.out.println("\nResposta Invalida, Tente novamente!");
			System.out.print("\nQual tipo acima aceita o valor: 3?: ");
			scan2 = new Scanner(System.in);
			resposta2 = scan2.nextByte();
		}
		
		if (resposta2 == 2) {
			pts++;
			System.out.println("\nResposta Certa!\n--------------------------------------------------------  Acertos: "+pts);
		}
		else{
			System.out.println("Resposta Errada!\n\nR: 2 - byte.\n--------------------------------------------------------");
	    }
	    
	    System.out.println("\n 1 - byte;\n 2 - float;\n 3 - double;\n 4 - Float;\n 5 - Double.");
	    System.out.print("\nQual tipo acima aceita o valor: 235.15?: ");
	    Scanner scan3 = new Scanner(System.in);
	    byte resposta3 = scan3.nextByte();
	    
	    while (resposta3 < 1 || resposta3 > 5){
			System.out.println("\nResposta Invalida, Tente novamente!");
			System.out.print("\nQual tipo acima aceita o valor: 235.15?: ");
			scan3 = new Scanner(System.in);
			resposta3 = scan3.nextByte();
		}
		
		if (resposta3 == 3){
			pts++;
			System.out.println("\nResposta Certa!\n--------------------------------------------------------  Acertos: "+pts);
		}
		else{
			System.out.println("Resposta Errada!\n\nR: 3 - double.\n--------------------------------------------------------");
		}
		
		System.out.println("\n 1 - boolean.\n 2 - byte.\n 3 - char.\n 4 - short.\n 5 - Int.");
		System.out.print("\nQual tipo acima aceita o valor: -135?: ");
		Scanner scan4 = new Scanner(System.in);
		byte resposta4 = scan4.nextByte();
		
		while (resposta4 < 1 || resposta4 > 5){
			System.out.println("\nResposta Invalida, Tente novamente!");
			System.out.print("\nQual tipo acima aceita o valor: -135?: ");
			scan4 = new Scanner(System.in);
			resposta4 = scan4.nextByte();
		}
		
		if (resposta4 == 4){
			pts++;
			System.out.println("\nResposta Certa!\n--------------------------------------------------------  Acertos: "+pts);
		}
		else{
			System.out.println("Resposta Errada!\n\nR: 4 - short.\n--------------------------------------------------------");
		}
		
		System.out.println("\n 1 - Long.\n 2 - int.\n 3 - float.\n 4 - Float.\n 5 - Double.");
		System.out.print("\nQual tipo acima aceita o valor: 256.23F?: ");
		Scanner scan5 = new Scanner(System.in);
		byte resposta5 = scan5.nextByte();
		
		while (resposta5 < 1 || resposta5 > 5){
			System.out.println("\nResposta Invalida, Tente novamente!");
			System.out.print("\nQual tipo acima aceita o valor: 256.23F?: ");
			scan5 = new Scanner(System.in);
			resposta5 = scan5.nextByte();
		}
		
		if (resposta5 == 3){
			pts++;
			System.out.println("\nResposta Certa!\n--------------------------------------------------------  Acertos: "+pts);
		}
		else{
			System.out.println("Resposta Errada!\n\nR: 3 - float.\n--------------------------------------------------------");
		}
		
		System.out.println("\n 1 - int.\n 2 - char.\n 3 - String.\n 4 - long.\n 5 - Char.");
		System.out.print("\nQual tipo acima aceita o valor: 'A'?: ");
		Scanner scan6 = new Scanner(System.in);
		byte resposta6 = scan6.nextByte();
		
		while (resposta6 < 1 || resposta6 > 5){
			System.out.println("\nResposta Invalida, Tente novamente!");
			System.out.print("\nQual tipo acima aceita o valor: 'A'?: ");
			scan6 = new Scanner(System.in);
			resposta6 = scan6.nextByte();
		}
		
		if (resposta6 == 2){
			pts++;
			System.out.println("\nResposta Certa!\n--------------------------------------------------------  Acertos: "+pts);
		}
		else{
			System.out.println("Resposta Errada!\n\nR: 2 - char.\n--------------------------------------------------------");
		}
		
		System.out.println("\n 1 - Long.\n 2 - int.\n 3 - double.\n 4 - long.\n 5 - String.");
		System.out.print("\nQual tipo acima aceita o valor: 6463275245745L?: ");
		Scanner scan7 = new Scanner(System.in);
		byte resposta7 = scan6.nextByte();
		
		while (resposta7 < 1 || resposta7 > 5){
			System.out.println("\nResposta Invalida, Tente novamente!");
			System.out.print("\nQual tipo acima aceita o valor: 6463275245745L?: ");
			scan7 = new Scanner(System.in);
			resposta7 = scan7.nextByte();
		}
		
		if (resposta7 == 4){
			pts++;
			System.out.println("\nResposta Certa!\n--------------------------------------------------------  Acertos: "+pts);
		}
		else{
			System.out.println("Resposta Errada!\n\nR: 4 - long.\n--------------------------------------------------------");
		}
		
		System.out.println("\n 1 - double.\n 2 - char.\n 3 - String.\n 4 - int.\n 5 - boolean.");
		System.out.print("\nQual tipo acima aceita o valor: true?: ");
		Scanner scan8 = new Scanner(System.in);
		byte resposta8 = scan8.nextByte();
		
		while (resposta8 < 1 || resposta8 > 5){
			System.out.println("\nResposta Invalida, Tente novamente!");
			System.out.print("\nQual tipo acima aceita o valor: true: ");
			scan8 = new Scanner(System.in);
			resposta8 = scan8.nextByte();
		}
		
		if (resposta8 == 5){
			pts++;
			System.out.println("\nResposta Certa!\n--------------------------------------------------------  Acertos: "+pts);
		}
		else{
			System.out.println("Resposta Errada!\n\nR: 5 - true.\n--------------------------------------------------------");
		}
		
		if (pts == 8) {
			System.out.println("\n\nParabens, Voce acertou tudo!");
		}
		else{
			System.out.println("\n\nVoce acertou "+pts+" perguntas.");
		}
		
		
	}
}

