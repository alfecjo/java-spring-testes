package com.netbeans.project.sysbank;

public final class PessoaFisica extends ClienteBanco {

    private int cpf = 0;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    void verifDoc() {
        /*
        informará na tela a mensagem:
        Em PessoaFisica: se o valor informado para o atributo CPF está entre 10 e 20. “CPF válido”;       
        Caso o valor esteja fora desta escala,“CPF inválido”. 
         */
        if (this.cpf >= 10 && this.cpf <= 20) {
            System.out.print("CPF válido!");
        } else {
            System.out.print("CPF inválido!");
        }
    }

    @Override
    public void validar() {
        //verifica numero da conta e imprime na tela se este eh par ou impar...
        if (super.getNumeroConta() % 2 == 0) {
            System.out.println("PF Numero da conta positivo!");
        } else {
            System.out.println("PF Numero da conta negativo!");
        }
    }
}
