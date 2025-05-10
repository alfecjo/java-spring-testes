package semana04;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Desenvolva um jogo em que o computador gera um número aleatório e o usuário tenta adivinhar.\nUse um loop para permitir um número fixo de tentativas (use a classe Random para gerar números aleatórios)?");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int numeroTentativas = 5;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        for (int tentativa = 1; tentativa <= numeroTentativas; tentativa++) {
            System.out.print("Tentativa " + tentativa + ": Digite sua adivinhação: ");
            int palpiteUsuario = scanner.nextInt();

            if (palpiteUsuario == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou!");
                break;
            } else {
                System.out.println("Tente novamente. Dica: o número está " +
                        (palpiteUsuario < numeroAleatorio ? "maior" : "menor") + ".");
            }
        }

        System.out.println("O número correto era: " + numeroAleatorio);

        scanner.close();
    }
}
