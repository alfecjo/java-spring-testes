package com.ex05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Responsavel pela entrada de dados.
public class Leitura {
    public String entDados(String rotulo){

        System.out.println(rotulo);

        InputStreamReader tec = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(tec);

        String ret = "";

        try {
            ret = buff.readLine();
        } catch (IOException e) {
            System.out.println("System error");
        }
        return ret;
    }
}