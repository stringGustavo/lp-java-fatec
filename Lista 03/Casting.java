

public class Casting {
	
	public static void main (String[] args) {
		
	// Aluno: Gustavo Sant'Anna dos Santos.
	
	System.out.println("2 - Crie um arquivo chamado Casting.java. Crie uma variavel chamada numero1 do tipo long e inicialize-a com o valor 2147483648L. Depois, crie uma variavel chamada numero2 do tipo int e copie o valor da variavel numero1 para a variavel numero2. Por fim, exiba, na saida padrao, os valores dessas duas variaveis.\n");
		
		long numero1 = 2147483648L;
		Integer numero2 = (int)numero1;
		
		System.out.printf("Primeira Variavel: %d\nSegunda Variavel: %d",numero1 ,numero2);
	}
}

