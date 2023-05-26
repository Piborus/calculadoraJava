package calculadora;

import java.util.Scanner;

public class Adivinha {
	
public static void mentalista(int adivinha, int numero) {
		
		if(adivinha < numero) {
			System.out.println("Errou o numero é maior, digite novamente: ");
			return;
		}
		else if (adivinha > numero) {
			System.out.println("Errou o numero é menor, digite novamente: ");
			return;
		}
		else if (adivinha == numero) {	
				System.out.println("Parabéns você acertou!!");
				return; 
		}			     
	}
	
	public static void main(String[] args) {
		
		int adivinha = 0;
		int numero = 0;
		
		System.out.println("Bem vindo ao mentalista, digite um numero e faça o seu amigo adivinha.");
		
		System.out.println("Digite o numero: ");
		Scanner sc_1 = new Scanner(System.in);
		numero = sc_1.nextInt();
		
		while(adivinha != numero) {
			System.out.println("Qual é o seu numero: ");
			adivinha = sc_1.nextInt();
			mentalista(adivinha, numero);
		}		
	}					
}
 
