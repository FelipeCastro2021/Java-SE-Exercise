package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
	public static void main(String[] args) {
		int yearBirthday = 2003;
		byte age = 21;
		long number = 4237896;
		double decimalNumber = 1243.87;
		float decimalFloatNumber = 432978.12F;
		short salary = 20000;
		boolean hasDriverLicense = false;
		char letterB = 66;
		char letterBUni = '\u0042';
		
		String nome = "Felipe";
		
		System.out.println("Minha idade é: " + age + " anos");
		System.out.println("Qual é o ano do seu nascimento: " + yearBirthday);
		System.out.println("Qual é o seu salário: " + salary);
		System.out.println("Informe o número decimal com double: " + decimalNumber);
		System.out.println("Informe o número decimal com float: " + decimalFloatNumber);
		System.out.println("Digite um número qualquer: " + number);
		System.out.println("Você possui carteira de motorista: " + hasDriverLicense);
		System.out.println("Mostre-me uma letra do alfabeto brasileiro: " + letterB);
		System.out.println("Mostre-me uma letra do alfabeto brasileiro em UniCode: " + letterBUni);
		System.out.println(nome);
	}
}
