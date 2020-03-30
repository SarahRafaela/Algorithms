package lote1_10_19;

import javax.swing.JOptionPane;

public class Ex18 {
	public static void main(String[] args) {
		int x = 0, y = 0, r=0;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor:"));
	
		if (x>y) {
			r= x-y;
			JOptionPane.showMessageDialog(null,"O resultado de " + x +" - "+ y +"="+ r);
		}else if (y> x) {
			r= x-y;
			JOptionPane.showMessageDialog(null,"O resultado de " + y +" - "+ x +"="+ r);
		}else {
			r= x-y;
			JOptionPane.showMessageDialog(null,"O resultado de " + x +" - "+ y +"="+ r);
		}
	}
}
