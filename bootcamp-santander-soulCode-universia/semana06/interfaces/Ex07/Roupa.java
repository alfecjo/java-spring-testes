package interfaces.Ex07;

public class Roupa implements Produto {
    private String tamanho;
    private double preco;

    @Override
    public double calcularPreco() {
        return preco * 1.1;
    }

    public Roupa(String tamanho, double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public String obterDescricao() {
        return "Roupa: Tamanho " + tamanho;
    }
}
