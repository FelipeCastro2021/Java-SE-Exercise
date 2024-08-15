package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {

	public static void main(String[] args) {
		int age = 21;
		boolean isComprarBebidaAlcolica = age >= 18;
		
		if (isComprarBebidaAlcolica) {
			System.out.println("Você pode comprar bebida alcólica!");
		}
		
		if (!isComprarBebidaAlcolica) {
			System.out.println("Você não pode comprar bebida alcólica!");
		}
	}

}
