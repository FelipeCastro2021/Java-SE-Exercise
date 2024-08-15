package academy.devdojo.maratonajava.introducaoExercicios;

import javax.swing.JOptionPane;

public class TipoPrimivosConversãoBases {

	public static void main(String[] args) {
		// Crie um programa que converta um número de uma base numérica para outra
		// (por exemplo, de binário para decimal e vice-versa).
		// Use int para representar os números e manipule os bits para realizar a
		// conversão.

		int numero = 50;
		int message;
		String base = "";

		do {
			message = Integer.parseInt(
					JOptionPane.showInputDialog("==================== ESCOLHA A OPERAÇÃO ARITMÉTICA ==================="
							+ "\n1-Decimal para binário" + "\n2-Decimal para hexadecimal" + "\n3-Binário para decimal"
							+ "\n4-Binário para hexadecimal" + "\n5-Hexadecimal para decimal"
							+ "\n6-Hexadecimal para binário" + "\n0-Sair"));

			switch (message) {
			case 1:
				base = Integer.toBinaryString(numero);
				System.out.println(base);
				break;
			case 2:
				base = Integer.toHexString(numero);
				System.out.println(base);
				break;
			case 3:
				numero = Integer.parseInt(base, 2);
				System.out.println(numero);
				break;
			case 4:
				numero = Integer.parseInt(base, 2);
				base = Integer.toHexString(numero);
				System.out.println(base);
				break;
			case 5:
				numero = Integer.parseInt(base, 2);
				System.out.println(numero);
				break;
			case 6:
				numero = Integer.parseInt(base, 2);
				base = Integer.toBinaryString(numero);
				System.out.println(base);
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
