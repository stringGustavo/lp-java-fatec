
public class TestaTiposPrimitivos {
	
	public static void main (String[] args) {
		System.out.println("9 - Crie um arquivo chamado TestaTiposPrimitivos.java. Implemente um programa em Java que declare uma variavel de cada um dos tipos primitivos da linguagem Java. Essas variaveis devem ser inicializadas com valores adequados. Por fim, exiba os valores dessas variaveis na saída padrao.");
		
		System.out.println("\nTipos primitivos Inteiros:\n");
		
		byte byteMax = Byte.MAX_VALUE, byteMin = Byte.MIN_VALUE;
		short shortMax = Short.MAX_VALUE, shortMin = Byte.MIN_VALUE;
		int intMax = Integer.MAX_VALUE, intMin = Integer.MIN_VALUE;
		long longMax = Long.MAX_VALUE, longMin = Long.MIN_VALUE;
		System.out.printf("\'byte\' - Limite Minimo: %d\n\t Limite Maximo: %d\n",byteMin,byteMax);
		System.out.printf("\n\'short\' - Limite Minimo: %d\n\t  Limite Maximo: %d\n",shortMin,shortMax);
		System.out.printf("\n\'int\' - Limite Minimo: %d\n\tLimite Maximo: %d\n",intMin,intMax);
		System.out.printf("\n\'long\' - Limite Minimo: %d\n\t Limite Maximo: %d\n",longMin,longMax);
		
		System.out.printf("\n-------------------------------------------------------------\n\nTipos primitivos de Ponto Flutuante:\n\n");
		
		float floatMax = Float.MAX_VALUE, floatMin = Float.MIN_VALUE;
		double doubleMax = Double.MAX_VALUE, doubleMin = Double.MIN_VALUE;
		System.out.printf("\'float\' - Limite Minimo: %f\n\t  Limite Maximo: %f\n\n\'double\' - Limite Minimo: %f\n\t   Limite Maximo: %f\n",floatMin,floatMax,doubleMin,doubleMax);
		
		System.out.printf("\n-------------------------------------------------------------\n\nTipo primitivo Caracter:\n\n");
		
		char myChar = 'G';
		System.out.printf("\'char\' - Exemplo: %c",myChar);
		
		System.out.printf("\n-------------------------------------------------------------\n\nTipo primitivo Booleanos:\n\n");
		
		boolean v = true;
		boolean f = false;
		
		System.out.printf("\'booleano\' Falso: %b.\n\'booleano\' Verdadeiro: %b.",f,v);
		
		
		
	}
}

