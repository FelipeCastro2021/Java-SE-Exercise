package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao {

	public static void main(String[] args) {
		// Imprima os primeiros 25 números de um dado valor. Por exemplo, 50
		byte value = 50;
		byte breakValue = 25;

		for (int i = 0; i <= value; i++) {
			if (i > breakValue) {
				break;
			}

			System.out.println(i);
		}
	}

}
