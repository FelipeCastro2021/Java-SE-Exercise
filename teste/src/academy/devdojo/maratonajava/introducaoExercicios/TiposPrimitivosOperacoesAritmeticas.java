package academy.devdojo.maratonajava.introducaoExercicios;

import javax.swing.JOptionPane;

public class TiposPrimitivosOperacoesAritmeticas {

	public static void main(String[] args) {
		int message;

		int number1 = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog("Type a number: "));

		do {
			message = Integer.parseInt(JOptionPane.showInputDialog("==================== ESCOLHA A OPERAÇÃO ARITMÉTICA ==================="
					+ "\n1-Adição" + "\n2-Subtração" + "\n3-Multiplicação" + "\n4-Divisão" + "\n0-Sair"));

			switch (message) {
			case 1:
				int total = number1 + number2;
				System.out.println(total);
				break;
			case 2:
				total = number1 - number2;
				System.out.println(total);
				break;
			case 3:
				total = number1 * number2;
				System.out.println(total);
				break;
			case 4:
				total = number1 / number2;
				System.out.println(total);
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Inseriu um valor inválido!");
				break;
			}
		} while (message != 0);
	}

}
