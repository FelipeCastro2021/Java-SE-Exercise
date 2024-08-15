package academy.devdojo.maratonajava.introducaoExercicios;

public class ForEachPosicaoElemento {

	public static void main(String[] args) {
//		Descrição: Escreva um programa que use forEach para imprimir cada elemento de um array 
//		juntamente com sua posição (índice).
//		Exemplo: Se o array for {10, 20, 30}, o programa deve exibir:

		int[] numeros = {10, 20, 30};
		int indice = 0;
		
		for (int numero : numeros) {
			System.out.println("Elemento na posiçaõ " + indice++ + ": " + numero);
		}
	}

}
