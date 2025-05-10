package com.netbeans.project.sysbank;

public class NumException extends Exception {

    public void impMsg() {
        System.out.println("ERRO: não pode haver número negativo para conta!");
    }
}
