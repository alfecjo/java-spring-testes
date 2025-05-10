//pacote ex_01 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex02;

//classe que se relaciona com classe Motor
public abstract class Veiculo extends Motor {

    //Atributos da classe
    String placa = "";
    String marca = "";
    String modelo = "";
    String cor = "";
    float velMax = 0.0f;
    int qtdRodas = 0;
    Motor motor = null;

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

    //Construtor recebe argumentos e instancia referencia com null para a classe Motor internamente
    public Veiculo(String placa, String marca, String modelo, String cor, float velMax, int qtdRodas) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velMax = velMax;
        this.qtdRodas = qtdRodas;
        this.motor = new Motor();
    }

    //Construtor recebe argumentos, inclusive para a instancia de referencia para a classe Motor,
    // chamando seu construtor, o qual ja carrega valores
    public Veiculo(String placa, String marca, String modelo, String cor, float velMax, int qtdRodas, int qtdPist, int potencia) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velMax = velMax;
        this.qtdRodas = qtdRodas;
        this.motor = new Motor(qtdPist, potencia);
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

    //assinatura do metodo abstrato, o qual sera desenvolvida nas classes que herdam a classe Veiculo.
    public abstract float calcVel(float velocMax);

    //sobrescrita do metodo toString para imprimir o objeto pela classe filha.
    @Override
    public String toString() {

        System.out.println("Placa: " + this.placa + ".");
        System.out.println("Marca: " + this.marca + ".");
        System.out.println("Modelo: " + this.modelo + ".");
        System.out.println("Cor: " + this.cor + ".");
        System.out.println("Velocidade Maxima: " + this.velMax);
        System.out.println("Quantidade de rodas (+ step): " + this.qtdRodas + " unidades.");
        System.out.println("Quantidade de pistoes: " + this.motor.getQtdPist() + " unidades.");
        System.out.println("Potencia: " + this.motor.getPotencia() + " cv");

        return null;
    }
}
