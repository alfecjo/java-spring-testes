package semana04;

import java.util.Scanner;

public class ConversorDeNotas {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Faça um programa que receba uma nota de 0 a 100 e converta para conceitos (A, B, C, D, F)\nusando estruturas condicionais?");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a nota (de 0 a 100): ");
            int nota = scanner.nextInt();

            if (nota < 0 || nota > 100) {
                System.out.println("Por favor, insira uma nota válida de 0 a 100.");
            } else {
                char conceito = converterParaConceito(nota);
                System.out.println("Conceito: " + conceito);
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Certifique-se de inserir um valor numérico válido.");
        } finally {
            scanner.close();
        }
    }

    private static char converterParaConceito(int nota) {
        if (nota >= 90) {
            return 'A';
        } else if (nota >= 80) {
            return 'B';
        } else if (nota >= 70) {
            return 'C';
        } else if (nota >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
