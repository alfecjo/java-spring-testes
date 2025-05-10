function calcularPrecoVenda() {
    // Obter o valor do custo original
    let custoOriginal = parseFloat(document.getElementById("custoOriginal").value);

    // Verificar se o valor é válido
    if (isNaN(custoOriginal) || custoOriginal <= 0) {
        alert("Por favor, insira um custo original válido.");
        return;
    }

    // Calcular o preço de venda com desconto de 25%
    let desconto = 0.25;
    let precoVenda = custoOriginal * (1 - desconto);

    // Exibir o resultado
    document.getElementById("resultado").innerHTML = "Preço de venda: R$" + precoVenda.toFixed(2);
}