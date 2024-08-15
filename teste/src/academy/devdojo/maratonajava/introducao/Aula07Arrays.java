package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays {

	public static void main(String[] args) {
		int[] idades = null;
		int[] numeros = new int[3];

		numeros[1] = 25;
		numeros[2] = 32;

		System.out.println(idades);
		System.out.println(numeros);
		System.out.println(numeros[0]);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		// Está atribuindo uma nova referência e apagando a anterior
		numeros = new int[4];

		int[][] arrayMulti = new int[3][3];

		for (int i = 0; i < arrayMulti.length; i++) {
			for (int j = 0; j < arrayMulti[i].length; j++) {
				System.out.println("[" + (i+1) + "]" + "[" + (j+1) + "]" +arrayMulti[i][j]);
			}
		}
		
		System.out.println("==================================");
		
		for(int[] arrBase : arrayMulti) {
			System.out.println(arrBase);
			
			for(int num : arrBase) {
				System.out.println(num);
			}
		}
	}

}
