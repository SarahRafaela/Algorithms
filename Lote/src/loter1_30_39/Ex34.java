package loter1_30_39;

import javax.swing.JOptionPane;

public class Ex34 {
	public static void main(String[] args) {
		Integer cont=1, n;
		double t;
		JOptionPane.showMessageDialog(null, "Tabuada");
		n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
		
		while (cont!= 11) {
			t = (cont * n);
			JOptionPane.showMessageDialog(null, cont + " x " + n +" : "+t);
			cont++;
		}
	}

}
