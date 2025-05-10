//pacote ex_02 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex04;

//Declaracao da classe, extendida a heranca.
public final class Passeio extends Veiculo implements Calcular {

    //Atributos da classe
    private int qtdPassageiros;

    //Sobrecarga de construtores.
    //Construtor default zera atributos.
    public Passeio() {
        super();
        this.qtdPassageiros = 0;
    }


    //getter & setter relativo aos atributos da classe.
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    //desenvolvimento do metodo abstract herdado da classe mae Veiculo.
    @Override
    public float calcVel(float velocMax_mH) {
        return (float) (velocMax_mH * (Math.pow(10,3)));
    }

    //desenvolvimento do metodo contratado da interface Calcular.
    @Override
    public int calcular() {

        int somaLetras=0;

        somaLetras+=getPlaca().length();
        somaLetras+=getMarca().length();
        somaLetras+=getModelo().length();
        somaLetras+=getCor().length();

        return somaLetras;
    }
}