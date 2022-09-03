
public class OperadorTernario {
	
	public static void main (String[] args) {
		//Aluno: Gustavo Sant'Anna dos Santos.
		System.out.println("12 - crie um arquivo chamado OperadorTernario.java. Complete o cadigo, substituindo a sequencia \"xxxxx\" com o operador ternario. O programa deve exibir a mensagem a < b quando o valor da variavel a for menor do que o valor da variavel b e a >= b caso contrario.");
		
		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 100);
		
		System.out.printf("\nA = %d\nB = %d\n\n",a,b);
		System.out.println(a < b ? "(A < B)" : "(A >= B)");
	}
}

