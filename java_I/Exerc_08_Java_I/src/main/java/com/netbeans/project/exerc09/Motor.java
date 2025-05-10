
package com.netbeans.project.exerc09;


//Declaracao da classe.
public class Motor {

    //Atributos da classe
    private int qtdPist;
    private int potencia;

    //Sobrecarga de construtores.
    //Construtor default zera atributos.
    public Motor() {
        this.qtdPist = 0;
        this.potencia = 0;
    }

    //getters & setters relativo aos atributos da classe.
    public int getQtdPist() {
        return qtdPist;
    }

    public final void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public int getPotencia() {
        return potencia;
    }

    public final void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
//Fim da classe