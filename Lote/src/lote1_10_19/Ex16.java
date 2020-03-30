package lote1_10_19;

public class Ex16 {
	public static void main(String[] args) {
		Integer hTrab = 120, nDesc = 2;
		Double valorH = 30., percentDesc = 0.05, salLiquido = 0., salBruto = 0.;
		salBruto = valorH * hTrab;
		salLiquido = (salBruto - percentDesc) + (100 * nDesc);

		System.out.println("Sálario a receber:" + salLiquido + "R$");
	}
}
