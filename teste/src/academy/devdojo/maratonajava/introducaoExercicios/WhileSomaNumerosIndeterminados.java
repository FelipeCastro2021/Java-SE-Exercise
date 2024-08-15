package academy.devdojo.maratonajava.introducaoExercicios;

import javax.swing.JOptionPane;

public class WhileSomaNumerosIndeterminados {

	public static void main(String[] args) {
//		Descrição: Escreva um programa que use um laço 
//		while para calcular a soma de todos os números de 1 até um número N fornecido pelo usuário.
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int contador = 1;
		int total = 0;
		
		while(contador <= numero) {
			total += contador;
			contador++;
		}
		
		System.out.println(total);
	}

}
