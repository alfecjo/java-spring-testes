function alterarParagrafo() {
    //Obtendo o elemento pelo ID
    let paragrafo = document.getElementById('meuParagrafo');
    // Alterando o conteúdo do parágrafo
    paragrafo.textContent = "Texto alterado via JavaScrip usando o getElementByID";
};

function alterarEstilo() {
    //Obtendo o elemento pelo ID
    let paragrafo = document.getElementById('meuParagrafo');
    // Modificar o estilo do parágrafo
    paragrafo.style.color = 'red';
    paragrafo.style.fontSize = '24px';
}