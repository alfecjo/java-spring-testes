//pacote ex_02 - todas as classes do projeto estao contidas no mesmo pacote
package com.ex05;

//Declaracao da classe, extendida a heranca
public final class Carga extends Veiculo implements Calcular {

    //Atributos da classe
    private int cargaMax;
    private int tara;


    //Sobrecarga de construtores.
    //Construtor default zera atributos.
    public Carga() {
        super();
        this.cargaMax = 0;
        this.tara = 0;
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

    //desenvolvimento do metodo contratado da interface Calcular.
    @Override
    public int calcular() {
        float somaNum = 0;

        somaNum+=getMotor().getQtdPist();
        somaNum+=getMotor().getPotencia();
        somaNum+=getQtdRodas();
        somaNum+=getVelMax();
        somaNum+=getTara();
        somaNum+=getCargaMax();

        return (int) somaNum;
    }
}
