//pacote ex_01 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex01;

public class Motor {

    //Atributos da classe
    private int qtdPist = 0;
    private int potencia = 0;

    //Construtor padrao
    public Motor() {
        this.qtdPist = 0;
        this.potencia = 0;
    }

    //Construtor recebe argumentos
    public Motor(int qtdPist, int potencia) {
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }

    //getters & setters relativo aos atributos da classe
    public int getQtdPist() {
        return qtdPist;
    }

    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}

