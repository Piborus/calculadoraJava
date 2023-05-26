package calculadora;

public class Teste2 {
	
	    
	    // Função para calcular o MMC de dois números
	    public static int calcularMMC(int a, int b) {
	        int maior = Math.max(a, b);
	        int menor = Math.min(a, b);
	        int mmc = maior;
	        
	        while (mmc % menor != 0) {
	            mmc += maior;
	        }
	        
	        return mmc;
	    }
	    
	    public static void main(String[] args) {
	        int numero1 = 10;
	        int numero2 = 44;
	        
	        int mmc = calcularMMC(numero1, numero2);
	        
	        System.out.println("O MMC de " + numero1 + " e " + numero2 + " é: " + mmc);
	    }
	}


