let idade = prompt("Digite a idade:");

// Verifica se a entrada é um número
if (isNaN(idade)) {
    console.log("Por favor, digite um número válido.");
} else {
    idade = parseInt(idade);

    // Limita a idade a um valor máximo de 100 anos
    if (idade > 100) {
        console.log("Por favor, digite uma idade menor ou igual a 100 anos.");
    } else if (idade < 2) {
        console.log("bebê");
    } else if (idade < 12) {
        console.log("criança");
    } else if (idade < 18) {
        console.log("adolescente");
    } else if (idade < 60) {
        console.log("adulto");
    } else {
        console.log("melhor idade");
    }
}

