package lote1_1_9;

import javax.swing.JOptionPane;

public class Ex4 {
	public static void main(String[] args) {

		String temperatura = JOptionPane.showInputDialog("Qual a temperatura em C° na sua cidade ?");

		Double c = Double.parseDouble(temperatura);

		Double f;

		f = (9 * c + 160) / 5;
		System.out.println("A temperatura em Fahrenheit é:" + f);

	}
}
