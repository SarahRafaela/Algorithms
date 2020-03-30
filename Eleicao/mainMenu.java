package EleicaoPrograms;

import java.io.IOException;

import javax.swing.JOptionPane;

public class mainMenu {
	public static void main(String[] args) throws IOException {

		int opc = 0;
		String s = menu("");
		String s2 = menu2("");
		
		votacao []  v = new votacao[100];
		metodos m = new metodos();
		int []secao= new int [10];
		int []candidatos = new int [300];
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(s));
				switch (opc){
				case 1 :
				v= m.carrega(v);	
				break;
				case 2 :
					secao= m.classificacao(v);
					candidatos = m.classificacaoCandidato(v);
					break;
				case 3 :
					m.gravar(candidatos, secao);
					
					break;
				case 4 :
					while (opc != 9) {
						opc = Integer.parseInt(JOptionPane.showInputDialog(s2));
						
					}
					break;
				case 9 :
					JOptionPane.showMessageDialog(null, "That´s all folks! ");
					break;
				default :
					JOptionPane.showMessageDialog(null, "That option doesn´t exist! Please enter another number!");
					break;
		}

	} 
		}

	static String menu(String s) {

		s += "            MENU:             	   \t \n";
		s += "\t::::::::::::::::::::::::::::::::::::::::::::::::::\t \n";
		s += "\t:	1-Carregar Seção/Número Eleitor     :\t \n";
		s += "\t: 	2 -Classificar por Seção         :\t \n";
		s += "\t: 	3 - Gravar Registros              :\t \n";
		s += "\t: 	4 – Mostrar Indicadores           :\t \n";
		s += "\t: 	9- Finaliza        :\t \n";
		s += "\t::::::::::::::::::::::::::::::::::::::::::::::::::\t \n";
		return s;

	}

	static String menu2(String s) {
		s += "                Mostrar Indicadores            	   \t \n";
		s += "                  Estatísticas de Votação em 2016	         	   \t \n";
		s += "\t::::::::::::::::::::::::::::::::::::::::::::::::::\t \n";
		s += "\t:	1-Quantidade Eleitores por Seção	              :\t \n";
		s += "\t: 	2 -Seção com Maior e Menor número de Eleitores        :\t \n";
		s += "\t: 	3 - – Quantidade de votos por candidato             :\t \n";
		s += "\t: 	4 – 10 primeiros colocadas (nro  cand. e qtd votos )             :\t \n";
		s += "\t: 	9- Finaliza        :\t \n";
		s += "\t::::::::::::::::::::::::::::::::::::::::::::::::::\t \n";
		return s;

	}
}
