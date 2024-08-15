package academy.devdojo.maratonajava.introducaoExercicios;

import javax.swing.JOptionPane;

public class TiposPrimitivosConversaoTemperatura {

	public static void main(String[] args) {
		int celsius = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Cº: "));
		float fahrenheit = 0;
		
		if (celsius >= 0 && celsius <= 100) {
			fahrenheit = (float) (celsius * 1.8) + 32;
		}
		
		
		JOptionPane.showMessageDialog(null, fahrenheit);
	}

}
