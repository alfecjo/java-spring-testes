package semana04;

import java.util.Scanner;

public class RemoverPalavra {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Crie um programa que recebe uma frase e em seguida lê uma palavra.\nSeu programa deve remover da frase inicial a palavra indicada.");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.print("Digite a palavra a ser removida: ");
        String palavraRemover = scanner.nextLine();

        if (!contemPalavraCompleta(frase, palavraRemover)) {
            System.out.println("A palavra a ser removida não está presente na frase.");
        } else {
            String novaFrase = removerPalavra(frase, palavraRemover);

            System.out.println("Frase com a palavra removida: " + novaFrase);
        }

        scanner.close();
    }

    private static boolean contemPalavraCompleta(String frase, String palavra) {
        frase = " " + frase + " ";

        palavra = " " + palavra + " ";

        return frase.contains(palavra);
    }

    private static String removerPalavra(String frase, String palavraRemover) {
        String[] palavras = frase.split("\\s+");

        StringBuilder novaFrase = new StringBuilder();

        for (String palavra : palavras) {
            if (!palavra.equals(palavraRemover)) {
                novaFrase.append(palavra).append(" ");
            }
        }

        return novaFrase.toString().trim();
    }
}
