package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticaoContinueExercise {

	public static void main(String[] args) {
		// Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
		// Condição: ValorParcela >= 1000

		double valorCarro = 50000;

		for (int parcelas = (int) valorCarro; parcelas >= 1; parcelas--) {
			double valorParcelas = valorCarro / parcelas;

			if (valorParcelas < 1000) {
				continue;
			}

			System.out.println("Quantidade de Parcelas: " + parcelas + " | Valor das Parcelas: " + valorParcelas);
		}
	}

}
