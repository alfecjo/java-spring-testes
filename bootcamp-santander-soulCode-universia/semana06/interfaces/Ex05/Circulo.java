package interfaces.Ex05;

public class Circulo implements Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando circulos...");
    }

    @Override
    public void mover(int deltaX, int deltaY) {
        System.out.println("Movendo circulos...");
    }

    @Override
    public void redimensionar(double fator) {
        System.out.println("Redimensionando circulos...");
    }
}