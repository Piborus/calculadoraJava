package calculadora;

import java.util.Arrays;

public class Arraylista {

	public static void main(String[] args) {
		String[] coisas = { "abelha", "suricate", "carro", "navio", "avião", "pizza", "zebra" };
		String[] ordenado = Arrays.copyOf(coisas, coisas.length);
		Arrays.sort(ordenado);

		OrdemAlfabetica(coisas, ordenado);
	}

	public static void OrdemAlfabetica(String[] coisas, String[] ordenado) {
		int i = 0;
		while (i < coisas.length) {
			boolean naOrdem = coisas[i].equals(ordenado[i]);
			System.out.println(coisas[i] + ": " + naOrdem);
			i++;
		}
	}
}
