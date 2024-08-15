package academy.devdojo.maratonajava.introducaoExercicios;

import javax.swing.JOptionPane;

public class ForEachElementosMaiores {

	public static void main(String[] args) {
//		Descrição: Escreva um programa que use forEach para contar quantos elementos em um array de inteiros
//		são maiores que um determinado valor.
//		Exemplo: Se o array for {5, 10, 15, 20} e o valor for 12, o programa deve exibir 2.

		int[] array = {5, 10, 15, 20};
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		int contador = 0;
				
		for (int value : array) {
			if(value > numero) {
				contador++;
			}
		}
		
		System.out.println(contador);
	}

}
