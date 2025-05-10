package interfaces.Ex05;

public class Linha implements Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando linha...");
    }

    @Override
    public void mover(int deltaX, int deltaY) {
        System.out.println("Movendo linha...");
    }

    @Override
    public void redimensionar(double fator) {
        System.out.println("Redimensionando linha...");
    }
}