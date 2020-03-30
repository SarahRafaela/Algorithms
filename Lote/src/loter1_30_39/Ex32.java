package loter1_30_39;

import javax.swing.JOptionPane;

public class Ex32 {
	public static void main(String[] args) {
		Integer f = 1, cont;
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro:"));
		cont = n;
		while (cont != 1) {
			f = f * cont;
			cont--;
		}
		JOptionPane.showMessageDialog(null, n + "! :" + f + " . ");
	}
}
