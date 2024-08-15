package academy.devdojo.maratonajava.introducaoExercicios;

import javax.swing.JOptionPane;

public class WhileSequenciaFibonacci {

	public static void main(String[] args) {
//		Descrição: Escreva um programa que use um laço while para gerar os N primeiros termos da sequência de Fibonacci.
//		Exemplo: Se N = 5, o programa deve imprimir 0, 1, 1, 2, 3.

		int n = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
		int contador = 0;
		
		int t1 = 0, t2 = 1;
		
		while(contador < n) {
			System.out.print(t1 + " ");
			
			int proximoTermo = t1 + t2;
			t1 = t2;
			t2 = proximoTermo;
			
			contador++;
		}
	}

}
