package semana04;

import java.util.Scanner;

public class SomaNumerosPares {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Faça um programa que solicite ao usuário um número e calcule a soma de todos os números pares de 0 até o número inserido,\nutilizando um loop for. Se for digitado o número 20, será somado 0 + 2 + 4 + 8 + ... + 18 + 20?");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular a soma dos números pares: ");
        int numero = scanner.nextInt();

        int soma = 0;

        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números pares até " + numero + " é: " + soma);

        scanner.close();
    }
}
