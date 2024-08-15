package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {

	public static void main(String[] args) {
		int age = 21;
		String category = "Categoria";
		
		if (age >= 21) {
			category += " adulta";
		} else if (age >= 18) {
			category += " juvenil";
		} else if (age >= 15) {
			category += " sub-18";
		} else if (age >= 12) {
			category += " sub-15";
		} else if (age >= 8) {
			category += " sub-12";
		} else {
			category = "Desculpe, não temos categoria de base para a sua idade";
		}
		
		System.out.println(category);
		
		// Taxes Netherlands 2020
		double salary = 1000;
		double taxValue;
		double firstTax = 9.7 / 100;
		double secondTax = 37.35 / 100;
		double thirdTax = 49.5 / 100;
		
		if (salary > 0 && salary < 34712) {
			taxValue = salary * firstTax;
			salary *= (1 - firstTax);
		} else if (salary >= 34713 && salary <= 68507) {
			taxValue = salary * secondTax;
			salary *= (1 - secondTax);
		} else {
			taxValue = salary * thirdTax;
			salary *= (1 - thirdTax);
		}
		
		System.out.println("Salary: " + salary +
				"\nTax Value: " + taxValue);
	}

}
