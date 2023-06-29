package calculadora;

import java.util.Scanner;

public class MinimoMultiploComumMMC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Vamos descobrir o MMC (Minimo Multiplo Comum)");

		System.out.print("\nDigite o primeiro numero: ");
		int num1 = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int num2 = sc.nextInt();
		int numMaior = Math.max(num1, num2);
		int numMenor = Math.min(num1, num2);
		int mmc = numMaior;

		for (int i = 0; mmc % numMenor != 0; i++) {
			mmc += numMaior;
			System.out.println("\nO minimo multiplo comum é: " + mmc);
			
		}

		while (mmc % numMenor != 0) {
			mmc += numMaior;
		}
		System.out.println("\nO minimo multiplo comum é: " + mmc);
		main(null);
	}

}
