package lote1_10_19;

public class Ex13 {
	public static void main(String[] args) {
		Double kg = 2.5, g = 0.0;
		Integer dia = 2;

		g = kg * 1000;
		g = g / dia;

		System.out.println("Foram consumidos " + g + " gramas por  " + dia + " dia(s)");
	}
}
