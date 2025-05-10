package semana04;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SomandoHorasEMinutos {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Somando Horas e Minutos: Peça ao usuário para inserir uma hora no formato \"HH:mm\" e um número de minutos.\nUtilize a classe LocalTime para somar os minutos à hora inserida e exibir o resultado?");
                System.out.println();
        try {
            LocalTime hora = obterHoraDoUsuario("Digite a hora (HH:mm): ");

            int minutos = obterNumeroDeMinutosDoUsuario("Digite o número de minutos a serem somados: ");

            LocalTime resultado = hora.plusMinutes(minutos);

            System.out.println("Hora original: " + hora.format(DateTimeFormatter.ofPattern("HH:mm")));
            System.out.println("Minutos a serem somados: " + minutos);
            System.out.println("Resultado: " + resultado.format(DateTimeFormatter.ofPattern("HH:mm")));

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    private static LocalTime obterHoraDoUsuario(String mensagem) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(mensagem);
                String input = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                return LocalTime.parse(input, formatter);
            } catch (Exception e) {
                System.out.println("Formato de hora inválido. Tente novamente.");
            }
        }
    }

    private static int obterNumeroDeMinutosDoUsuario(String mensagem) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(mensagem);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Insira um número de minutos válido.");
            }
        }
    }
}
