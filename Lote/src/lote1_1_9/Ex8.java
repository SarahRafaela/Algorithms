package lote1_1_9;

public class Ex8 {
	public static void main(String[] args) {
		Double deposito = 2000.0;
		Integer mes = 1;
		Double rendimento = 0.0;

		rendimento = deposito * (1.3 * mes);

		System.out.println("O redimento do depósito da poupança de :" + deposito + "R$ é de:" + rendimento + "R$.");
	}

}
