//pacote ex_02 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex02;

//Declaracao da classe, extendida a heranca
public final class Carga extends Veiculo {

    //Atributos da classe
    private int cargaMax = 0;
    private int tara = 0;

    //Sobrecarga de construtores.
    //Construtor default zera atributos.
    public Carga() {
        this.cargaMax = 0;
        this.tara = 0;
    }

    //Construtor com atributos proprios da classe.
    public Carga(int cargaMax, int tara) {
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    //Construtor com atributos proprios da classe, mais, atributos da classe mae Veiculo.
    public Carga(String placa, String marca, String modelo, String cor, float velMax, int qtdRodas,
                 int cargaMax, int tara) {
        super(placa, marca, modelo, cor, velMax, qtdRodas);
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    //Construtor com atributos proprios da classe, mais, atributos da classe mae Veiculo e os atributos do relacionamento da classe Veiculo com a classe Motor.
    public Carga(String placa, String marca, String modelo, String cor, float velMax, int qtdRodas,
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

    //desenvolvimento do metodo herdado da classe mae Veiculo.
    @Override
    public float calcVel(float velocMax) {
        return 0;
    }

    //sobrescrita do metodo toString para imprimir o objeto pela classe filha.
    @Override
    public String toString() {

        //chamada de toString da super classe.
        super.toString();
        System.out.println("Carga Maxima: " + this.cargaMax + " Ton.");
        System.out.println("Tara: " + this.tara + " Ton.");

        return null;

    }
}
