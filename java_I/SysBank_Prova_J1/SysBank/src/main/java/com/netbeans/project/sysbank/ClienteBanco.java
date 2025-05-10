package com.netbeans.project.sysbank;

public abstract class ClienteBanco implements Verifica {

    private int numeroConta = 0;
    private String nome = "";
    private Endereco ender = new Endereco();

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) throws NumException {
/*
O seu método setNumeroConta: se valor informado for positivo, atribuirá este valor ao atributo
numeroConta, se não, deverá disparar uma exceção do tipo NumException;
*/
        if (numeroConta >= 0) {
            this.numeroConta = numeroConta;
        } else {
            throw new NumException();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnder() {
        return ender;
    }

    public void setEnder(Endereco ender) {
        this.ender = ender;
    }

    abstract void verifDoc();

}
