package academy.devdojo.maratonajava.introducaoExercicios;

public class ForEachImprimirArray {

	public static void main(String[] args) {
//		Descrição: Escreva um programa que use forEach para imprimir todos os elementos de um array de inteiros.
//		Exemplo: Se o array for {10, 20, 30}, o programa deve imprimir:
//		10
//		20
//		30

		int[] array = {10, 20, 30};
		
		for (int i : array) {
			System.out.println(i);
		}
	}

}
