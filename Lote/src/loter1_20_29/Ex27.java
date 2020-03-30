package loter1_20_29;

import java.util.Scanner;

public class Ex27 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double numeroVoltas = 0.0;
		Double circuitoMetros = 0.0, tempoMinutos = 0.0, velocidade = 0.0, circuitoKm = 0.0, tempoHora = 0.0;

		System.out.println("Quantas voltas foram realizadas?");
		numeroVoltas = scanner.nextDouble();
		System.out.println("Duração da corrida em minutos");
		tempoMinutos = scanner.nextDouble();
		System.out.println("Qual foi a extensão do percurso em metros?");
		circuitoMetros = scanner.nextDouble();
		
		circuitoKm= circuitoMetros/ 1000;
		tempoHora= tempoMinutos/60;
		
		velocidade= (circuitoKm*numeroVoltas)/ tempoHora;
		System.out.println("A velocidade média do circuito é:"+ velocidade+ "km/h");

		scanner.close();
	}

}
