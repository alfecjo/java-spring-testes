package semana05;

public class Calculadora {

    public static double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double numero1, double numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {      
        System.out.println();  
        System.out.println("Crie métodos para realizar operações básicas (soma, subtração, multiplicação e divisão)\nentre dois números?");
        System.out.println();

        double resultadoSoma = somar(5, 3);
        System.out.println("Soma: " + resultadoSoma);

        double resultadoSubtracao = subtrair(8, 4);
        System.out.println("Subtração: " + resultadoSubtracao);

        double resultadoMultiplicacao = multiplicar(6, 2);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        double resultadoDivisao = dividir(10, 2);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}