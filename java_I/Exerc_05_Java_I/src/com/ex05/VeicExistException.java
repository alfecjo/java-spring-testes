
package com.ex05;

public class VeicExistException extends Exception{

    Leitura l = new Leitura();
    private boolean logPasseioOUcarga ;
    private boolean logCadastraOUpesquisa;
    private int opcaoMenu;

    VeicExistException() {
        log(this.opcaoMenu);

    }

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

    public void atencao() {
        System.out.println("\t\t\t\t\t\t\t\t\tEntrada invalida para campo.");
        l.entDados("\t\t\t\t\tTecle <ENTER> para abandonar e reiniciar a entrada de dados.");
    }

    public void log(int log) {
        switch (log) {
            case 1 -> {
                this.logPasseioOUcarga = true;
                this.logCadastraOUpesquisa = true;
//                System.out.print("\t\t\t\t\t\t\t\t CADASTRO PASSEIO \t\t\t\t\n");
            }
            case 2 -> {
                logPasseioOUcarga = false;
                logCadastraOUpesquisa = true;
//                System.out.print("\t\t\t\t\t\t\t\t CADASTRO CARGA \t\t\t\t\t\n");
            }
            case 3 -> {
                logPasseioOUcarga = true;
//                System.out.print("\t\t\t\t\t\t\t\t IMPRESSAO GERAL PASSEIO \t\t\t\n");
            }
            case 4 -> {
                logPasseioOUcarga = false;
//                System.out.print("\t\t\t\t\t\t\t\t IMPRESSAO GERAL CARGA \t\t\t\n");
            }
            case 5 -> {
                logPasseioOUcarga = true;
                logCadastraOUpesquisa = false;
//                System.out.print("\t\t\t\t\t\t\t\t IMPRESSAO PASSEIO \t\n");
            }
            case 6 -> {
                logPasseioOUcarga = false;
                logCadastraOUpesquisa = false;
//                System.out.print("\t\t\t\t\t\t\t\t IMPRESSAO CARGA \t\t\n");
            }
            case 7 -> {
//                System.out.print("\t\t\t\t\t\t\t\t THE END... \t\t\t\t\t\t\n");
            }
        }
    }

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
                if (!Character.isJavaIdentifierPart(cChar))break;
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
        if (!avaliacao)  atencao();
        return avaliacao;
    }
}
