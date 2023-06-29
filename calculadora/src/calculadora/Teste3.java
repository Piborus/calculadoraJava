package calculadora;

import java.util.Random;

public class Teste3 {
    public static void main(String[] args) {
        int[] crescente = new int[5];
        
        Random random = new Random();
        
        // Preencher o array com números aleatórios
        for (int i = 0; i < crescente.length; i++) {
            crescente[i] = random.nextInt(100); // Gera números aleatórios de 0 a 99
        }
        
        // Bubble Sort para ordenar em ordem crescente
        for (int i = 0; i < crescente.length - 1; i++) {
            for (int j = 0; j < crescente.length - i - 1; j++) {
                if (crescente[j] > crescente[j + 1]) {
                    // Trocar os elementos de posição
                    int temp = crescente[j];
                    crescente[j] = crescente[j + 1];
                    crescente[j + 1] = temp;
                }
            }
        }
        
        // Imprimir o array ordenado
        for (int i = 0; i < crescente.length; i++) {
            System.out.println(crescente[i]);
        }
    }
}

