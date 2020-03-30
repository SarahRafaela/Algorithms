package lote1_10_19;

public class Ex17 {
	public static void main(String[] args) {
		Double l = 0., km = 0., vm = 50., t = 2.;

		km = vm * t;
		l = km / 12;
		System.out.println("Em " + vm + "km/h o veículo em" + km + "km gasta " + l + " litros.");
	}
}