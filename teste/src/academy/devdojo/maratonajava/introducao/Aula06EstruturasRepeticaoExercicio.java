package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticaoExercicio {

	public static void main(String[] args) {
		// Imprimir todos os números pares de 0 até 1.000.000
		int maxValue = 1000000;
		
		for (int i = 0; i <= maxValue; i++) {
			if(i % 2 == 1) {
				System.out.println("Even number: " + i);
			}
		}
	}

}
