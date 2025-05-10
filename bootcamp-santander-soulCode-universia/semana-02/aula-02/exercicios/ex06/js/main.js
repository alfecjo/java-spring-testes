function converterParaFahrenheit() {
    // Obter o valor em Celsius
    let temperaturaCelsius = parseFloat(document.getElementById("celsius").value);

    // Verificar se o valor é válido
    if (isNaN(temperaturaCelsius)) {
        alert("Por favor, insira uma temperatura válida em Celsius.");
        return;
    }

    // Converter Celsius para Fahrenheit
    let temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

    // Exibir o resultado
    alert(temperaturaCelsius + " graus Celsius é igual a " + temperaturaFahrenheit.toFixed(2) + " graus Fahrenheit.");
}