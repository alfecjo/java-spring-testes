package com.netbeans.project.exerc09;

import javax.swing.JOptionPane;

public class VeicExistException extends Exception {

    VeicExistException() {
    }

    public VeicExistException(String message) {
        super(message);
    }

    public void atencao(String dlgInstrucao, String dlgTitulo, int dlgIcon) {
        JOptionPane.showMessageDialog(null, dlgInstrucao, dlgTitulo, 1);
    }
    
    public boolean validaPlaca(String placa) {
        boolean avaliacao = false;
        char[] controle = new char[8];
        char cChar;
        int iInt, nInt;
        nInt = placa.length();
        if (nInt == 7) {
            try {
                for (iInt = 0; iInt < nInt; iInt++) {
                    cChar = placa.charAt(iInt);
                    if (!Character.isJavaIdentifierPart(cChar)) {
                        break;
                    }
                    if (Character.isLetter(cChar)) {
                        controle[iInt] = 'l';
                    }
                    else if (Character.isDigit(cChar)) {
                        controle[iInt] = 'n';
                    }
                }
            } catch (Exception e) {
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
        }
        return avaliacao;
    }

    public boolean validaCampoNumerico(String campo) {
        boolean avaliacao = false;
        char cChar;
        // tamanho da string (qtde de caracteres)
        for (int i = 0; i < campo.length(); i++) {
            // i-Ã©simo caractere da string
            cChar = campo.charAt(i);
            if (!Character.isJavaIdentifierPart(cChar)) {
                break;
            }
            if (Character.isLetter(cChar)) {
                break;
            }
            // verificando se Ã© um caractere numÃ©rico
            if (Character.isDigit(cChar)) {
                avaliacao = true;
            }
        }
        return avaliacao;
    }
}
