package semana04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Peça ao usuário para inserir três números e exiba o maior deles?");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três números:");

        System.out.print("Número 1: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Número 2: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Número 3: ");
        double numero3 = scanner.nextDouble();

        List<Double> maioresNumeros = obterMaioresNumeros(numero1, numero2, numero3);

        if (maioresNumeros.size() == 1) {
            System.out.println("O maior número é: " + maioresNumeros.get(0));
        } else {
            System.out.println("Mais de uma ocorrência! Números: " + maioresNumeros);
        }

        scanner.close();
    }

    private static List<Double> obterMaioresNumeros(double num1, double num2, double num3) {
        List<Double> maiores = new ArrayList<>();
        double maior = Math.max(Math.max(num1, num2), num3);

        if (num1 == maior) {
            maiores.add(num1);
        }
        if (num2 == maior) {
            maiores.add(num2);
        }
        if (num3 == maior) {
            maiores.add(num3);
        }

        return maiores;
    }
}
