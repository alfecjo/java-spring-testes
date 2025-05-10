package com.netbeans.project.sysbank;

public final class PessoaJuridica extends ClienteBanco {

    private int cnpj = 0;
    private PessoaFisica responsavel = new PessoaFisica();

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaFisica getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    void verifDoc() {
        /*
        informará na tela a mensagem
        PessoaJuridica: se a quantidade de letras do nome do “responsavel” é maior que 30, “Nome inválido para Responsável”
        ...se não,  “Nome válido para Responsável”;
         */
// int somaLetras = 0;
//        somaLetras += getPlaca().length();

        if (this.getResponsavel().getNome().length() >= 1 && this.getResponsavel().getNome().length() <=30) {
            System.out.println("Nome válido para Responsável!");
        } else {
            System.out.println("Nome inválido para Responsável!");
        }

    }

    @Override
    public void validar() {
        //verifica numero da conta e imprime na tela se este eh par ou impar...
        if (super.getNumeroConta() % 2 == 0) {
            System.out.print("PJ Numero da conta par!");
        } else {
            System.out.print("PJ Numero da conta ímpar!");
        }
    }

}
