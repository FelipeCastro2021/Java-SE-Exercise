package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticaoBreakExercise {

	public static void main(String[] args) {
		// Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
		// Condição: ValorParcela >= 1000

		double valorCarro = 50000;

		for (int parcelas = 1; parcelas <= valorCarro; parcelas++) {
			double valorParcelas = valorCarro / parcelas;

			if (valorParcelas < 1000) {
				break;
			}

			System.out.println("Quantidade de Parcelas: " + parcelas + " | Valor das Parcelas: " + valorParcelas);
		}
	}

}
