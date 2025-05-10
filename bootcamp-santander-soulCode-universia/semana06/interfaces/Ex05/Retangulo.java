package interfaces.Ex05;

public class Retangulo implements Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando retângulo...");
    }

    @Override
    public void mover(int deltaX, int deltaY) {
        System.out.println("Movendo retângulo...");
    }

    @Override
    public void redimensionar(double fator) {
        System.out.println("Redimensionando retângulo...");
    }
}