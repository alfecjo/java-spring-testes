package semana04;

import java.util.Scanner;

public class ContadorTiposArquivos {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Crie um programa que lê o nome de 5 arquivos (vetor/array) e deve indicar quais arquivos são do tipo áudio\n(mp3, wav, aac, etc),quantos de vídeo (mp4, mkv, etc) e outro tipo de extensão?");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        int numeroArquivos = 5;

        String[] nomesArquivos = new String[numeroArquivos];
        String[] categorias = new String[numeroArquivos];

        for (int i = 0; i < numeroArquivos; i++) {
            System.out.print("Digite o nome do arquivo " + (i + 1) + ": ");
            nomesArquivos[i] = scanner.nextLine();
        }

        for (int i = 0; i < numeroArquivos; i++) {
            categorias[i] = identificarCategoria(nomesArquivos[i]);
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < numeroArquivos; i++) {
            System.out.println("Arquivo: " + nomesArquivos[i] + " - Categoria: " + categorias[i]);
        }

        scanner.close();
    }

    private static String identificarCategoria(String nomeArquivo) {
        String extensao = obterExtensao(nomeArquivo);

        switch (extensao.toLowerCase()) {
            case "mp3":
            case "wav":
            case "aac":
                return "Áudio";
            case "mp4":
            case "mkv":
            case "avi":
            case "mov":
                return "Vídeo";
            default:
                return "Outro";
        }
    }

    private static String obterExtensao(String nomeArquivo) {
        int ultimoPonto = nomeArquivo.lastIndexOf('.');

        if (ultimoPonto != -1) {
            return nomeArquivo.substring(ultimoPonto + 1);
        }

        return "";
    }
}
