package academy.devdojo.maratonajava.introducaoExercicios;

import javax.swing.JOptionPane;

public class ArraysMultidimensionaisMultiplicarElementosPorFator {

	public static void main(String[] args) {
//		Descrição: Escreva um programa que use um array bidimensional (matriz) de inteiros e multiplique cada elemento por um fator constante, exibindo o resultado.
//		Exemplo: Para a matriz abaixo e fator 2:
//		1 2 3
//		4 5 6
//		O programa deve exibir:
//		2 4 6
//		8 10 12
		
		int[][] bidimensional = new int[2][3];
		int fator = Integer.parseInt(JOptionPane.showInputDialog("Escolha o fator de multiplicação da matriz: "));
		int valor = 1;
		
		for(int i = 0; i < bidimensional.length; i++) {
			for(int j = 0; j < bidimensional[i].length; j++) {
				bidimensional[i][j] = valor++;
			}
		}
		
		for (int[] linha : bidimensional) {
			for (int elemento : linha) {
				elemento *= fator;
				
				System.out.print(elemento + " ");
			}
			
			System.out.println();
		}

	}

}
