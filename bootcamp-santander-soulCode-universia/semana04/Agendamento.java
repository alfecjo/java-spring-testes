package semana04;

import java.time.LocalDate;
import java.util.Scanner;

public class Agendamento {
    private String nomePaciente;
    private LocalDate dataAgendamento;

    public Agendamento(String nomePaciente, LocalDate dataAgendamento) {
        this.nomePaciente = nomePaciente;
        this.dataAgendamento = dataAgendamento;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public void verificarEAtualizarData() {
        LocalDate dataAtual = LocalDate.now();

        if (dataAgendamento.isBefore(dataAtual)) {
            System.out.println("A data de agendamento já passou.");

            LocalDate novaData = dataAtual.plusDays(7);
            System.out.println("Nova data de agendamento: " + novaData);

            dataAgendamento = novaData;
        } else {
            System.out.println("Ainda não chegou a data de agendamento.");
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(
                "Crie um programa que recebe dados de um agendamento (data, nome do paciente) e\ncaso a data de agendamento tenha passado, defina uma nova data para o paciente?");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        System.out.print("Digite a data de agendamento (yyyy-MM-dd): ");
        String dataAgendamentoStr = scanner.nextLine();
        LocalDate dataAgendamento = LocalDate.parse(dataAgendamentoStr);

        Agendamento agendamento = new Agendamento(nomePaciente, dataAgendamento);
        agendamento.verificarEAtualizarData();

        System.out.println("Informações do agendamento:");
        System.out.println("Nome do paciente: " + agendamento.getNomePaciente());
        System.out.println("Data de agendamento: " + agendamento.getDataAgendamento());

        scanner.close();
    }
}