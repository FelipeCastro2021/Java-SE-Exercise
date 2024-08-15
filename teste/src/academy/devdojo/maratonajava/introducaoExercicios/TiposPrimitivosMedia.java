package academy.devdojo.maratonajava.introducaoExercicios;

public class TiposPrimitivosMedia {

	public static void main(String[] args) {
		int numero = 10;
		int numero2 = 22;
		int numero3 = 45;
		
		float total = (float) (numero + numero2 + numero3) / 3;
		
		System.out.println(String.format("%.2f", total));
	}

}
