//pacote ex_06 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex07;

//classe de excessao em conformidade com as especificacoes
public class VeicExistException extends Exception {

    Leitura l = new Leitura();
    //atributos\fields
    private boolean logPasseioOUcarga;
    private boolean logCadastraOUpesquisa;
    private boolean logRemove;
    private int opcaoMenu;

    //construtor
    VeicExistException() {
        log(this.opcaoMenu);

    }

    //construtor sobrecarregado
    public VeicExistException(String message) {
        super(message);
    }

    //getters e setters
    public void setEscolhido(int guardaEscolhidoMenu) {
        this.opcaoMenu = guardaEscolhidoMenu;
        log(guardaEscolhidoMenu);
    }

    public boolean isLogPasseioOUcarga() {
        return logPasseioOUcarga;
    }

    public boolean isLogCadastraOUpesquisa() {
        return logCadastraOUpesquisa;
    }

    public boolean isLogRemove() {
        return logRemove;
    }

    /************************************************************************************************
     *
     * dialog, relativo a entrada de dados invalidos.
     *
     *************************************************************************************************
     */
    public void atencao() {
        System.out.println("\t\t\t\t\t\t\t\t\tEntrada invalida para campo.");
        l.entDados("\t\t\t\t\tTecle <ENTER> para abandonar e reiniciar a entrada de dados.");
    }
    //Fim de public void atencao()

    /************************************************************************************************
     *
     * relacionado a carregar um log, relativo a escolha no menu.
     *
     *************************************************************************************************
     */
    public void log(int log) {
        switch (log) {
            case 1 -> {
                this.logPasseioOUcarga = true;
                this.logCadastraOUpesquisa = true;
                this.logRemove = false;
            }
            case 2 -> {
                this.logPasseioOUcarga = false;
                this.logCadastraOUpesquisa = true;
                this.logRemove = false;
            }
            case 3 -> {
                this.logPasseioOUcarga = true;
                this.logRemove = false;
            }
            case 4 -> {
                this.logPasseioOUcarga = false;
                this.logRemove = false;
            }
            case 5 -> {
                this.logPasseioOUcarga = true;
                this.logCadastraOUpesquisa = false;
                this.logRemove = false;
            }
            case 6 -> {
                this.logPasseioOUcarga = false;
                this.logCadastraOUpesquisa = false;
                this.logRemove = false;
            }
            case 7 -> {
                this.logPasseioOUcarga = true;
                this.logRemove = true;
            }
            case 8 -> {
                this.logPasseioOUcarga = false;
                this.logRemove = true;
            }
            case 9 -> {
                System.out.print("\t\t\t\t\t\t\t\t\t THE END...............\n");
            }
        }
    }
//Fim de public void log(int log)

    /************************************************************************************************
     *
     * relacionado a validar a entrada de dados para Placa.
     *
     *************************************************************************************************
     */
    public boolean validaPlaca(String placa) {
        boolean avaliacao = false;

//      se a entrada da placa esta no formato certo, nao aciona a excesao.
//      caso contrario, chama a excessao....
        System.out.println();
        char[] controle = new char[8];
        char cChar;
        int iInt, nInt;

        try {
            // tamanho da string (qtde de caracteres)
            nInt = placa.length();
            for (iInt = 0; iInt < nInt; iInt++) {
                // i-ésimo caractere da string
                cChar = placa.charAt(iInt);
                if (!Character.isJavaIdentifierPart(cChar)) break;
                if (Character.isLetter(cChar)) {
                    controle[iInt] = 'l';
                }
                // verificando se é um caractere numérico
                else if (Character.isDigit(cChar)) {
                    controle[iInt] = 'n';
                }
            }
        } catch (Exception e) {
            System.out.println("Formato desconhecido!...........");
        }
        if (controle[0] == 'l') {
            if (controle[1] == 'l') {
                if (controle[2] == 'l') {
                    if (controle[3] == 'n') {
                        if (controle[4] == 'n') {
                            if (controle[5] == 'n') {
                                if (controle[6] == 'n') {
                                    avaliacao = true;
                                }
                            }
                        }
                    }
                }
            }

        }
        if (!avaliacao) atencao();
        return avaliacao;
    }
    //Fim de public boolean validaPlaca(String placa)
}
//Fim da classe