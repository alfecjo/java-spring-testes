package semana04;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VerificacaoNascimento {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Crie um programa que lê a data de nascimento de uma pessoa (dia, mês e ano).\nE indica se ela nasceu antes ou depois do natal do mesmo ano;?");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data de nascimento no formato dd-MM-yyyy: ");
        String inputData = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate dataNascimento = LocalDate.parse(inputData, formatter);

            LocalDate natal = LocalDate.of(dataNascimento.getYear(), Month.DECEMBER, 25);

            if (dataNascimento.isBefore(natal)) {
                System.out.println("A pessoa nasceu antes do Natal do mesmo ano.");
            } else {
                System.out.println("A pessoa nasceu depois do Natal do mesmo ano.");
            }

        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Formato de data inválido. Certifique-se de usar o formato dd-MM-yyyy.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
