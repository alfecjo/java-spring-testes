package semana05;

public class ConversorMoeda {
    public static double converterMoeda(double valor, double cotacao) {
        return valor * cotacao;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Crie um método para converter valores entre diferentes moedas (por exemplo, Real para Dólar).\nO método deve receber a cotação atual e o valor para conversão?");
        System.out.println();

        double valorReais = 100.0;
        double cotacaoDolar = 5.5;

        double valorDolares = converterMoeda(valorReais, cotacaoDolar);

        System.out.println(
                valorReais + " Reais é igual a " + valorDolares + " Dólares (usando a cotação " + cotacaoDolar + ").");
    }
}
