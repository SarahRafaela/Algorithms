package loter1_20_29;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira uma sequ�ncia de 3 n�meros.");
		System.out.println("Insira o de menor valor:");
		Integer n1 = scanner.nextInt();
		System.out.println("Insira o de valor m�dio:");
		Integer n2 = scanner.nextInt();
		System.out.println("Insira o de maior valor:");
		Integer n3 = scanner.nextInt();
		if (n3 > n1 && n3 > n2 && n1 < n2) {
			System.out.println("Insira um numero aleat�rio:");
			Integer n4 = scanner.nextInt();
			if (n3 < n4) {
				System.out.println(n1 + ";" + n2 + ";" + n3 + ";" + n4);
			} else if (n3 > n4 && n2 < n4) {
				System.out.println(n1 + ";" + n2 + ";" + n4 + ";" + n3);
			} else if (n2 > n4 && n1 < n4) {
				System.out.println(n1 + ";" + n4 + ";" + n2 + ";" + n3);
			} else if (n1 > n4) {
				System.out.println(n4 + ";" + n1 + ";" + n2 + ";" + n3);

			} else if (n4 == n1 || n4 == n2 || n4 == n3) {
				System.out.println(n1 + ";" + n2 + ";" + n3);
			}
		} else {
			System.out.println("erro ! Ordem incorreta");
		}

		scanner.close();
	}

}
