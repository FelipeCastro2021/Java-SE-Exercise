package academy.devdojo.maratonajava.introducaoExercicios;

import javax.swing.JOptionPane;

public class TiposPrimitivosPerimetroCirculo {

	public static void main(String[] args) {
		double raio = 2;
		
		double perimetroCirculo = 2 * Math.PI * raio;
		
		JOptionPane.showMessageDialog(null, String.format("%.2f", perimetroCirculo));
	}

}
