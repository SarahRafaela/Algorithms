package loter1_20_29;

import java.util.Scanner;

public class Ex25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer hi = 0, hf = 0, mi = 0, mf = 0;

		System.out.println("Hora inicial do jogo(Ex. 23) : ");
		hi = scanner.nextInt();
		System.out.println("Minuto inicial do jogo (Ex 50):");
		mi = scanner.nextInt();
		if (hi > 23 || mi > 59) {
			System.out.println("Formato da hora inválido");
		} else {
			System.out.println("Hora final do jogo(Ex. 23) : ");
			hf = scanner.nextInt();
			System.out.println("Minuto final do jogo (Ex 50):");
			mf = scanner.nextInt();
			if (hf > 23 || mf > 59) {
				System.out.println("Formato da hora inválido");
				
			}else if (hi> hf){
				hf = hf + 24;
				Integer tH = (hf- hi);
				if (mf < mi){
					mf= mf + 60;
				
				Integer tM = (mf - mi);
				System.out.println("Duração do jogo é de :" + tH + ":" + tM + ".");
				}
				
				
			}
		}
		scanner.close();
	}
}
