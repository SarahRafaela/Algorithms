package loter1_20_29;

import java.util.Scanner;

public class Ex24 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Insira um n�mero");
	Double x = scanner.nextDouble();
	
	if (x % 6 == 0) {
		System.out.println(x +"� divisivel por 2 e por 3 ");
	}else {
		System.out.println(x +" n�o � divisivel por 2 e por 3  consecutivamente");
	}
	scanner.close();
}
}
