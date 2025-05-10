package interfaces.Ex07;

public class Eletronico implements Produto {
    private String nome;
    private double preco;

    public Eletronico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularPreco() {        
        return preco * 1.2; // Por exemplo, uma margem de 20%
    }


    @Override
    public String obterDescricao() {
        return "Eletrônico: " + nome;
    }
}
