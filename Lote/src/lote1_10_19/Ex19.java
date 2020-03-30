package lote1_10_19;

import javax.swing.JOptionPane;

public class Ex19 {
	public static void main(String[] args) {
		int x = 0, y = 0;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));
	
		if (x>y) {

			JOptionPane.showMessageDialog(null,"O maior é " + x);
		}else if (y> x) {
			JOptionPane.showMessageDialog(null,"O maior é " + y );
		}else {
			JOptionPane.showMessageDialog(null,"Os valores inseridos são iguais");
		}
	}
}

