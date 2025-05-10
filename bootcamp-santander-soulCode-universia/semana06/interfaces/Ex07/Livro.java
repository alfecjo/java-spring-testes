package interfaces.Ex07;

public class Livro implements Produto {
    private String titulo;
    private String autor;
    private double preco;

    @Override
    public double calcularPreco() {
        return preco * 1.15;
    }

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public String obterDescricao() {
        return "Livro: " + titulo + " (Autor: " + autor + ")";
    }
}
