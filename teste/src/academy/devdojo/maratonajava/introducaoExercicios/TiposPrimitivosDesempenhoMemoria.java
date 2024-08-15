package academy.devdojo.maratonajava.introducaoExercicios;

import javax.swing.JOptionPane;

public class TiposPrimitivosDesempenhoMemoria {

	public static void main(String[] args) {
		int conversao;

		do {
			conversao = Integer.parseInt(JOptionPane
					.showInputDialog("==================== ESCOLHA O TIPO DE DADO ===================" + "\n1-int"
							+ "\n2-long" + "\n3-float" + "\n4-double" + "\n5-short" + "\n6-byte" + "\n0-Sair"));

			switch (conversao) {
			case 1: {
				int value1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
				int value2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
				operacoesAritmeticas(value1, value2, "int");
				break;
			}
			case 2: {
				long value1 = Long.parseLong(JOptionPane.showInputDialog("Digite um número: "));
				long value2 = Long.parseLong(JOptionPane.showInputDialog("Digite outro número: "));
				operacoesAritmeticas(value1, value2, "long");
				break;
			}
			case 3: {
				float value1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
				float value2 = Float.parseFloat(JOptionPane.showInputDialog("Digite outro número: "));
				operacoesAritmeticas(value1, value2, "float");
				break;
			}
			case 4: {
				double value1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
				double value2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: "));
				operacoesAritmeticas(value1, value2, "double");
				break;
			}
			case 5: {
				short value1 = Short.parseShort(JOptionPane.showInputDialog("Digite um número: "));
				short value2 = Short.parseShort(JOptionPane.showInputDialog("Digite outro número: "));
				operacoesAritmeticas(value1, value2, "short");
				break;
			}
			case 6: {
				byte value1 = Byte.parseByte(JOptionPane.showInputDialog("Digite um número: "));
				byte value2 = Byte.parseByte(JOptionPane.showInputDialog("Digite outro número: "));
				operacoesAritmeticas(value1, value2, "byte");
				break;
			}
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (conversao != 0);
	}

	public static void operacoesAritmeticas(Number value1, Number value2, String tipoDado) {
		int message;

		// Determinar o tipo específico e realizar a operação
		switch (tipoDado) {
		case "int":
			int int1 = ((Integer) value1).intValue();
			int int2 = ((Integer) value2).intValue();
			message = Integer.parseInt(
					JOptionPane.showInputDialog("==================== ESCOLHA A OPERAÇÃO ARITMÉTICA ==================="
							+ "\n1-Adição" + "\n2-Subtração" + "\n3-Multiplicação" + "\n4-Divisão" + "\n0-Sair"));
			switch (message) {
			case 1:
				System.out.println("Resultado: " + (int1 + int2));
				break;
			case 2:
				System.out.println("Resultado: " + (int1 - int2));
				break;
			case 3:
				System.out.println("Resultado: " + (int1 * int2));
				break;
			case 4:
				System.out.println("Resultado: " + (int1 / int2));
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			break;
		case "long":
			long long1 = ((Long) value1).longValue();
			long long2 = ((Long) value2).longValue();
			message = Integer.parseInt(
					JOptionPane.showInputDialog("==================== ESCOLHA A OPERAÇÃO ARITMÉTICA ==================="
							+ "\n1-Adição" + "\n2-Subtração" + "\n3-Multiplicação" + "\n4-Divisão" + "\n0-Sair"));
			switch (message) {
			case 1:
				System.out.println("Resultado: " + (long1 + long2));
				break;
			case 2:
				System.out.println("Resultado: " + (long1 - long2));
				break;
			case 3:
				System.out.println("Resultado: " + (long1 * long2));
				break;
			case 4:
				System.out.println("Resultado: " + (long1 / long2));
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			break;
		case "float":
			float float1 = ((Float) value1).floatValue();
			float float2 = ((Float) value2).floatValue();
			message = Integer.parseInt(
					JOptionPane.showInputDialog("==================== ESCOLHA A OPERAÇÃO ARITMÉTICA ==================="
							+ "\n1-Adição" + "\n2-Subtração" + "\n3-Multiplicação" + "\n4-Divisão" + "\n0-Sair"));
			switch (message) {
			case 1:
				System.out.println("Resultado: " + (float1 + float2));
				break;
			case 2:
				System.out.println("Resultado: " + (float1 - float2));
				break;
			case 3:
				System.out.println("Resultado: " + (float1 * float2));
				break;
			case 4:
				System.out.println("Resultado: " + (float1 / float2));
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			break;
		case "double":
			double double1 = ((Double) value1).doubleValue();
			double double2 = ((Double) value2).doubleValue();
			message = Integer.parseInt(
					JOptionPane.showInputDialog("==================== ESCOLHA A OPERAÇÃO ARITMÉTICA ==================="
							+ "\n1-Adição" + "\n2-Subtração" + "\n3-Multiplicação" + "\n4-Divisão" + "\n0-Sair"));
			switch (message) {
			case 1:
				System.out.println("Resultado: " + (double1 + double2));
				break;
			case 2:
				System.out.println("Resultado: " + (double1 - double2));
				break;
			case 3:
				System.out.println("Resultado: " + (double1 * double2));
				break;
			case 4:
				System.out.println("Resultado: " + (double1 / double2));
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			break;
		case "short":
			short short1 = ((Short) value1).shortValue();
			short short2 = ((Short) value2).shortValue();
			message = Integer.parseInt(
					JOptionPane.showInputDialog("==================== ESCOLHA A OPERAÇÃO ARITMÉTICA ==================="
							+ "\n1-Adição" + "\n2-Subtração" + "\n3-Multiplicação" + "\n4-Divisão" + "\n0-Sair"));
			switch (message) {
			case 1:
				System.out.println("Resultado: " + (short1 + short2));
				break;
			case 2:
				System.out.println("Resultado: " + (short1 - short2));
				break;
			case 3:
				System.out.println("Resultado: " + (short1 * short2));
				break;
			case 4:
				System.out.println("Resultado: " + (short1 / short2));
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			break;
		case "byte":
			byte byte1 = ((Byte) value1).byteValue();
			byte byte2 = ((Byte) value2).byteValue();
			message = Integer.parseInt(
					JOptionPane.showInputDialog("==================== ESCOLHA A OPERAÇÃO ARITMÉTICA ==================="
							+ "\n1-Adição" + "\n2-Subtração" + "\n3-Multiplicação" + "\n4-Divisão" + "\n0-Sair"));
			switch (message) {
			case 1:
				System.out.println("Resultado: " + (byte1 + byte2));
				break;
			case 2:
				System.out.println("Resultado: " + (byte1 - byte2));
				break;
			case 3:
				System.out.println("Resultado: " + (byte1 * byte2));
				break;
			case 4:
				System.out.println("Resultado: " + (byte1 / byte2));
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			break;
		default:
			System.out.println("Tipo de dado não suportado.");
			break;
		}
	}
}
