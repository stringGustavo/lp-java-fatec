

public class ConversaoPrimitivos{
	
	public static void main (String[] args) {
		
		//Aluno: Gustavo Sant'Anna dos Santos.
		System.out.println("1 - Crie um arquivo chamado ConversaoPrimitivos.java. Para eliminar os erros de compilacao, complete os espacos marcados por \"xxxxx\" codigo abaixo quando necessario");
		
		int a = 10;
		long b = 11 + a;
		int c = 12 +(int)b;
		float d = 13 + b;
		short e = (short)a;
		double f = 15 + d;
		long g = 16 + a;
		
		System.out.printf("\nInteger A = %d",a);
		System.out.printf("\nLong B + A = %d",b);
		System.out.printf("\nInteger C + B = %d",c);
		System.out.printf("\nFloat D + B = %f",d);
		System.out.printf("\nShort E + A = %d",e);
		System.out.printf("\nDouble F + D = %f",f);
		System.out.printf("\nLong G + A = %d",g);
	}
}

