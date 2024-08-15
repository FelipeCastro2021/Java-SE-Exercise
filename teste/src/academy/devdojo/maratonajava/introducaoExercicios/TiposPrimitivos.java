package academy.devdojo.maratonajava.introducaoExercicios;

public class TiposPrimitivos {
	public static void main(String[] args) {
		char caractere = 'A';
		char letter = '\u0041';
		
		System.out.println(letter);
		
		int unicode = (int) caractere;
		
		System.out.println(++unicode);
		System.out.println(--unicode);
	}
}
