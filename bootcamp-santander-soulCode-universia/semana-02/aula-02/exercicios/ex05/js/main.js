function converterParaMilimetros() {
    // Obter o valor em metros
    let valorEmMetros = parseFloat(document.getElementById("metros").value);

    // Verificar se o valor é válido
    if (isNaN(valorEmMetros) || valorEmMetros < 0) {
        alert("Por favor, insira um valor válido em metros.");
        return;
    }

    // Converter metros para milímetros
    let valorEmMilimetros = valorEmMetros * 1000;

    // Exibir o resultado no console
    console.log("Resultado da conversão: " + valorEmMetros + " metro(s) é igual a " + valorEmMilimetros + " milímetros.");
}