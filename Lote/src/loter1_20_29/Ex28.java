package loter1_20_29;

import java.util.Scanner;

public class Ex28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double precoAtual = 0.0, precoNovo = 0.0;
		Integer mediaMensal = 0;

		System.out.println("Insira o preço atual do produto:");
		precoAtual = scanner.nextDouble();
		System.out.println("Insira a média mensal de vendas desse produto:");
		mediaMensal = scanner.nextInt();

		if (mediaMensal < 500 && precoAtual < 30) {

			precoNovo = precoAtual + 0.10;
			System.out.println("O preço novo do produto é :" + precoNovo);
		} else if (mediaMensal >= 500 && mediaMensal < 1000 && precoAtual >= 30 && precoAtual < 80) {

			precoNovo = precoAtual + 0.15;
			System.out.println("O preço novo do produto é :" + precoNovo);
		} else if (mediaMensal >= 1000 && precoAtual >= 80) {
			
			precoNovo = precoAtual + 0.15;
			System.out.println("O preço novo do produto é :" + 0.95);

		}
		scanner.close();
	}
}
