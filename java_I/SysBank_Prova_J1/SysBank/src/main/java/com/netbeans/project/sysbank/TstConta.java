package com.netbeans.project.sysbank;

public class TstConta {

    public static void main(String[] arg) throws NumException {
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        
        System.out.println("SAÍDA DE DADOS PESSOA JURÍDICA (PJ).");
//      Entrada de dados PJ
        try {
//          PJ numero da conta
            pessoaJuridica.setNumeroConta(-2);

        } catch (NumException numException) {
            numException.impMsg();
        }
//      PJ numero cnpj
        pessoaJuridica.setCnpj(115);
//      PJ rua
        pessoaJuridica.getEnder().setRua("rua 01");

//      Entrada de dados PF
//      PF cpf
        pessoaJuridica.getResponsavel().setCpf(25);
//      PF nome        
        pessoaJuridica.getResponsavel().setNome("João");

        System.out.print("PJ número da conta: ");
        System.out.print(pessoaJuridica.getNumeroConta());
        System.out.println();
        System.out.print("PJ número da conta é par ou ímpar: ");
        pessoaJuridica.validar();
        System.out.println();
        System.out.print("PJ cnpj: ");
        System.out.print(pessoaJuridica.getCnpj());
        System.out.println();
        System.out.print("PJ Rua: ");
        System.out.print(pessoaJuridica.getEnder().getRua());

        System.out.println("");
        System.out.println("");

        System.out.println("SAÍDA DE DADOS PESSOA FÍSICA (PF)");
        System.out.print("PF cpf: ");
        System.out.print(pessoaJuridica.getResponsavel().getCpf());
        System.out.println();
        System.out.print("PF se o cpf do responsável é válido ou inválido: ");
        pessoaJuridica.getResponsavel().verifDoc();
        System.out.println();
        System.out.print("PF nome: ");
        System.out.print(pessoaJuridica.getResponsavel().getNome());
        System.out.println();
        System.out.print("PF se o nome do responsável pela conta é válido ou inválido: ");
        pessoaJuridica.verifDoc();
    }
}
