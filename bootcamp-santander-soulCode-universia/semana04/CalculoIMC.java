package semana04;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Receba o peso e a altura de uma pessoa e calcule o IMC, exibindo uma mensagem com a categoria\n(abaixo do peso, peso normal, sobrepeso, etc.)?");
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o peso (em kg): ");
            String inputPeso = scanner.nextLine().replace(".", ",");

            System.out.print("Digite a altura (em metros): ");
            String inputAltura = scanner.nextLine().replace(".", ",");

            double peso = Double.parseDouble(inputPeso);
            double altura = Double.parseDouble(inputAltura);

            double imc = calcularIMC(peso, altura);
            String categoria = obterCategoriaIMC(imc);

            System.out.printf("Seu IMC é: %.2f%n", imc);
            System.out.println("Categoria: " + categoria);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Certifique-se de inserir valores numéricos válidos.");
        } finally {
            scanner.close();
        }
    }

    private static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    private static String obterCategoriaIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Peso normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidade Grau I";
        } else if (imc < 39.9) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III";
        }
    }
}
