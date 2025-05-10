package semana04;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Crie um programa que solicite dois números e realize operações básicas \n(1 - adição, 2 - subtração, 3 - multiplicação, 4 - divisão)\ncom base na escolha do usuário?");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        exibirMenu();

        System.out.print("Escolha a operação (1 a 4): ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Resultado da adição: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado da divisão: " + (num1 / num2));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Escolha inválida. Por favor, escolha entre 1 e 4.");
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
    }
}
