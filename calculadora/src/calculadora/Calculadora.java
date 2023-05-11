package calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		System.out.println("digite 1 para soma");
		System.out.println("digite 2 para subtrair");
		System.out.println("digite 3 para multiplicar");
		System.out.println("digite 4 para dividir");
		System.out.println("digite 5 para crescente");
		System.out.println("digite 6 para decrescente");
		System.out.println("digite 7 para sair");
		
		System.out.println("Informe a opção");
		
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		System.out.println("A opção escolhida foi: " + op);
		
		if(op>7){
			System.out.println("Opção invalida");
			return;
		}
		
		if (op == 5) {
			crescente();
		}else  if (op == 6) {
			decrescente();
		}else  if (op == 7) {
			System.out.println("Acabou");
		}else {
			calculadora(sc, op);
		}
		
		if (op != 7) {
			main(null);
		}
		
	
		
		
	}
	private static void calculadora(Scanner sc, int op) {
		System.out.println("Digite o primeiro número: ");
		int num_1 = sc.nextInt();
		System.out.println("Seu primeiro número é: " + num_1);
		
		System.out.print("Digite a segundo número: ");
		int num_2 = sc.nextInt();
		System.out.println("Seu segundo numero: " + num_2);
		
		if (op == 1) {
			soma(num_1, num_2);
		}
		else if (op == 2) {
			subtrair(num_1, num_2);
		}
		else if (op == 3) {
			mutiplicacao(num_1, num_2);
		}
		else if (op == 4) {
			divisao(num_1, num_2);
		}else {
			System.out.println("Opção invalida");
		}
	}
		public static void soma (int num_1, int num_2) {
			int soma = num_1 + num_2;
			System.out.println("A soma de " + num_1 + "+" + num_2 + " = " + soma);	
		}
		
		
		public static void subtrair (int num_1, int num_2){
			int subtrair = num_1 - num_2;
			System.out.println("A subtração de " + num_1 + "-" + num_2 + " = " + subtrair);
					
		}
		
		public static void mutiplicacao (int num_1, int num_2) {
			int mutiplicacao = num_1 * num_2;
			System.out.print("A mutiplicação de \" + num_1 + \" x \" + num_2 + \" = \" + multiplicacao");
		}
		
		 public static void divisao(float num_1, float num_2) {
			   float divisao = num_1 / num_2;
			   System.out.println("A divisão de " + num_1 + " / " + num_2 + " = " + divisao);
			
		}
		 
		 public static void crescente() {
			 Scanner sc = new Scanner(System.in); 
			 System.out.println("Sua seguencia é: ");  
			 int num = sc.nextInt();
			 for (int i = 1; i <= num; i++) {
					System.out.println(i);
					}
				}		
					
		 
		public static void decrescente() {
			Scanner sc = new Scanner(System.in); 
			System.out.println("Sua seguencia é: ");
			int num = sc.nextInt();
			int i = num;
	        while (i >= 1){
	            System.out.println(i);
	            i--;
	        }
			
		}					
	}


