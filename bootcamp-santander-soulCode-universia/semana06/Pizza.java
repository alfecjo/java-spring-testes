package semana06;

import java.util.List;

enum TamanhoPizza {
    P(20), M(40), G(60), GG(80);

    private final double precoBase;

    TamanhoPizza(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getPrecoBase() {
        return precoBase;
    }
}

enum StatusPizza {
    PENDENTE, PRONTA, EM_COZIMENTO, ENTREGUE
}

public class Pizza {
    private TamanhoPizza tamanho;
    private List<String> sabores;
    private StatusPizza status;
    private boolean comBorda;

    public Pizza(TamanhoPizza tamanho, List<String> sabores, boolean comBorda) {
        this.tamanho = tamanho;
        this.sabores = sabores;
        this.comBorda = comBorda;
        this.status = StatusPizza.PENDENTE;
    }

    public void alterarStatus(StatusPizza novoStatus) {
        this.status = novoStatus;
    }

    public double calcularPrecoFinal() {
        double precoSaboresAdicionais = (sabores.size()-1) * 5;
        double precoBorda = comBorda ? 3 : 0;

        return tamanho.getPrecoBase() + precoSaboresAdicionais + precoBorda;
    }

    public String getDescricao() {
        StringBuilder descricao = new StringBuilder();
        descricao.append("Pizza ").append(tamanho).append(" com os seguintes sabores: ");
        
        for (String sabor : sabores) {
            descricao.append(sabor).append(", ");
        }

        if (comBorda) {
            descricao.append("com borda.");
        } else {
            descricao.append("sem borda.");
        }

        return descricao.toString();
    }
}
