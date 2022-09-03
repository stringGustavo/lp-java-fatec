import java.util.Random;

public class ExibeNumeroAleatorio{
	
	public static void main (String[] args) {
		System.out.println("2 - Crie um arquivo chamado ExibeNumeroAleatorio.java. Implemente um programa em Java que gere um numero real aleatorio entre 0 e 100. Esse numero deve ser armazenado em uma variavel do tipo double chamada numeroAleatorio. Por fim, exiba o valor dessa variavel na saida padrao.");
		
		Random aleatorio = new Random();
		double numMaximo = 100;
		
		double numeroAleatorio = aleatorio.nextDouble(numMaximo);
		
		System.out.print("\nO numero aleatorio gerado foi: "+numeroAleatorio+".");
	}
}

