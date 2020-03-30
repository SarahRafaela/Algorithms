package lote1_10_19;

import javax.swing.JOptionPane;

public class Ex12 {
	public static void main(String[] args) {
		String resp = JOptionPane.showInputDialog("Qual ano você nasceu?");
		Integer anoNasc = Integer.parseInt(resp), anoAtual = 2018;
		Integer idadeFutura = 0, idadeAtual = 0;

		idadeAtual = anoAtual - anoNasc;
		System.out.println("Idade atual: " + idadeAtual);
		idadeFutura = idadeAtual + 17;
		System.out.println("Idade daqui a dezessete anos: " + idadeFutura);
	}
}
