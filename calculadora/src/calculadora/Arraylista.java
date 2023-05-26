package calculadora;

import java.util.Arrays;

public class Arraylista {

	public static void main(String[] args) {

		String[] coisas = { "carro", "navio", "avião", "pizza", "zebra" };

		String[] ordenado = Arrays.copyOf(coisas, coisas.length);
		Arrays.sort(ordenado);

		ordenar(coisas, ordenado);
	}

	public static void ordenar(String[] coisas, String[] ordenado) {

		int i = 0;
		while (i < coisas.length) {
			if (coisas[i].equals(ordenado[i])) {
				
				System.out.println("A string '" + coisas[i] + "' está em ordem alfabética.");
			} else {
				
				System.out.println("A string '" + coisas[i] + "' não está em ordem alfabética.");
			}
			i++;
		}
		
	}


}
