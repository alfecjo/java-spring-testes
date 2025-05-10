//pacote ex_02 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex03;

//Declaracao da classe, extendida a heranca.
public final class Passeio extends Veiculo {

    //Atributos da classe
    private int qtdPassageiros;

    //Sobrecarga de construtores.
    //Construtor default zera atributos.
    public Passeio() {
        this.qtdPassageiros = 0;
    }

    //Construtor com atributos proprios da classe.
    public Passeio(Veiculo veiculo, int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    //Construtor com atributos proprios da classe, mais, atributos da classe mae Veiculo.
    public Passeio(Veiculo veiculo,String placa, String marca, String modelo, String cor, float velMax, int qtdRodas, int qtdPassageiros) {
        super(placa, marca, modelo, cor, velMax, qtdRodas);
        this.qtdPassageiros = qtdPassageiros;
    }

    //Construtor com atributos proprios da classe, mais, atributos da classe mae Veiculo e os atributos do
    // relacionamento da classe Veiculo com a classe Motor.
    public Passeio(Veiculo veiculo,String placa, String marca, String modelo, String cor, float velMax, int qtdRodas,
                   int qtdPassageiros, int qtdPist, int potencia) {
        super(placa, marca, modelo, cor, velMax, qtdRodas, qtdPist, potencia);
        this.qtdPassageiros = qtdPassageiros;
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
    public float calcVel(float velocMax) {
        float velMax_mh = (float) (velocMax * (Math.pow(10,3)));
        return velMax_mh;
    }

    //sobrescrita do metodo toString para imprimir o objeto pela classe filha.
    @Override
    public String toString() {

        //chamada de toString da super classe.
        super.toString();
        System.out.println("Velocidade Maxima: " + this.calcVel(this.getVelMax())+ " meter/hour.");
        System.out.println("Quantidade de Passageiros: " + this.getQtdPassageiros() + " pessoas.");

        return null;
    }
}