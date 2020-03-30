package EleicaoPrograms;

import java.io.*;
import javax.swing.JOptionPane;

public class metodos {

	votacao[] carrega(votacao v[]) {

		for (int i = 0; i < v.length; i++) {
			v[i] = new votacao();

		}
		for (int i = 0; i < v.length; i++) {
			v[i].candidateNumber = 1 + (int) Math.random() * 300;
			v[i].sectionNumber = 1 + (int) Math.random() * 10;

		}
		return v;

	}

	int[] classificacao(votacao v[]) {
		int secao[] = new int[10];
		for (int i = 0; i < v.length; i++) {
			secao[v[i].sectionNumber - 1]++;
		}
		JOptionPane.showMessageDialog(null, "Dados classificados!!");
		return secao;
	}

	int[] classificacaoCandidato(votacao v[]) {
		int candidatos[] = new int[300];
		for (int i = 0; i < v.length; i++) {
			candidatos[v[i].candidateNumber - 1]++;
		}

		return candidatos;
	}

	String gravar(int candidatos[], int secao[]) throws IOException{
		String x= "arquivo gerado";
		 String fileName = "Eleição2018.txt";
		 BufferedWriter write = new BufferedWriter(new FileWriter (fileName));
		 for (int i =0; i < secao.length; i++){
			 write.write(secao[i]);
			 write.newLine();
			 for (int j = 0; j < candidatos.length; j++ ){
				 write.write(candidatos[j]);
				 write.newLine();
			 }
		 }
		return x;
	}
}
