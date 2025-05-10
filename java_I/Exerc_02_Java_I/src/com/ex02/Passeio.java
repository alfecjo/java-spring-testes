//pacote ex_02 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex02;

//Declaracao da classe, extendida a heranca.
public final class Passeio extends Veiculo {

    //Atributos da classe
    private int qtdPassageiros = 0;

    //Sobrecarga de construtores.
    //Construtor default zera atributos.
    public Passeio() {
        this.qtdPassageiros = 0;
    }

    //Construtor com atributos proprios da classe.
    public Passeio(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    //Construtor com atributos proprios da classe, mais, atributos da classe mae Veiculo.
    public Passeio(String placa, String marca, String modelo, String cor, float velMax, int qtdRodas, int qtdPassageiros) {
        super(placa, marca, modelo, cor, velMax, qtdRodas);
        this.qtdPassageiros = qtdPassageiros;
    }

    //Construtor com atributos proprios da classe, mais, atributos da classe mae Veiculo e os atributos do
    // relacionamento da classe Veiculo com a classe Motor.
    public Passeio(String placa, String marca, String modelo, String cor, float velMax, int qtdRodas,
                   int qtdPassageiros, int qtdPist, int potencia) {
        super(placa, marca, modelo, cor, velMax, qtdRodas, qtdPist, potencia);
        this.qtdPassageiros = qtdPassageiros;
    }

    //getters & setters relativo aos atributos da classe.
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
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
        System.out.println("Quantidade de Passageiros: " + qtdPassageiros + " pessoas.");

        return null;

    }
}
