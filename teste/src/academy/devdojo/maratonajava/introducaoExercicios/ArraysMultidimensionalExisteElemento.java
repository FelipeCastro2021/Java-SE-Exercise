package academy.devdojo.maratonajava.introducaoExercicios;

import javax.swing.JOptionPane;

public class ArraysMultidimensionalExisteElemento {

	public static void main(String[] args) {
//		Descrição: Escreva um programa que use um array bidimensional (matriz) de inteiros e verifique se um determinado valor está presente na matriz. Exiba true se o valor for encontrado e false caso contrário.
//		Exemplo: Para a matriz abaixo e o valor 5:
//		1 2 3
//		4 5 6
//		O programa deve exibir true. Para o valor 10, deve exibir false.

		int[][] matriz = new int[2][3];
		int value = 1;
		boolean existElementMatriz = false;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Qual é o número para ser encontrado: "));
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = value++;
			}
		}
		
		for (int[] linha : matriz) {
			for (int elemento : linha) {
				System.out.print(elemento + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("========================");
		
		for (int[] linha : matriz) {
			for (int elemento : linha) {
				if (elemento == numero) {
					existElementMatriz = true;
					break;
				} 
			}
			
			if(existElementMatriz) {
				break;
			}
		}
		
		if(existElementMatriz) {
			System.out.println("Valor verdadeiro!");
		} else {
			System.out.println("Valor falso!");
		}
	}

}
