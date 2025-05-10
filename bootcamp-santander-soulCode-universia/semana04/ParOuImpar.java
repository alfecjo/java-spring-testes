package semana04;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Escreva um programa que determine se um número é par ou ímpar (um número par é divisível por 2,\nou seja, tem resto 0)?");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (ehPar(numero)) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }

        scanner.close();
    }

    private static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}
