package semana06.heranca;

public class Figura {
    // Método para calcular a área (método genérico)
    public double calcularArea() {
        System.out.println("Método genérico para calcular a área da figura.");
        return 0.0;
    }
}

class Circulo extends Figura {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}

class Retangulo extends Figura {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return comprimento * largura;
    }
}

