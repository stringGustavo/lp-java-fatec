
public class ExibeValores {
	
	public static void main (String[] args) {
		System.out.println("4L2 - Crie um arquivo chamado ExibeValores.java. Implemente um programa em Java que armazeneem variaveis os valores 19, 1571, 100000, 2147483648, 3.14, 3.141592653589793, true e 'K'. essas variaveis. Por fim, exiba os valores dessas variaveis na saida padrao.");
		
		byte primeiroNum = 19;
		short segundoNum = 1571;
		int terceiroNum = 100000;
		long quartoNum = 2147483648L;
		float quintoNum = 3.14f;
		double sextoNum = 3.141592653589793;
		boolean tr = true;
		char k = 'K';
		
		System.out.println("\nByte = "+primeiroNum+ ";\nShort = "+segundoNum+";\nInt = "+terceiroNum+";\nLong = "+quartoNum+";\nFloat = "+quintoNum+";\nDouble = "+sextoNum+";\nBoolean = "+tr+";\nChar = "+k+".");
	}
}

