//pacote ex_06 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex07;

//classe de excessoes em conformidade com as especificacoes
public class VelocException extends Exception{

    //construtor
    public VelocException(String message) {
        super(message);
    }
}
//Fim da classe