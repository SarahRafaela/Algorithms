package loter1_30_39;

import javax.swing.JOptionPane;

public class Ex35 {
	public static void main(String[] args) {
		Integer x, y, impar ;
		x = Integer.parseInt(JOptionPane.showInputDialog("Insira  o primeiro número:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Insira  o segundo número:"));
		impar = x;
			while (x > y && impar < x || y > x && impar< y) {
			if(impar % 2 == 0) {
					JOptionPane.showMessageDialog(null, impar + " É ímpar entre "+ x +"e "+ y);
				impar++;
				while (x < y) {
				}if(impar % 2 == 0) {
						JOptionPane.showMessageDialog(null, impar + " É ímpar entre " + x +"e "+ y);
					}
					impar++;
			
		}else if (x==y){
			JOptionPane.showInputDialog("Não há intervalo, porque os números inserido são iguais.");
		}
	

}
