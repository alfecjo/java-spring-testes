//pacote ex_02 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex03;

import java.math.BigDecimal;

//Declaracao da classe, extendida a heranca
public final class Carga extends Veiculo {

    //Atributos da classe
    private int cargaMax;
    private int tara;


    //Sobrecarga de construtores.
    //Construtor default zera atributos.
    public Carga() {
        this.cargaMax = 0;
        this.tara = 0;
    }

    //Construtor com atributos proprios da classe.
    public Carga(Veiculo veiculo, int cargaMax, int tara) {
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    //Construtor com atributos proprios da classe, mais, atributos da classe mae Veiculo.
    public Carga(Veiculo veiculo, String placa, String marca, String modelo, String cor, float velMax, int qtdRodas,
                 int cargaMax, int tara) {
        super(placa, marca, modelo, cor, velMax, qtdRodas);
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    //Construtor com atributos proprios da classe, mais, atributos da classe mae Veiculo e os atributos do relacionamento da classe Veiculo com a classe Motor.
    public Carga(Veiculo veiculo, String placa, String marca, String modelo, String cor, float velMax, int qtdRodas,
                 int cargaMax, int tara, int qtdPist, int potencia) {
        super(placa, marca, modelo, cor, velMax, qtdRodas, qtdPist, potencia);
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    //getters & setters relativo aos atributos da classe.
    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    //desenvolvimento do metodo abstract herdado da classe mae Veiculo.
    @Override
    public float calcVel(float velocMax) {
        return (float) (velocMax * (Math.pow(10, 5)));
    }

    //sobrescrita do metodo toString para imprimir o objeto pela classe filha.
    @Override
    public String toString() {

        //chamada de toString da super classe.
        super.toString();
        System.out.println("Velocidade Maxima: " + BigDecimal.valueOf(this.calcVel(this.getVelMax())).toPlainString() +
                " centimeter/hour.");
        System.out.println("Carga Maxima: " + this.getCargaMax() + " Ton.");
        System.out.println("Tara: " + this.getTara() + " Ton.");

        return null;

    }
}
