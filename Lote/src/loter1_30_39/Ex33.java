package loter1_30_39;

import javax.swing.JOptionPane;

public class Ex33 {
	public static void main(String[] args) {
		Double q = 0.0, n;
		int cont = 1 ;
		n = Double.parseDouble(JOptionPane.showInputDialog("Insiria um quociente:"));

		while (cont <= n) {
			
			q += (1 / cont);

			cont++;
		}
		JOptionPane.showMessageDialog(null, "1/1 +. ..1/" + n + ": " + q);
	}
}
