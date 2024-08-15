package academy.devdojo.maratonajava.introducaoExercicios;

import javax.swing.JOptionPane;

public class ForFatorial {

	public static void main(String[] args) {
//		Descrição: Escreva um programa que use um laço for
//		para calcular o fatorial de um número N fornecido pelo usuário.
//		Exemplo: Se N = 5, o programa deve calcular 5! = 5 * 4 * 3 * 2 * 1 = 120.

		int n = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
		int total = 1;
		
		for (int i = n; i > 0; i--) {
			total *= i;
			
			System.out.print(i + " * ");
		}
		
		System.out.println(" = " + total);
	}

}
