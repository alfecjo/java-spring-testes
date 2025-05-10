function calcularIMC() {
    // Obter os valores de peso e altura
    let peso = parseFloat(document.getElementById("peso").value);
    let altura = parseFloat(document.getElementById("altura").value);

    // Verificar se os valores são válidos
    if (isNaN(peso) || isNaN(altura) || altura <= 0) {
        alert("Por favor, insira valores válidos para peso e altura.");
        return;
    }

    // Calcular o IMC
    let imc = peso / Math.pow(altura, 2);

    // Exibir o resultado
    document.getElementById("resultado").innerHTML = "Seu IMC é: " + imc.toFixed(2);
}