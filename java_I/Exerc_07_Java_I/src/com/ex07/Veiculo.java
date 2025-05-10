//pacote ex_06 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex07;

//classe que se relaciona com classe Motor
public abstract class Veiculo {

    private final Motor motor;
    //Atributos da classe
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int qtdRodas;
    private float velMax;

    //Sobrecarga de construtores
    //Construtor padrao
    public Veiculo() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.velMax = 0.0f;
        this.qtdRodas = 0;
        this.motor = new Motor();
    }

    //getters & setters para todos os argumentos, inclusive Motor
    public String getPlaca() {
        return placa;
    }

    public final void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public final void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public final void setCor(String cor) {
        this.cor = cor;
    }

    public float getVelMax() {
        return velMax;
    }

    public final void setVelMax(float velMax) {
        this.velMax = velMax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public final void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public Motor getMotor() {
        return motor;
    }

    //assinatura do metodo abstrato, o qual, tem seu desenvolvimento obrigatorio nas classes que herdam a classe Veiculo.
    public abstract float calcVel(float velocMax);
}
//Fim da classe