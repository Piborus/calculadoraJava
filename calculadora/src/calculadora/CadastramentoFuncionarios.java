package calculadora;

import java.util.Scanner;

public class CadastramentoFuncionarios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] bancoDeDados = new String[4][4];

		bancoDeDados = cadastramento(sc, bancoDeDados);
		ordemCadastro(bancoDeDados);
		ordenarPorNome(bancoDeDados);
		ordenarPorCargo(bancoDeDados);	
		ordenarPorSetor(bancoDeDados);	
		ordenarPorSalario(bancoDeDados);
		
	}

	public static String[][] cadastramento(Scanner sc, String[][] bancoDeDados) {

		System.out.println("Digite o numero de funcionarios.");
		int numeroFuncionarios = sc.nextInt();
		sc.nextLine();
		bancoDeDados = new String[numeroFuncionarios][4];
		for (int i = 0; i < bancoDeDados.length; i++) {
			System.out.println("\nFuncionário " + (i + 1));
			System.out.print("Nome: ");
			bancoDeDados[i][0] = sc.next();
			System.out.print("Cargo: ");
			bancoDeDados[i][1] = sc.next();
			System.out.print("Setor: ");
			bancoDeDados[i][2] = sc.next();
			System.out.print("Salário: ");
			bancoDeDados[i][3] = sc.next();
		}
		return bancoDeDados;
	}

	public static void ordemCadastro(String[][] bancoDeDados) {

		System.out.println("\n=== Ordem de cadastro ===");
		for (int i = 0; i < bancoDeDados.length; i++) {
			System.out.println("\nFuncionário " + (i + 1));
			System.out.println("Nome: " + bancoDeDados[i][0]);
			System.out.println("Cargo: " + bancoDeDados[i][1]);
			System.out.println("Setor: " + bancoDeDados[i][2]);
			System.out.println("Salário: " + bancoDeDados[i][3]);
		}

	}

	public static void ordenarPorNome(String[][] bancoDeDados) {
		for (int i = 0; i < bancoDeDados.length - 1; i++) {
			for (int j = 0; j < bancoDeDados.length - i - 1; j++) {
				if (bancoDeDados[j][0].compareToIgnoreCase(bancoDeDados[j + 1][0]) > 0) {
					String[] muda = bancoDeDados[j];
					bancoDeDados[j] = bancoDeDados[j + 1];
					bancoDeDados[j + 1] = muda;
				}
			}
		}
		System.out.println("\n\t========Lista de Funcionarios: POR ORDEM DE NOME ========");
		System.out.printf("%-14s %-14s %-14s %-14s%n", "Nome", "Cargo", "Setor", "Salário");
		for (String[] funcionario : bancoDeDados) {
			System.out.printf("%-14s %-14s %-14s %-14s%n", funcionario[0], funcionario[1], funcionario[2],
					funcionario[3]);
		}
	}
	
	public static void ordenarPorCargo(String[][] bancoDeDados) {
		for (int i = 0; i < bancoDeDados.length - 1; i++) {
			for (int j = 0; j < bancoDeDados.length - i - 1; j++) {
				if (bancoDeDados[j][1].compareToIgnoreCase(bancoDeDados[j + 1][1]) > 0) {
					String[] muda = bancoDeDados[j];
					bancoDeDados[j] = bancoDeDados[j + 1];
					bancoDeDados[j + 1] = muda;
				}
			}
		}
		System.out.println("\n\t========Lista de Funcionarios: POR ORDEM DE CARGO ========");
		System.out.printf("%-14s %-14s %-14s %-14s%n", "Nome", "Cargo", "Setor", "Salário");
		for (String[] funcionario : bancoDeDados) {
			System.out.printf("%-14s %-14s %-14s %-14s%n", funcionario[0], funcionario[1], funcionario[2],
					funcionario[3]);
		}
		
	}

	public static void ordenarPorSetor(String[][] bancoDeDados) {
		for (int i = 0; i < bancoDeDados.length - 1; i++) {
			for (int j = 0; j < bancoDeDados.length - i - 1; j++) {
				if (bancoDeDados[j][2].compareToIgnoreCase(bancoDeDados[j + 1][2]) > 0) {
					String[] muda = bancoDeDados[j];
					bancoDeDados[j] = bancoDeDados[j + 1];
					bancoDeDados[j + 1] = muda;
				}
			}
		}
		System.out.println("\n\t========Lista de Funcionarios: POR ORDEM DE SETOR ========");
		System.out.printf("%-14s %-14s %-14s %-14s%n", "Nome", "Cargo", "Setor", "Salário");
		for (String[] funcionario : bancoDeDados) {
			System.out.printf("%-14s %-14s %-14s %-14s%n", funcionario[0], funcionario[1], funcionario[2],
					funcionario[3]);
		}
		
	}

	public static void ordenarPorSalario(String[][] bancoDeDados) {
		for (int i = 0; i < bancoDeDados.length - 1; i++) {
			for (int j = 0; j < bancoDeDados.length - i - 1; j++) {
				double salario1 = Double.parseDouble(bancoDeDados[j][3]);
				double salario2 = Double.parseDouble(bancoDeDados[j + 1][3]);
				if (salario1 < salario2) {
					String[] muda = bancoDeDados[j];
					bancoDeDados[j] = bancoDeDados[j + 1];
					bancoDeDados[j + 1] = muda;
				}
			}
		}
		System.out.println("\n\t========Lista de Funcionarios: POR ORDEM DE SALARIO ========");
		System.out.printf("%-14s %-14s %-14s %-14s%n", "Nome", "Cargo", "Setor", "Salário");
		for (String[] funcionario : bancoDeDados) {
			System.out.printf("%-14s %-14s %-14s %-14s%n", funcionario[0], funcionario[1], funcionario[2],
					funcionario[3]);
		}
	}


}
