package semana04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiferencaDeDatas {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Diferença de Datas: Peça ao usuário para inserir duas datas no formato \"yyyy-MM-dd\".\nCalcule e exiba, se a primeira data vêm antes ou depois da segunda data?");
        System.out.println();

        try {
            LocalDate data1 = obterDataDoUsuario("Digite a primeira data (yyyy-MM-dd): ");
            LocalDate data2 = obterDataDoUsuario("Digite a segunda data (yyyy-MM-dd): ");

            if (data1.isBefore(data2)) {
                System.out.println("A primeira data vem antes da segunda data.");
            } else if (data1.isAfter(data2)) {
                System.out.println("A primeira data vem depois da segunda data.");
            } else {
                System.out.println("As datas são iguais.");
            }

        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Formato de data inválido. Certifique-se de usar o formato \"yyyy-MM-dd\".");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    private static LocalDate obterDataDoUsuario(String mensagem) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(mensagem);
                String input = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                return LocalDate.parse(input, formatter);
            } catch (java.time.format.DateTimeParseException e) {
                System.out.println("Formato de data inválido. Tente novamente.");
            }
        }
    }
}
