package semana04;

import java.util.Scanner;

public class CalculoDesconto {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Peça ao usuário para inserir o preço de um produto e a porcentagem de desconto.\nCalcule o preço final com o desconto aplicado?");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o preço do produto: ");
            double precoProduto = scanner.nextDouble();

            System.out.print("Digite a porcentagem de desconto: ");
            double percentualDesconto = scanner.nextDouble();

            if (precoProduto < 0 || percentualDesconto < 0 || percentualDesconto > 100) {
                System.out.println("Por favor, insira valores válidos.");
            } else {
                double precoFinal = calcularPrecoComDesconto(precoProduto, percentualDesconto);
                System.out.println("Preço final com desconto: " + precoFinal);
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Certifique-se de inserir valores numéricos válidos.");
        } finally {
            scanner.close();
        }
    }

    private static double calcularPrecoComDesconto(double preco, double descontoPercentual) {
        double desconto = (descontoPercentual / 100) * preco;
        return preco - desconto;
    }
}
