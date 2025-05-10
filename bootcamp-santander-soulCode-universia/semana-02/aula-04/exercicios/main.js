// cada function em ordem crescente pertence a um de01-a-10.html
function verificarNumero() {
    const inputNumero = document.getElementById('numero').value;
    const resultadoElement = document.getElementById('resultado');

    const numero = parseFloat(inputNumero);

    if (isNaN(numero)) {
        resultadoElement.textContent = 'Por favor, digite um número válido.';
    } else {
        if (numero > 0) {
            resultadoElement.textContent = 'O número é positivo.';
        } else if (numero < 0) {
            resultadoElement.textContent = 'O número é negativo.';
        } else {
            resultadoElement.textContent = 'O número é zero.';
        }
    }
}

function verificarParOuImpar() {
    const inputNumero = document.getElementById('numero').value;
    const resultadoElement = document.getElementById('resultado');

    const numero = parseInt(inputNumero);

    if (isNaN(numero)) {
        resultadoElement.textContent = 'Por favor, digite um número válido.';
    } else {
        if (numero % 2 === 0) {
            resultadoElement.textContent = 'O número é par.';
        } else {
            resultadoElement.textContent = 'O número é ímpar.';
        }
    }
}

function calcularResultado() {
    const inputNumero1 = document.getElementById('numero1').value;
    const inputNumero2 = document.getElementById('numero2').value;
    const operacao = document.getElementById('operacao').value;
    const resultadoElement = document.getElementById('resultado');

    const numero1 = parseFloat(inputNumero1);
    const numero2 = parseFloat(inputNumero2);

    if (isNaN(numero1) || isNaN(numero2)) {
        resultadoElement.textContent = 'Por favor, digite números válidos.';
    } else {
        let resultado;

        switch (operacao) {
            case 'soma':
                resultado = numero1 + numero2;
                break;
            case 'subtracao':
                resultado = numero1 - numero2;
                break;
            case 'multiplicacao':
                resultado = numero1 * numero2;
                break;
            case 'divisao':
                if (numero2 !== 0) {
                    resultado = numero1 / numero2;
                } else {
                    resultadoElement.textContent = 'Não é possível dividir por zero.';
                    return;
                }
                break;
            default:
                resultadoElement.textContent = 'Operação inválida.';
                return;
        }

        resultadoElement.textContent = `Resultado: ${resultado}`;
    }
}

function determinarCategoria() {
    const inputIdade = document.getElementById('idade').value;
    const categoriaElement = document.getElementById('categoria');

    const idade = parseInt(inputIdade);

    if (isNaN(idade)) {
        categoriaElement.textContent = 'Por favor, digite uma idade válida.';
    } else {
        let categoria;

        if (idade >= 0 && idade <= 10) {
            categoria = 'Criança';
        } else if (idade >= 11 && idade <= 17) {
            categoria = 'Adolescente';
        } else if (idade >= 18 && idade <= 60) {
            categoria = 'Adulto';
        } else {
            categoria = 'Melhor Idade';
        }

        categoriaElement.textContent = `Categoria: ${categoria}`;
    }
}

function converterNota() {
    const inputNota = document.getElementById('nota').value;
    const conceitoElement = document.getElementById('conceito');

    const nota = parseFloat(inputNota);

    if (isNaN(nota) || nota < 0 || nota > 10) {
        conceitoElement.textContent = 'Por favor, digite uma nota válida entre 0 e 10.';
    } else {
        let conceito;

        if (nota >= 9 && nota <= 10) {
            conceito = 'A';
        } else if (nota >= 7 && nota < 9) {
            conceito = 'B';
        } else if (nota >= 5 && nota < 7) {
            conceito = 'C';
        } else if (nota >= 3 && nota < 5) {
            conceito = 'D';
        } else {
            conceito = 'F';
        }

        conceitoElement.textContent = `Conceito: ${conceito}`;
    }
}

function calcularDesconto() {
    const inputPreco = document.getElementById('preco').value;
    const inputDesconto = document.getElementById('desconto').value;
    const valorFinalElement = document.getElementById('valorFinal');

    const preco = parseFloat(inputPreco);
    const desconto = parseFloat(inputDesconto);

    if (isNaN(preco) || isNaN(desconto) || preco < 0 || desconto < 0) {
        valorFinalElement.textContent = 'Por favor, digite valores válidos.';
    } else {
        const valorComDesconto = preco - (preco * (desconto / 100));
        valorFinalElement.textContent = `Valor final com desconto: R$ ${valorComDesconto.toFixed(2)}`;
    }
}

function verificarTriangulo() {
    const lado1 = parseFloat(document.getElementById('lado1').value);
    const lado2 = parseFloat(document.getElementById('lado2').value);
    const lado3 = parseFloat(document.getElementById('lado3').value);
    const resultadoElement = document.getElementById('resultado');

    if (isNaN(lado1) || isNaN(lado2) || isNaN(lado3) || lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
        resultadoElement.textContent = 'Por favor, digite valores válidos para os lados.';
    } else {
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 === lado2 && lado2 === lado3) {
                resultadoElement.textContent = 'É um triângulo equilátero.';
            } else if (lado1 === lado2 || lado1 === lado3 || lado2 === lado3) {
                resultadoElement.textContent = 'É um triângulo isósceles.';
            } else {
                resultadoElement.textContent = 'É um triângulo escaleno.';
            }
        } else {
            resultadoElement.textContent = 'Os lados informados não formam um triângulo.';
        }
    }
}

function verificarAno() {
    const ano = parseInt(document.getElementById('ano').value);
    const resultadoElement = document.getElementById('resultado');

    if (isNaN(ano) || ano <= 0) {
        resultadoElement.textContent = 'Por favor, digite um ano válido.';
    } else {
        if ((ano % 4 === 0 && ano % 100 !== 0) || ano % 400 === 0) {
            resultadoElement.textContent = `${ano} é um ano bissexto.`;
        } else {
            resultadoElement.textContent = `${ano} não é um ano bissexto.`;
        }
    }
}

const numeroSecreto = Math.floor(Math.random() * 100) + 1;
let tentativas = 0;

function verificarAdivinhacao() {
    const palpite = parseInt(document.getElementById('guess').value);
    const dicaElement = document.getElementById('dica');

    if (isNaN(palpite) || palpite < 1 || palpite > 100) {
        dicaElement.textContent = 'Por favor, digite um número válido entre 1 e 100.';
    } else {
        tentativas++;

        if (palpite === numeroSecreto) {
            dicaElement.textContent = `Parabéns! Você acertou em ${tentativas} tentativas.`;
        } else if (palpite < numeroSecreto) {
            dicaElement.textContent = 'Tente um número maior.';
        } else {
            dicaElement.textContent = 'Tente um número menor.';
        }
    }
}

function verificarEmprestimo() {
    const renda = parseFloat(document.getElementById('renda').value);
    const idade = parseInt(document.getElementById('idade').value);
    const historicoCredito = document.getElementById('historicoCredito').value.toLowerCase();
    const resultadoElement = document.getElementById('resultado');

    if (isNaN(renda) || isNaN(idade)) {
        resultadoElement.textContent = 'Por favor, digite valores válidos.';
    } else {
        if ((renda >= 1000 && idade >= 21 && idade <= 55 && historicoCredito === 'bom') ||
            (renda < 1000 && idade >= 21 && idade <= 55 && historicoCredito === 'bom') ||
            (renda > 1000 && idade > 55 && historicoCredito === 'bom')) {
            resultadoElement.textContent = 'Parabéns! Você é elegível para o empréstimo.';
        } else {
            resultadoElement.textContent = 'Desculpe, você não é elegível para o empréstimo.';
        }
    }
}