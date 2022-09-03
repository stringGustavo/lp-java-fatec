import java.util.Scanner;
import java.util.Random;

public class Ex10lista2{
	
	public static void main (String[] args) {
		System.out.println("10L2 - Considere um sistema de gerenciamento de mercadorias de uma loja. Implemente um programa que declare variaveis para representar os seguintes dados: numero do pedido, codigo do produto, quantidade e valor total da compra. Inicialize essas variaveis com valores apropriados. Por fim, exiba os valores armazenados.");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nCodigos:\n Arroz - C001.\n Feijao - C002.\n Sal - C003.\n Agua - C004.\n\n\nDigite o codigo do item que deseja comprar: ");
		String gerenciamento = scan.nextLine();
		
		switch(gerenciamento){
			case "C001":
				Random rand = new Random();
				int max = 100;
				int numPedido = rand.nextInt(max);
							
				float arroz = 14.99F;
				Scanner preco = new Scanner(System.in);
				System.out.print("Quantas unidade de Arroz voce deseja ?:");
				double unidade = preco.nextDouble();				
				double precoFinal = arroz * unidade;
				
				System.out.printf("\n\nNumero do pedido: %d.\nCodigo do produto: %s.\nQuantidade: %f.\nValor total: %f",numPedido,gerenciamento,unidade,precoFinal);
			break;
			
			case "C002":
				Random rand2 = new Random();
				int max2 = 100;
				int numPedido2 = rand2.nextInt(max2);
							
				float feijao = 7.89F;
				Scanner preco2 = new Scanner(System.in);
				System.out.print("Quantas unidade de Feijao voce deseja ?:");
				double unidade2 = preco2.nextDouble();				
				double precoFinal2 = feijao* unidade2;
				
				System.out.printf("\n\nNumero do pedido: %d.\nCodigo do produto: %s.\nQuantidade: %f.\nValor total: %f",numPedido2,gerenciamento,unidade2,precoFinal2);
			break;
			
			case "C003":
				Random rand3 = new Random();
				int max3 = 100;
				int numPedido3 = rand3.nextInt(max3);
							
				float sal = 2.70F;
				Scanner preco3 = new Scanner(System.in);
				System.out.print("Quantas unidade de Sal voce deseja ?:");
				double unidade3 = preco3.nextDouble();				
				double precoFinal3 = sal* unidade3;
				
				System.out.printf("\n\nNumero do pedido: %d.\nCodigo do produto: %s.\nQuantidade: %f.\nValor total: %f",numPedido3,gerenciamento,unidade3,precoFinal3);
			break;
			
			case "C004":
				Random rand4 = new Random();
				int max4 = 100;
				int numPedido4 = rand4.nextInt(max4);
							
				float agua = 2.50F;
				Scanner preco4 = new Scanner(System.in);
				System.out.print("Quantas unidade de Agua voce deseja ?:");
				double unidade4 = preco4.nextDouble();				
				double precoFinal4 = agua* unidade4;
				
				System.out.printf("\n\nNumero do pedido: %d.\nCodigo do produto: %s.\nQuantidade: %f.\nValor total: %f",numPedido4,gerenciamento,unidade4,precoFinal4);
			break;
		}
	}
}

