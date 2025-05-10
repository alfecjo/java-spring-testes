function identificarDia() {
    const inputDia = document.getElementById('dia').value;
    const resultadoElement = document.getElementById('resultado');

    let mensagem;

    switch (parseInt(inputDia)) {
        case 0:
            mensagem = 'Domingo';
            break;
        case 1:
            mensagem = 'Segunda-feira';
            break;
        case 2:
            mensagem = 'Terça-feira';
            break;
        case 3:
            mensagem = 'Quarta-feira';
            break;
        case 4:
            mensagem = 'Quinta-feira';
            break;
        case 5:
            mensagem = 'Sexta-feira';
            break;
        case 6:
            mensagem = 'Sábado';
            break;
        default:
            mensagem = 'Número inválido. Digite um número de 0 a 6.';
            break;
    }

    resultadoElement.textContent = mensagem;
}