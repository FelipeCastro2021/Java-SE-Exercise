package academy.devdojo.maratonajava.introducaoExercicios;

public class TiposPrimitivosCastImplicitoExplicito {

	public static void main(String[] args) {
		long numero = 3254133434563L;
		int number = (int) numero;
		
		int value = 782361;
		double value2 = value;
		System.out.println(value2);
		value2 = 15;
		System.out.println(value2);
		System.out.println(value);
		
		System.out.println("===============================================================");
		System.out.println(number);
	}

}
