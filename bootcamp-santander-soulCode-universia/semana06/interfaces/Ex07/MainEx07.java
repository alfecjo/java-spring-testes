package interfaces.Ex07;

public class MainEx07 {
    public static void main(String[] args) {
        Produto eletronico = new Eletronico("Smartphone", 800.0);
        Produto roupa = new Roupa("M", 50.0);
        Produto livro = new Livro("Java Programming", "John Doe", 30.0);

        exibirDetalhesProduto(eletronico);
        exibirDetalhesProduto(roupa);
        exibirDetalhesProduto(livro);
    }

    private static void exibirDetalhesProduto(Produto produto) {
        System.out.println("Descrição: " + produto.obterDescricao());
        System.out.println("Preço: $" + produto.calcularPreco());
        
        System.out.println();
    }
}
