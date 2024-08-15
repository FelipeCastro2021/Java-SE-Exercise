package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisSwitch {
	public static void main(String[] args) {
		// Imprima os dias da semana, considerando 1 como domingo1
		int diaSemana = 7;

		switch (diaSemana) {
		case 1:
			System.out.println("Hoje é domingo");
			break;
		case 2:
			System.out.println("Hoje é segunda-feira");
			break;
		case 3:
			System.out.println("Hoje é terça-feira");
			break;
		case 4:
			System.out.println("Hoje é quarta-feira");
			break;
		case 5:
			System.out.println("Hoje é quinta-feira");
			break;
		case 6:
			System.out.println("Hoje é sexta-feira");
			break;
		case 7:
			System.out.println("Hoje é sábado");
			break;
		default:
			System.out.println("Valor inválido");
		}

//		byte day = 7;
//		switch (day) {
//		case 1:
//		case 7:
//			System.out.println("Final de semana");
//			break;
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//		case 6:
//			System.out.println("Dia de semana");
//			break;
//		default:
//			System.out.println("Valor inválido");
//			break;
//		}

		byte day = 5;
		
		// Using switch expressions (added in java 13)
		
		String answer = switch (day) {
		case 1, 7 -> "Final de semana";
		case 2, 3, 4, 5, 6 -> "Dia útil";
		default -> "Dia não existente";
		};
		
		System.out.println(answer);
	}
}
