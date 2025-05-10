package semana04;

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Faça um programa que converta uma temperatura de Celsius para Fahrenheit ou vice-versa,\ndependendo da escolha do usuário (1 - C para F, 2 - F para C)?");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a opção:");
        System.out.println("1 - Converter de Celsius para Fahrenheit");
        System.out.println("2 - Converter de Fahrenheit para Celsius");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = converterCelsiusParaFahrenheit(celsius);
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = converterFahrenheitParaCelsius(fahrenheit);
            System.out.println("A temperatura em Celsius é: " + celsius);
        } else {
            System.out.println("Escolha inválida. Por favor, escolha 1 ou 2.");
        }

        scanner.close();
    }

    private static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
