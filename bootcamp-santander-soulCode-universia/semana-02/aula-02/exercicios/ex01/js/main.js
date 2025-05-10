function calcularMedia() {
    // Obter os valores das notas
    let nota1 = parseFloat(document.getElementById("nota1").value);
    let nota2 = parseFloat(document.getElementById("nota2").value);
    let nota3 = parseFloat(document.getElementById("nota3").value);

    // Verificar se as notas são válidas
    if (isNaN(nota1) || isNaN(nota2) || isNaN(nota3)) {
        alert("Por favor, insira valores numéricos para todas as notas.");
        return;
    }

    // Calcular a média
    let media = (nota1 + nota2 + nota3) / 3;

    // Exibir o resultado
    document.getElementById("resultado").innerHTML = "Média: " + media.toFixed(2);
}