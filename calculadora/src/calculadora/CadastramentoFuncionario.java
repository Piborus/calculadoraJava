package calculadora;

import java.util.Scanner;

public class CadastramentoFuncionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] bancoDeDados = new String[4][4];

        cadastramento(sc, bancoDeDados);

        System.out.println("\nOrdem de cadastro:");
        exibirFuncionarios(bancoDeDados);

        System.out.println("\nOrdem alfabética de nome do funcionário:");
        ordenarPorNome(bancoDeDados);
        exibirFuncionarios(bancoDeDados);

        System.out.println("\nOrdem alfabética pelo setor:");
        ordenarPorSetor(bancoDeDados);
        exibirFuncionarios(bancoDeDados);

        System.out.println("\nDo maior ao menor salário:");
        ordenarPorSalario(bancoDeDados);
        exibirFuncionarios(bancoDeDados);
    }

    public static void cadastramento(Scanner sc, String[][] bancoDeDados) {
        for (int i = 0; i < bancoDeDados.length; i++) {
            System.out.println("\nFuncionário " + (i + 1));
            System.out.print("Nome: ");
            sc.nextLine();
            bancoDeDados[i][0] = sc.nextLine();
            System.out.print("Cargo: ");
            bancoDeDados[i][1] = sc.nextLine();
            System.out.print("Setor: ");
            bancoDeDados[i][2] = sc.nextLine();
            System.out.print("Salário: ");
            bancoDeDados[i][3] = sc.nextLine();
        }
    }

    public static void ordenarPorNome(String[][] bancoDeDados) {
        for (int i = 0; i < bancoDeDados.length - 1; i++) {
            for (int j = 0; j < bancoDeDados.length - i - 1; j++) {
                if (bancoDeDados[j][0].compareToIgnoreCase(bancoDeDados[j + 1][0]) > 0) {
                    String[] temp = bancoDeDados[j];
                    bancoDeDados[j] = bancoDeDados[j + 1];
                    bancoDeDados[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenarPorSetor(String[][] bancoDeDados) {
        for (int i = 0; i < bancoDeDados.length - 1; i++) {
            for (int j = 0; j < bancoDeDados.length - i - 1; j++) {
                if (bancoDeDados[j][2].compareToIgnoreCase(bancoDeDados[j + 1][2]) > 0) {
                    String[] temp = bancoDeDados[j];
                    bancoDeDados[j] = bancoDeDados[j + 1];
                    bancoDeDados[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenarPorSalario(String[][] bancoDeDados) {
        for (int i = 0; i < bancoDeDados.length - 1; i++) {
            for (int j = 0; j < bancoDeDados.length - i - 1; j++) {
                double salario1 = Double.parseDouble(bancoDeDados[j][3]);
                double salario2 = Double.parseDouble(bancoDeDados[j + 1][3]);
                if (salario1 < salario2) {
                    String[] temp = bancoDeDados[j];
                    bancoDeDados[j] = bancoDeDados[j + 1];
                    bancoDeDados[j + 1] = temp;
                }
            }
        }
    }

    public static void exibirFuncionarios(String[][] bancoDeDados) {
        System.out.printf("%-14s %-14s %-14s %-14s%n", "Nome", "Cargo", "Setor", "Salário");
        for (String[] funcionario : bancoDeDados) {
            System.out.printf("%-14s %-14s %-14s %-14s%n", funcionario[0], funcionario[1], funcionario[2], funcionario[3]);
        }
    }
}
