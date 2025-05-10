package semana04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Crie um programa que recebe uma data e indica se é dia da semana\nou final da semana. Para isto use o método getDayOfWeek e o tipo DayOfWeek?");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato yyyy-MM-dd: ");
        String inputData = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate data = LocalDate.parse(inputData, formatter);

            DayOfWeek diaDaSemana = data.getDayOfWeek();

            if (diaDaSemana == DayOfWeek.SATURDAY || diaDaSemana == DayOfWeek.SUNDAY) {
                System.out.println("É final de semana!");
            } else {
                System.out.println("É dia da semana.");
            }

        } catch (Exception e) {
            System.out.println("Formato de data inválido. Certifique-se de usar o formato yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }
}