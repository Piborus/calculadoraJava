package calculadora;

import java.util.Random;
import java.util.Arrays;

public class Arraylista2 {

	public static void main(String[] args) {

		int[] numeros = new int[5];
		int[] numeros2 = Arrays.copyOf(numeros, numeros.length);

		numerosAleatoriosLista(numeros, numeros2);
		crescenteLista(numeros, numeros2);
		descrescenteLista(numeros, numeros2);
		somaLista(numeros, numeros2);

	}

	public static void numerosAleatoriosLista(int[] numeros, int[] numeros2) {

		Random cr = new Random();

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = cr.nextInt(100);
			numeros2[i] = numeros[i];
			System.out.println("\tOs numeros gerados foram: " + numeros2[i]);
		}
		System.out.println();
	}

	public static void crescenteLista(int[] numeros, int[] numeros2) {

		for (int i = 0; i < numeros.length - 1; i++) {
			for (int j = 0; j < numeros.length - i - 1; j++) {
				if (numeros[j] > numeros[j + 1]) {
					int novaOrdemCrescente = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = novaOrdemCrescente;
				}
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("\t\tA ordem crescente fica: " + numeros[i]);
		}
	}

	public static void descrescenteLista(int[] numeros, int[] numeros2) {
		
		for (int i = 0; i < numeros2.length - 1; i++) {
			for (int j = 0; j < numeros.length - i - 1; j++) {
				if (numeros2[j] < numeros2[j + 1]) {
					int novaOrdemDecrescente = numeros2[j];
					numeros2[j] = numeros2[j + 1];
					numeros2[j + 1] = novaOrdemDecrescente;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("\t\t\tA ordem decrescente fica: " + numeros2[i]);
		}
	}

	public static void somaLista(int[] numeros, int[] numeros2) {
		
		int soma = 0;
		for (int n : numeros) {
			soma += n;
		}
		System.out.println();
		System.out.println("A soma é: " + soma);
	


	}

}

//Bubble SortBubble sort é um algoritmo de classificação simples que percorre
// repetidamente a lista a ser classificada, compara cada par de itens
// adjacentes e os troca se estiverem na ordem errada. A passagem pela lista é
// repetida até que nenhuma troca seja necessária, o que indica que a lista está
// classificada. O algoritmo, que é uma classificação por comparação, é nomeado
// de acordo com a maneira como os elementos menores ou maiores “borbulham” no
// topo da lista. Embora o algoritmo seja simples, ele é muito lento e
// impraticável para a maioria dos problemas, mesmo quando comparado à ordenação
// por inserção. A classificação por bolhas pode ser prática se a entrada
// estiver na ordem de classificação com alguns elementos fora de ordem quase na
// posição. Também é conhecido como tipo de afundamento.
