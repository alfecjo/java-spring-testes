package semana04;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculoIdade {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Cálculo de Idade: Solicite ao usuário que forneça a data de nascimento no formato \"yyyy-MM-dd\".\nCalcule e exiba a idade da pessoa em anos, meses e dias utilizando a classe LocalDate?");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a data de nascimento no formato yyyy-MM-dd: ");
            String inputData = scanner.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            LocalDate dataNascimento = LocalDate.parse(inputData, formatter);

            LocalDate dataAtual = LocalDate.now();

            if (dataNascimento.isAfter(dataAtual)) {
                System.out.println("A data de nascimento deve ser no passado.");
                return;
            }

            Period periodo = Period.between(dataNascimento, dataAtual);

            System.out.printf("Idade: %d anos, %d meses e %d dias%n",
                    periodo.getYears(), periodo.getMonths(), periodo.getDays());

        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Formato de data inválido. Certifique-se de usar o formato yyyy-MM-dd.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
