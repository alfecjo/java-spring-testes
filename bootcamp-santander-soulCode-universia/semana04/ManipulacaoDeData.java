package semana04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ManipulacaoDeData {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Manipulação de Data: Peça ao usuário para inserir uma data no formato \"yyyy-MM-dd\".\nEm seguida, converta a string para um objeto LocalDate e imprima o dia do mês correspondente?");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data no formato yyyy-MM-dd: ");
        String inputData = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate data = LocalDate.parse(inputData, formatter);

            int diaDoMes = data.getDayOfMonth();
            System.out.println("Dia do mês correspondente: " + diaDoMes);

        } catch (Exception e) {
            System.out.println("Formato de data inválido. Certifique-se de usar o formato yyyy-MM-dd.");
        }

        scanner.close();
    }
}
