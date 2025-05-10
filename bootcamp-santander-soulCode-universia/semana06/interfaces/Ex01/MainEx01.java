package interfaces.Ex01;

public class MainEx01 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());

        Quadrado quadrado = new Quadrado(4);
        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do Quadrado: " + quadrado.calcularPerimetro());

        Triangulo triangulo = new Triangulo(3, 4);
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do Triângulo: " + triangulo.calcularPerimetro());
    }
}
