package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivosPratica {
	public static void main(String[] args) {
		byte idade = 127;
		short value = 4392;
		int value2 = 243879;
		long number = 50891347;
		float decimalFloat = 189432.2F;
		double decimalDouble = 243089.1;
		char caractere = 125;
		boolean hasGamerComputer = false;
		
		System.out.println(idade + value + value2 + number + decimalFloat + " " + decimalDouble + " " + caractere + hasGamerComputer);
		
		// Converta um valor de int para byte e observe o comportamento quando o valor excede o intervalo do byte.
		// Converta um valor de float para int e analise a perda de precisão.
		value2 = (byte) value2;
		decimalFloat = (int) decimalFloat;
		System.out.println(value2);
		System.out.println(decimalFloat);
		
		// Crie um programa que some, subtraia, multiplique e divida dois
		// Experimente usar o operador de módulo (%) para encontrar o resto de uma divisão entre dois números inteiros.
		int number1 = 10, number2 = 5;
		int soma = number1 + number2, subtracao = number1 - number2, multiplicacao = number1 * number2, divisao = number1 / number2;
		
		System.out.println("Soma: " + soma + 
				"\nSubtração: " + subtracao + 
				"\nMultiplicação: " + multiplicacao + 
				"\nDivisão: " + divisao);
		
		int numero = 10;
		int numero2 = 5;
		int resto = numero % numero2;
		System.out.println("Esse é o resto da divisão entre dois números: " + resto);
		
		// Declare uma variável do tipo char e inicialize-a com um valor de caractere, como 'A'. 
		// Depois, imprima o valor numérico (código Unicode) desse caractere.
		char caracter10 = 'A';
		int unicode = (int) caracter10;
		System.out.println(unicode);
		System.out.println("Valor após ser incrementado: " + ++caracter10 + " e o valor numérico é: " + (int) caracter10);
		System.out.println("Valor após ser decrementado: " + --caracter10 + " e o valor numérico é: " + (int) caracter10);
		
		// Crie variáveis booleanas e inicialize-as com true ou false. 
		// Escreva expressões condicionais usando operadores lógicos (&&, ||, !) 
		// para combinar essas variáveis e exibir o resultado.
		boolean verdadeiro1 = true;
		boolean falso1 = false;
		
		boolean isTrueFalse = verdadeiro1 || falso1;
		boolean isTrueFalse1 = verdadeiro1 && falso1;
		
		System.out.println(!isTrueFalse);
		System.out.println(isTrueFalse1);
	}
}
