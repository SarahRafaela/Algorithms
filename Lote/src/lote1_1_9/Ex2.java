package lote1_1_9;

import javax.swing.JOptionPane;

public class Ex2 {
	public static void main(String[] args) {
		
		String respostaFuncionario = JOptionPane.showInputDialog("Qual o seu salário atual?");
		Double salarioInicial =  Double.parseDouble(respostaFuncionario);

		Double reajuste = salarioInicial * 1.5;

		System.out.println("O reajuste de " + salarioInicial + " é :" + reajuste);
	}
	
}