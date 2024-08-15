package academy.devdojo.maratonajava.introducaoExercicios;

public class ArraysMultidimensionaisSomarElementos {

	public static void main(String[] args) {
//		1. Somar os Elementos de uma Matriz
//		Descrição: Escreva um programa que use um array bidimensional (matriz) de inteiros e some todos os seus elementos. Exiba o resultado final.
//		Exemplo: Para a matriz abaixo:
//		1 2 3
//		4 5 6
//		7 8 9
//		O programa deve exibir 45 (a soma de todos os elementos).

		int[][] matriz = new int[3][3];
		int valor = 1;
		int total = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = valor;
				
				valor++;
			}
		}
		
		for(int[] array : matriz) {
			for (int numero : array) {
				System.out.print(numero + " ");
				
				total += numero;
			}
			
			System.out.println();
		}
		
		System.out.println(total);
	}

}
