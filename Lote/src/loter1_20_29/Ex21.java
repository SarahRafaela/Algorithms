package loter1_20_29;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Double n1 = 0.0, n2 = 0.0, n3 = 0.0, n4 = 0.0;

		System.out.println("insira sua primeira nota:");
		n1 = scanner.nextDouble();
		System.out.println("insira sua segunda nota:");
		n2 = scanner.nextDouble();
		System.out.println("insira sua terceira nota:");
		n3 = scanner.nextDouble();
		System.out.println("insira sua quarta nota:");
		n4 = scanner.nextDouble();
		if (n1 <= 10 && n2 <= 10 && n3 <= 10 && n4 <= 10) {

			Double media = (n1 + n2 + n3 + n4) / 4;
			if (media >= 6) {

				System.out.println("APROVADO! Com Média :" + media);

			} else if (media >= 3 || media < 6) {

				System.out.println("EXAME! Com Média :" + media);

			} else {

				System.out.println("RETIDO! Com Média :" + media);

			}
		}
		scanner.close();
	}
}
