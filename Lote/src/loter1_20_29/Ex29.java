package loter1_20_29;

import java.util.Scanner;

public class Ex29 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer tipoInvestimento = 0;
		Double valorInvestimento = 0.0;

		System.out.println("Qual o seu tipo de investimento ? Para Poupan�a(1); Para Renda fixa (2)");
		tipoInvestimento = scanner.nextInt();
		System.out.println("Qual � o valor do Investimento?");
		valorInvestimento = scanner.nextDouble();

		if (tipoInvestimento == 1) {
			valorInvestimento = valorInvestimento + 0.03;
			System.out.println("Valor do investimento do corrigido em um m�s:" + valorInvestimento);
		} else if (tipoInvestimento == 2) {
			valorInvestimento = valorInvestimento + 0.05;
			System.out.println("Valor do investimento do corrigido em um m�s:" + valorInvestimento);

		}else {
			System.out.println("Erro, valor inserido incorreto!");
		}
scanner.close();

	}
}
