function calcularAnoNascimento() {
    // Obter o valor da idade
    let idade = parseInt(document.getElementById("idade").value);

    // Verificar se o valor é válido
    if (isNaN(idade) || idade <= 0) {
        alert("Por favor, insira uma idade válida.");
        return;
    }

    // Obter o ano atual
    let anoAtual = new Date().getFullYear();

    // Calcular o ano de nascimento
    let anoNascimento = anoAtual - idade;

    // Exibir o resultado
    document.getElementById("resultado").innerHTML = "Você nasceu em " + anoNascimento;
}