package loter1_20_29;

import java.util.Scanner;

public class Ex26 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double x = 0., y = 0.0, res = 0.0;

		System.out.println("Insira o primeiro n�mero:");
		x = scanner.nextDouble();
		System.out.println("Insira o segundo n�mero:");
		y = scanner.nextDouble();

		if (x > y || x % y == 0) {
			res = x / y;
			System.out.println("A resposta �: " + res);

		} else if (y > x || y % x == 0) {
			res = y / x;
			System.out.println("A resposta �: " + res);
	
		} else if (x == y) {
			res = y / x;
			System.out.println("A resposta �: " + res);
		}

		scanner.close();
	}
}
