package loter1_20_29;

public class Ex20 {
	public static void main(String[] args) {
		Double a =1.0, b = 12.0, c = -13.0;
		Double x1 = 0.0, x2 = 0.0;

		Double delta = (Math.pow(b, 2)) - 4 * a * c;
		System.out.println(a + "x^2 +" + b + "X +" + c + " =0");
		if (delta == 0) {
			x1 = (-b) + (Math.sqrt(delta)) / (2 * a);
			x2 = x1;
			System.out.println("X1 é igual a X2. Tendo valor igual a : " + x1);
		} else if (delta > 0) {
			x1 = (-b) + (Math.sqrt(delta)) / (2 * a);
			x2 = (-b) - (Math.sqrt(delta)) / (2 * a);
			System.out.println("X1: " + x1 + "e X2: " + x2);
		} else {
			System.out.println("Não existem raízes reais");
		}

	}
}
