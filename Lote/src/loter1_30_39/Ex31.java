package loter1_30_39;

import javax.swing.JOptionPane;

public class Ex31 {
public static void main(String[] args) {
	
	Integer cont = 10;
	
	
	while (cont>= 10 &&  cont < 150) {
		Double	q= Math.pow(cont, 2);
		JOptionPane.showMessageDialog(null," A potência de "+ cont +" é igual : "+ q );
		cont++;
		
	}
}
}
