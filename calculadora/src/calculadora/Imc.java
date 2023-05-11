package calculadora;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo a calculadora de Imc.");
		
		int peso = 0;
		long altura = 0;
		
		calorias(peso);
		System.out.println("Obrigado por usar a calculadora de IMC!");
	}

	public static void calorias(int peso) {
		
		System.out.print("\nDigite o seu peso: ");
		Scanner sc = new Scanner(System.in);
		peso = sc.nextInt();
		
		System.out.print("\nDigite a sua altura:");
		String alturastr = sc.next();
		
		Double altura = Double.parseDouble(alturastr);
		double imc = peso/(altura*altura);
		
		
		if((imc >= 15) && (imc <= 19.9)) {
			System.out.println("Você está magro " + imc);
		} else if ((imc >= 20) && (imc <= 24.9)){
			System.out.println("Você está eutrofico " + imc);
		} else if ((imc >= 25) && (imc <= 29.9)) {
			System.out.println("Você está pre-obeso " + imc);
		} else if ((imc >= 30) && (imc <= 34.9)){
			System.out.println("Você está obeso " + imc);
		} else {
			System.out.println("Muito obeso");
		}
		
		 System.out.print("\nDeseja calcular novamente? (s/n): ");
	        String resposta = sc.next();
	        if (resposta.equalsIgnoreCase("s")) {
	            calorias(peso);
	        }
	}
}
