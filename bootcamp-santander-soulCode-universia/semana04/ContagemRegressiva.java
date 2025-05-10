package semana04;

import java.util.Scanner;

public class ContagemRegressiva {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Escreva um programa que inicie uma contagem regressiva a partir de um número especificado\npelo usuário até zero, utilizando um loop while?");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para iniciar a contagem regressiva: ");
        int numeroInicial = scanner.nextInt();

        if (numeroInicial <= 0) {
            System.out.println("Por favor, insira um número maior que zero.");
            return;
        }

        System.out.println("Contagem regressiva iniciada:");

        while (numeroInicial >= 0) {
            System.out.println(numeroInicial);
            numeroInicial--;
        }

        scanner.close();
    }
}
