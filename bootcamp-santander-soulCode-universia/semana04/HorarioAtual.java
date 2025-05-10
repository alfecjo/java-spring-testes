package semana04;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HorarioAtual {

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Horário Atual: Crie um programa que utilize a classe LocalTime \npara imprimir a hora atual no formato \"HH:mm:ss\"?");
        System.out.println();

        try {
            LocalTime horaAtual = LocalTime.now();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

            String horaFormatada = horaAtual.format(formatter);
            System.out.println("Horário Atual: " + horaFormatada);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
