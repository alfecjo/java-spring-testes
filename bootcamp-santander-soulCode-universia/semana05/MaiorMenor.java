package semana05;

public class MaiorMenor {
    public static void encontrarMaiorMenor(double[] vetor) {
        if (vetor == null || vetor.length == 0) {
            System.out.println("Vetor vazio ou nulo.");
            return;
        }

        double maior = vetor[0];
        double menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            } else if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("O maior valor no vetor é: " + maior);
        System.out.println("O menor valor no vetor é: " + menor);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Crie um método que recebe um vetor de números como parâmetro e indica qual o maior\nvalor e qual o menor valor?");
                System.out.println();

        double[] numeros = { 10.5, 5.2, 8.7, 15.3, 3.8 };

        encontrarMaiorMenor(numeros);
    }
}