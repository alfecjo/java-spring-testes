package semana05;

public class ManipulacaoStrings {

    public static int contarVogais(String palavra) {
        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < palavra.length(); i++) {
            char caractere = palavra.charAt(i);
            if (vogais.indexOf(caractere) != -1) {
                contador++;
            }
        }

        return contador;
    }

    public static String inverterString(String palavra) {
        StringBuilder inversa = new StringBuilder();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            inversa.append(palavra.charAt(i));
        }
        return inversa.toString();
    }

    public static boolean ehPalindromo(String palavra) {
        String palavraInvertida = inverterString(palavra);
        return palavra.equalsIgnoreCase(palavraInvertida);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Crie método para: contar quantas vogais tem em uma string, inverter uma string e verificar se a palavra\né um palíndromo (um palíndromo é uma palavra que inversa se lê igual)?");
        System.out.println();

        String exemplo1 = "DesenvolvedorFullStackJava";
        System.out.println("A palavra '" + exemplo1 + "' possui " + contarVogais(exemplo1) + " vogais.");

        String exemplo2 = "hello";
        System.out.println("A palavra invertida de '" + exemplo2 + "' é '" + inverterString(exemplo2) + "'.");

        String exemplo3 = "radar";
        if (ehPalindromo(exemplo3)) {
            System.out.println("'" + exemplo3 + "' é um palíndromo.");
        } else {
            System.out.println("'" + exemplo3 + "' não é um palíndromo.");
        }
    }
}
