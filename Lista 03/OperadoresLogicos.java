
public class OperadoresLogicos {
	
	public static void main (String[] args) {
		//Aluno: Gustavo Sant'Anna dos Santos.
		System.out.println("11 - Crie um arquivo chamado OperadoresLogicos.java. Complete o codigo, substituindo a sequencia \"xxxxx\" com operacoes logicas. O programa deve exibir os valores true, true, false, false e true nessa ordem. Nao utilize o mesmo operador duas ou mais vezes.");
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		System.out.println(a > b | c < d);
		System.out.println(a > b || c < d);
		System.out.println(a > b & c < d);
		System.out.println(a > b && c < d);
		System.out.println(a > b != c < d);
	}
}

